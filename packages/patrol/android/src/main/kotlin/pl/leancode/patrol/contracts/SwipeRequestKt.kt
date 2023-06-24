//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.patrol.contracts;

@kotlin.jvm.JvmName("-initializeswipeRequest")
public inline fun swipeRequest(block: pl.leancode.patrol.contracts.SwipeRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.SwipeRequest =
  pl.leancode.patrol.contracts.SwipeRequestKt.Dsl._create(pl.leancode.patrol.contracts.Contracts.SwipeRequest.newBuilder()).apply { block() }._build()
public object SwipeRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: pl.leancode.patrol.contracts.Contracts.SwipeRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.patrol.contracts.Contracts.SwipeRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.patrol.contracts.Contracts.SwipeRequest = _builder.build()

    /**
     * <code>float startX = 1;</code>
     */
    public var startX: kotlin.Float
      @JvmName("getStartX")
      get() = _builder.getStartX()
      @JvmName("setStartX")
      set(value) {
        _builder.setStartX(value)
      }
    /**
     * <code>float startX = 1;</code>
     */
    public fun clearStartX() {
      _builder.clearStartX()
    }

    /**
     * <code>float startY = 2;</code>
     */
    public var startY: kotlin.Float
      @JvmName("getStartY")
      get() = _builder.getStartY()
      @JvmName("setStartY")
      set(value) {
        _builder.setStartY(value)
      }
    /**
     * <code>float startY = 2;</code>
     */
    public fun clearStartY() {
      _builder.clearStartY()
    }

    /**
     * <code>float endX = 3;</code>
     */
    public var endX: kotlin.Float
      @JvmName("getEndX")
      get() = _builder.getEndX()
      @JvmName("setEndX")
      set(value) {
        _builder.setEndX(value)
      }
    /**
     * <code>float endX = 3;</code>
     */
    public fun clearEndX() {
      _builder.clearEndX()
    }

    /**
     * <code>float endY = 4;</code>
     */
    public var endY: kotlin.Float
      @JvmName("getEndY")
      get() = _builder.getEndY()
      @JvmName("setEndY")
      set(value) {
        _builder.setEndY(value)
      }
    /**
     * <code>float endY = 4;</code>
     */
    public fun clearEndY() {
      _builder.clearEndY()
    }

    /**
     * <code>uint32 steps = 5;</code>
     */
    public var steps: kotlin.Int
      @JvmName("getSteps")
      get() = _builder.getSteps()
      @JvmName("setSteps")
      set(value) {
        _builder.setSteps(value)
      }
    /**
     * <code>uint32 steps = 5;</code>
     */
    public fun clearSteps() {
      _builder.clearSteps()
    }

    /**
     * <code>string appId = 6;</code>
     */
    public var appId: kotlin.String
      @JvmName("getAppId")
      get() = _builder.getAppId()
      @JvmName("setAppId")
      set(value) {
        _builder.setAppId(value)
      }
    /**
     * <code>string appId = 6;</code>
     */
    public fun clearAppId() {
      _builder.clearAppId()
    }
  }
}
public inline fun pl.leancode.patrol.contracts.Contracts.SwipeRequest.copy(block: pl.leancode.patrol.contracts.SwipeRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.SwipeRequest =
  pl.leancode.patrol.contracts.SwipeRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

