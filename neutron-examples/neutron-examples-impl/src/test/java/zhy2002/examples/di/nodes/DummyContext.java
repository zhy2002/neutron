package zhy2002.examples.di.nodes;


import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DummyContext {

    private final DummyChangeEngineImpl changeEngine;
    private final Lazy<DummyRootNode> rootNodeLazy;

    @Inject
    public DummyContext(DummyChangeEngineImpl changeEngine, Lazy<DummyRootNode> rootNodeLazy) {
        this.changeEngine = changeEngine;
        this.rootNodeLazy = rootNodeLazy;
    }

    public DummyChangeEngineImpl getChangeEngine() {
        return changeEngine;
    }

    public Lazy<DummyRootNode> getRootNodeLazy() {
        return rootNodeLazy;
    }
}
