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
public final class NoteHandler_Factory implements Factory<NoteHandler> {
  @Override
  public NoteHandler get() {
    return newInstance();
  }

  public static NoteHandler_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NoteHandler newInstance() {
    return new NoteHandler();
  }

  private static final class InstanceHolder {
    private static final NoteHandler_Factory INSTANCE = new NoteHandler_Factory();
  }
}
