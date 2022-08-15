package com.motionapps.sensorbox.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.motionapps.sensorbox.R

public class InfoSensorFragmentDirections private constructor() {
  public companion object {
    public fun actionNavInfoToNavHome(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_info_to_nav_home)

    public fun actionNavInfoToNavAdvanced(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_info_to_nav_advanced)
  }
}
