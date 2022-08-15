package com.motionapps.sensorbox.fragments.advanced

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.motionapps.sensorbox.R
import kotlin.Int
import kotlin.String

public class AdvancedFragmentDirections private constructor() {
  private data class HomeInfoAction(
    public val type: String
  ) : NavDirections {
    public override val actionId: Int = R.id.home_info_action

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("type", this.type)
        return result
      }
  }

  private data class ActionNavHomeToNavWearOsInfo(
    public val type: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_nav_home_to_nav_wear_os_info

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("type", this.type)
        return result
      }
  }

  private data class ActionNavAdvancedToPickFolderFragment(
    public val color: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_nav_advanced_to_pickFolderFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("color", this.color)
        return result
      }
  }

  public companion object {
    public fun actionAdvancedToPicker(): NavDirections =
        ActionOnlyNavDirections(R.id.action_advanced_to_picker)

    public fun homeInfoAction(type: String): NavDirections = HomeInfoAction(type)

    public fun actionNavHomeToNavWearOsInfo(type: String): NavDirections =
        ActionNavHomeToNavWearOsInfo(type)

    public fun actionNavAdvancedToPickFolderFragment(color: Int): NavDirections =
        ActionNavAdvancedToPickFolderFragment(color)
  }
}
