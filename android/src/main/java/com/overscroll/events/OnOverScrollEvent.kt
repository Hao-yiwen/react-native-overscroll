package com.overscroll.events

import com.facebook.react.bridge.WritableMap
import com.facebook.react.uimanager.events.Event
import com.facebook.react.uimanager.events.RCTEventEmitter

class OnOverScrollEvent(viewId: Int, private val mEventData: WritableMap) :
  Event<OnOverScrollEvent>(viewId) {
  companion object {
    const val EVENT_NAME = "onOverScroll"
  }

  override fun getEventName(): String {
    return EVENT_NAME
  }

  override fun canCoalesce(): Boolean {
    return false
  }

  override fun getCoalescingKey(): Short {
    return 0
  }

  override fun dispatch(rctEventEmitter: RCTEventEmitter) {
    rctEventEmitter.receiveEvent(viewTag, eventName, mEventData)
  }
}
