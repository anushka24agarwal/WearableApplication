package com.motionapps.sensorbox.fragments.advanced

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.motionapps.sensorbox.R
import kotlin.Boolean
import kotlin.Int

public class ExtraFragmentDirections private constructor() {
  private data class ActionExtraFragmentToCountersFragment(
    public val longMeasurement: Boolean
  ) : NavDirections {
    public override val actionId: Int = R.id.action_extraFragment_to_countersFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("longMeasurement", this.longMeasurement)
        return result
      }
  }

  public companion object {
    public fun actionExtraFragmentToCountersFragment(longMeasurement: Boolean): NavDirections =
        ActionExtraFragmentToCountersFragment(longMeasurement)

    public fun actionExtraFragmentToMeasurementPickerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_extraFragment_to_measurementPickerFragment)
  }
}
