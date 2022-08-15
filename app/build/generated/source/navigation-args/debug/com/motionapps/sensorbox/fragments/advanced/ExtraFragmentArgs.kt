package com.motionapps.sensorbox.fragments.advanced

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class ExtraFragmentArgs(
  public val typeMeasurement: Int = 1,
  public val firstTime: Int = -1,
  public val secondTime: Int = -1
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("typeMeasurement", this.typeMeasurement)
    result.putInt("firstTime", this.firstTime)
    result.putInt("secondTime", this.secondTime)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("typeMeasurement", this.typeMeasurement)
    result.set("firstTime", this.firstTime)
    result.set("secondTime", this.secondTime)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ExtraFragmentArgs {
      bundle.setClassLoader(ExtraFragmentArgs::class.java.classLoader)
      val __typeMeasurement : Int
      if (bundle.containsKey("typeMeasurement")) {
        __typeMeasurement = bundle.getInt("typeMeasurement")
      } else {
        __typeMeasurement = 1
      }
      val __firstTime : Int
      if (bundle.containsKey("firstTime")) {
        __firstTime = bundle.getInt("firstTime")
      } else {
        __firstTime = -1
      }
      val __secondTime : Int
      if (bundle.containsKey("secondTime")) {
        __secondTime = bundle.getInt("secondTime")
      } else {
        __secondTime = -1
      }
      return ExtraFragmentArgs(__typeMeasurement, __firstTime, __secondTime)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ExtraFragmentArgs {
      val __typeMeasurement : Int?
      if (savedStateHandle.contains("typeMeasurement")) {
        __typeMeasurement = savedStateHandle["typeMeasurement"]
        if (__typeMeasurement == null) {
          throw IllegalArgumentException("Argument \"typeMeasurement\" of type integer does not support null values")
        }
      } else {
        __typeMeasurement = 1
      }
      val __firstTime : Int?
      if (savedStateHandle.contains("firstTime")) {
        __firstTime = savedStateHandle["firstTime"]
        if (__firstTime == null) {
          throw IllegalArgumentException("Argument \"firstTime\" of type integer does not support null values")
        }
      } else {
        __firstTime = -1
      }
      val __secondTime : Int?
      if (savedStateHandle.contains("secondTime")) {
        __secondTime = savedStateHandle["secondTime"]
        if (__secondTime == null) {
          throw IllegalArgumentException("Argument \"secondTime\" of type integer does not support null values")
        }
      } else {
        __secondTime = -1
      }
      return ExtraFragmentArgs(__typeMeasurement, __firstTime, __secondTime)
    }
  }
}
