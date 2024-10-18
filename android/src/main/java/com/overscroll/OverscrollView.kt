package com.overscroll

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.facebook.react.uimanager.ThemedReactContext

class OverscrollView : FrameLayout {
  constructor(context: Context) : super(context)
  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
    context, attrs, defStyleAttr
  )

  var mBounce = false

  public fun getThemeReactContext(): ThemedReactContext {
    return this.context as ThemedReactContext
  }

  override fun addView(child: View?, index: Int) {
    if (childCount > 0) {
      throw IllegalStateException("OverscrollView can only host one direct child")
    }
    super.addView(child, index)

    if (mBounce) {

    }
  }

  public fun setBounce(bounce: Boolean) {
    mBounce = bounce
    if (mBounce) {
      setUpOverScroll(getChildAt(0))
    }
  }

  private fun setUpOverScroll(child: View?) {
    if (child != null) {

    }
  }
}
