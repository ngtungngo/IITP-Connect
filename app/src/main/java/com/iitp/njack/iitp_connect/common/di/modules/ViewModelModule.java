package com.iitp.njack.iitp_connect.common.di.modules;

import android.arch.lifecycle.ViewModelProvider;

import com.iitp.njack.iitp_connect.common.di.IITPConnectViewModelFactory;
import com.iitp.njack.iitp_connect.core.calendar.list.CodingCalendarViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(IITPConnectViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(CodingCalendarViewModel.class)
    public abstract CodingCalendarViewModel bindCodingCalendarViewModel(CodingCalendarViewModel codingCalendarViewModel);
}