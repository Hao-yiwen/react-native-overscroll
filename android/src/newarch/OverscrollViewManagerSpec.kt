package com.overscroll

import android.view.View

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.viewmanagers.OverscrollViewManagerDelegate
import com.facebook.react.viewmanagers.OverscrollViewManagerInterface

abstract class OverscrollViewManagerSpec<T : View> : SimpleViewManager<T>(), OverscrollViewManagerInterface<T> {
  private val mDelegate: ViewManagerDelegate<T>

  init {
    mDelegate = OverscrollViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<T>? {
    return mDelegate
  }
}
