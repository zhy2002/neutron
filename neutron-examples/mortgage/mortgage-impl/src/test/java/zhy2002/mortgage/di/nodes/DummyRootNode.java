package zhy2002.mortgage.di.nodes;


import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.HashSet;
import java.util.Set;

@Singleton
public class DummyRootNode {

    private final DummyContext context;
    @Inject
    DummyChangeEngine changeEngine;
    private final Set<Object> children = new HashSet<>();

    @Inject
    @Named("dummyMiddleANodeLazy1")
    Lazy<DummyMiddleANode> dummyMiddleANodeLazy1;

    @Inject
    @Named("dummyMiddleANodeLazy2")
    Lazy<DummyMiddleANode> dummyMiddleANodeLazy2;

    @Inject
    @Named("dummyMiddleBNodeLazy")
    Lazy<DummyMiddleBNode> dummyMiddleBNodeLazy;

    @Inject
    public DummyRootNode(DummyContext context) {
        this.context = context;
    }

    public DummyContext getContext() {
        return context;
    }

    public DummyChangeEngine getChangeEngine() {
        return changeEngine;
    }

    public Lazy<DummyMiddleANode> getDummyMiddleANodeLazy1() {
        return dummyMiddleANodeLazy1;
    }

    public Lazy<DummyMiddleANode> getDummyMiddleANodeLazy2() {
        return dummyMiddleANodeLazy2;
    }

    public Lazy<DummyMiddleBNode> getDummyMiddleBNodeLazy() {
        return dummyMiddleBNodeLazy;
    }

    public Set<Object> getChildren() {
        if (children.size() == 0) {
            children.add(getDummyMiddleANodeLazy1().get());
            children.add(getDummyMiddleANodeLazy2().get());
            children.add(getDummyMiddleBNodeLazy().get());
        }
        return children;
    }
}
