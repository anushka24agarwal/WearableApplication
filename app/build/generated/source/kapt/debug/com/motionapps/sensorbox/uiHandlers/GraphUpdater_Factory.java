// Generated by Dagger (https://dagger.dev).
package com.motionapps.sensorbox.uiHandlers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GraphUpdater_Factory implements Factory<GraphUpdater> {
  @Override
  public GraphUpdater get() {
    return newInstance();
  }

  public static GraphUpdater_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GraphUpdater newInstance() {
    return new GraphUpdater();
  }

  private static final class InstanceHolder {
    private static final GraphUpdater_Factory INSTANCE = new GraphUpdater_Factory();
  }
}
