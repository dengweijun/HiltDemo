package com.ben.hiltdemo.net;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

@InstallIn(ApplicationComponent.class)
//@InstallIn(ActivityComponent.class)
@Module
public class NetworkModule {

    // 一旦使用作用域，那么就必须跟他绑定的组件是同一作用域
    @Singleton
    @Provides
    // @Binds
    public ApiService provideApiService() {
        return new Retrofit.Builder()
                .baseUrl("https://www.baidu.com")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build()
                .create(ApiService.class);
    }

}
