package zhy2002.examples.di.nodes;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DummyChangeEngineImpl implements DummyChangeEngine {

    @Inject
    public DummyChangeEngineImpl() {}
}
