package pl.leancode.patrol

import android.os.ConditionVariable
import androidx.test.platform.app.InstrumentationRegistry
import org.http4k.core.ContentType
import org.http4k.filter.ServerFilters
import org.http4k.server.Http4kServer
import org.http4k.server.KtorCIO
import org.http4k.server.asServer

class PatrolServer {
    private val envPortKey = "PATROL_PORT"
    private val port: Int
    private var server: Http4kServer? = null
    private var automatorServer: AutomatorServer? = null

    init {
        port = arguments.getString(envPortKey)?.toInt() ?: 8081
    }

    private val arguments get() = InstrumentationRegistry.getArguments()

    fun start() {
        Logger.i("Starting server...")

        automatorServer = AutomatorServer(Automator.instance)
        server = automatorServer!!.router
            .withFilter(catcher)
            .withFilter(printer)
            .withFilter(ServerFilters.SetContentType(ContentType.TEXT_PLAIN))
            .asServer(KtorCIO(port))
            .start()

        Logger.i("Created and started PatrolServer, port: $port")

        Runtime.getRuntime().addShutdownHook(
            Thread {
                Logger.i("Stopping server...")
                server?.close()
                Logger.i("Server stopped")
            }
        )
    }

    companion object {
        val appReady: ConditionVariable = ConditionVariable()
    }
}

typealias DartTestResults = Map<String, String>
