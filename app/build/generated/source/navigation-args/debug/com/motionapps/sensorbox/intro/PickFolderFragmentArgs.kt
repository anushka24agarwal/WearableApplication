package com.motionapps.sensorbox.intro

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class PickFolderFragmentArgs(
  public val color: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("color", this.color)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("color", this.color)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PickFolderFragmentArgs {
      bundle.setClassLoader(PickFolderFragmentArgs::class.java.classLoader)
      val __color : Int
      if (bundle.containsKey("color")) {
        __color = bundle.getInt("color")
      } else {
        throw IllegalArgumentException("Required argument \"color\" is missing and does not have an android:defaultValue")
      }
      return PickFolderFragmentArgs(__color)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PickFolderFragmentArgs {
      val __color : Int?
      if (savedStateHandle.contains("color")) {
        __color = savedStateHandle["color"]
        if (__color == null) {
          throw IllegalArgumentException("Argument \"color\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"color\" is missing and does not have an android:defaultValue")
      }
      return PickFolderFragmentArgs(__color)
    }
  }
}
