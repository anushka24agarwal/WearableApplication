// Generated by Dagger (https://dagger.dev).
package com.motionapps.sensorbox.fragments.advanced.extrahandlers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AlarmHandler_Factory implements Factory<AlarmHandler> {
  @Override
  public AlarmHandler get() {
    return newInstance();
  }

  public static AlarmHandler_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AlarmHandler newInstance() {
    return new AlarmHandler();
  }

  private static final class InstanceHolder {
    private static final AlarmHandler_Factory INSTANCE = new AlarmHandler_Factory();
  }
}
