package zhy2002.examples.di;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
class MyModule {

    @Provides
    MyServiceProvider provideMyServiceProvider() {
        return new MyServiceProvider();
    }

    @Singleton
    @Provides
    MyOtherServiceProvider provideMyOtherServiceProvider() {
        return new MyOtherServiceProvider();
    }

}
