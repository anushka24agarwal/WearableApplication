package com.motionapps.sensorbox.fragments.advanced

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.motionapps.sensorbox.R
import kotlin.Int

public class CountersFragmentDirections private constructor() {
  private data class ActionCountersFragmentToExtraFragment(
    public val typeMeasurement: Int = 1,
    public val firstTime: Int = -1,
    public val secondTime: Int = -1
  ) : NavDirections {
    public override val actionId: Int = R.id.action_countersFragment_to_extraFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("typeMeasurement", this.typeMeasurement)
        result.putInt("firstTime", this.firstTime)
        result.putInt("secondTime", this.secondTime)
        return result
      }
  }

  public companion object {
    public fun actionCountersFragmentToMeasurementPickerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_countersFragment_to_measurementPickerFragment)

    public fun actionCountersFragmentToExtraFragment(
      typeMeasurement: Int = 1,
      firstTime: Int = -1,
      secondTime: Int = -1
    ): NavDirections = ActionCountersFragmentToExtraFragment(typeMeasurement, firstTime, secondTime)
  }
}
