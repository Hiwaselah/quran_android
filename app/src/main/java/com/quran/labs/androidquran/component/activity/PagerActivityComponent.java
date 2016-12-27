package com.quran.labs.androidquran.component.activity;

import com.quran.labs.androidquran.component.fragment.QuranPageComponent;
import com.quran.labs.androidquran.di.ActivityScope;
import com.quran.labs.androidquran.module.activity.PagerActivityModule;
import com.quran.labs.androidquran.ui.PagerActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = PagerActivityModule.class)
public interface PagerActivityComponent {
  // subcomponents
  QuranPageComponent.Builder quranPageComponentBuilder();

  void inject(PagerActivity pagerActivity);

  @Subcomponent.Builder interface Builder {
    PagerActivityComponent build();
  }
}
