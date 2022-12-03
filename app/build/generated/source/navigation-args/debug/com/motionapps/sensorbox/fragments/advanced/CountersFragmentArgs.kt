package com.motionapps.sensorbox.fragments.advanced

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.jvm.JvmStatic

public data class CountersFragmentArgs(
  public val longMeasurement: Boolean
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("longMeasurement", this.longMeasurement)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("longMeasurement", this.longMeasurement)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CountersFragmentArgs {
      bundle.setClassLoader(CountersFragmentArgs::class.java.classLoader)
      val __longMeasurement : Boolean
      if (bundle.containsKey("longMeasurement")) {
        __longMeasurement = bundle.getBoolean("longMeasurement")
      } else {
        throw IllegalArgumentException("Required argument \"longMeasurement\" is missing and does not have an android:defaultValue")
      }
      return CountersFragmentArgs(__longMeasurement)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CountersFragmentArgs {
      val __longMeasurement : Boolean?
      if (savedStateHandle.contains("longMeasurement")) {
        __longMeasurement = savedStateHandle["longMeasurement"]
        if (__longMeasurement == null) {
          throw IllegalArgumentException("Argument \"longMeasurement\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"longMeasurement\" is missing and does not have an android:defaultValue")
      }
      return CountersFragmentArgs(__longMeasurement)
    }
  }
}
