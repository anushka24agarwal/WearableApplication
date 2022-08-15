package com.motionapps.sensorbox.activities

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.motionapps.sensorbox.R

public class AboutDirections private constructor() {
  public companion object {
    public fun actionNavAboutToNavHome(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_about_to_nav_home)
  }
}
