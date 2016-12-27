package com.quran.labs.androidquran.component.fragment;

import com.quran.labs.androidquran.di.QuranPageScope;
import com.quran.labs.androidquran.module.fragment.QuranPageModule;
import com.quran.labs.androidquran.ui.fragment.QuranPageFragment;
import com.quran.labs.androidquran.ui.fragment.TabletFragment;

import dagger.Subcomponent;

@QuranPageScope
@Subcomponent(modules = QuranPageModule.class)
public interface QuranPageComponent {
  void inject(QuranPageFragment quranPageFragment);
  void inject(TabletFragment tabletFragment);

  @Subcomponent.Builder interface Builder {
    QuranPageComponent build();
  }
}
