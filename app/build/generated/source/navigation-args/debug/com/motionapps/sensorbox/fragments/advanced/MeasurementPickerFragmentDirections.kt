package com.motionapps.sensorbox.fragments.advanced

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.motionapps.sensorbox.R
import kotlin.Boolean
import kotlin.Int

public class MeasurementPickerFragmentDirections private constructor() {
  private data class ActionMeasurementPickerFragmentToCountersFragment(
    public val longMeasurement: Boolean
  ) : NavDirections {
    public override val actionId: Int = R.id.action_measurementPickerFragment_to_countersFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("longMeasurement", this.longMeasurement)
        return result
      }
  }

  private data class ActionMeasurementPickerFragmentToExtraFragment(
    public val typeMeasurement: Int = 1,
    public val firstTime: Int = -1,
    public val secondTime: Int = -1
  ) : NavDirections {
    public override val actionId: Int = R.id.action_measurementPickerFragment_to_extraFragment

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
    public fun actionPickerToAdvanced(): NavDirections =
        ActionOnlyNavDirections(R.id.action_picker_to_advanced)

    public fun actionMeasurementPickerFragmentToCountersFragment(longMeasurement: Boolean):
        NavDirections = ActionMeasurementPickerFragmentToCountersFragment(longMeasurement)

    public fun actionMeasurementPickerFragmentToExtraFragment(
      typeMeasurement: Int = 1,
      firstTime: Int = -1,
      secondTime: Int = -1
    ): NavDirections = ActionMeasurementPickerFragmentToExtraFragment(typeMeasurement, firstTime,
        secondTime)
  }
}
