package com.overscroll

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.common.MapBuilder
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

@ReactModule(name = OverscrollViewManager.NAME)
class OverscrollViewManager :
  OverscrollViewManagerSpec<OverscrollView>() {
  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): OverscrollView {
    return OverscrollView(context)
  }

  override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any>? {
    var export = super.getExportedCustomDirectEventTypeConstants();
    if (export == null) {
      export = MapBuilder.newHashMap();
    }
    return export;
  }

  companion object {
    const val NAME = "OverscrollView"
  }
}
