package com.rui.androidmvvmdemo.di.module;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.rui.androidmvvmdemo.di.viewmodel.MainViewModel;
import com.rui.androidmvvmdemo.ui.activity.MainActivity;
import com.rui.mvvm.dagger.modules.BaseActivityModule;
import com.rui.mvvm.dagger.scopes.ActivityScope;
import com.rui.mvvm.dagger.scopes.ViewModelScope;
import com.rui.mvvm.livedata.SingleLiveEvent;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

/**
 * Created by rui on 2019/2/12
 */
@Module(includes = BaseActivityModule.class)
public abstract class MainModule {

    @Provides
    static ObservableField<String> providesObservableFieldString() {
        return new ObservableField<String>();
    }

    @Provides
    static ObservableList<Fragment> providesObservableList() {
        return new ObservableArrayList<Fragment>();
    }

    @Provides
    static Subject<String> providesSubject() {
        return PublishSubject.create();
    }

    @Provides
    static SingleLiveEvent<Void> providesSingleLiveEventVoid() {
        return new SingleLiveEvent<Void>();
    }

    @Binds
    @IntoMap
    @ViewModelScope(MainViewModel.class)
    abstract ViewModel bindMainViewModel(MainViewModel mainViewModel);


    @Binds
    @ActivityScope
    abstract FragmentActivity activity(MainActivity activity);
}
