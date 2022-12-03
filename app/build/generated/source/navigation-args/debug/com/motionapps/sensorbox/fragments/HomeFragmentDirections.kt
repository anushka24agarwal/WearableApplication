package com.motionapps.sensorbox.fragments

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.motionapps.sensorbox.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
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

  private data class ActionNavHomeToPickFolderFragment(
    public val color: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_nav_home_to_pickFolderFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("color", this.color)
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

  private data class ActionNavHomeToPickFolderFragment2(
    public val color: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_nav_home_to_pickFolderFragment2

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("color", this.color)
        return result
      }
  }

  public companion object {
    public fun homeInfoAction(type: String): NavDirections = HomeInfoAction(type)

    public fun actionNavHomeToPickFolderFragment(color: Int): NavDirections =
        ActionNavHomeToPickFolderFragment(color)

    public fun actionNavHomeToNavAbout(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_home_to_nav_about)

    public fun actionNavHomeToNavWearOsInfo(type: String): NavDirections =
        ActionNavHomeToNavWearOsInfo(type)

    public fun actionNavHomeToPickFolderFragment2(color: Int): NavDirections =
        ActionNavHomeToPickFolderFragment2(color)
  }
}
