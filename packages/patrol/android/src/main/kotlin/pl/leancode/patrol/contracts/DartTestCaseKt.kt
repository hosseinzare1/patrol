//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.patrol.contracts;

@kotlin.jvm.JvmName("-initializedartTestCase")
public inline fun dartTestCase(block: pl.leancode.patrol.contracts.DartTestCaseKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.DartTestCase =
  pl.leancode.patrol.contracts.DartTestCaseKt.Dsl._create(pl.leancode.patrol.contracts.Contracts.DartTestCase.newBuilder()).apply { block() }._build()
public object DartTestCaseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: pl.leancode.patrol.contracts.Contracts.DartTestCase.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.patrol.contracts.Contracts.DartTestCase.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.patrol.contracts.Contracts.DartTestCase = _builder.build()

    /**
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }
  }
}
public inline fun pl.leancode.patrol.contracts.Contracts.DartTestCase.copy(block: pl.leancode.patrol.contracts.DartTestCaseKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.DartTestCase =
  pl.leancode.patrol.contracts.DartTestCaseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

