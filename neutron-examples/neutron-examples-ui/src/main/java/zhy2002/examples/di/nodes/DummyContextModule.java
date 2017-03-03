package zhy2002.examples.di.nodes;

import dagger.Binds;
import dagger.Module;

@Module
abstract class DummyContextModule {

    @Binds
    abstract DummyChangeEngine provideDummyChangeEngine(DummyChangeEngineImpl impl);
}
