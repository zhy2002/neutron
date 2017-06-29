package zhy2002.mortgage.di;

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
    MyOtherServiceProvider provideMyOtherServiceProvider(DbReader reader) {
        return new MyOtherServiceProvider(reader);
    }

}
