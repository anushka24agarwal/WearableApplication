package com.motionapps.sensorbox.fragments.settings

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.motionapps.sensorbox.R
import kotlin.Int

public class SettingsFragmentDirections private constructor() {
  private data class ActionNavSettingsToPickFolderFragment(
    public val color: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_nav_settings_to_pickFolderFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("color", this.color)
        return result
      }
  }

  public companion object {
    public fun actionNavSettingsToAnnotationFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_settings_to_annotationFragment)

    public fun actionNavSettingsToPickFolderFragment(color: Int): NavDirections =
        ActionNavSettingsToPickFolderFragment(color)
  }
}
