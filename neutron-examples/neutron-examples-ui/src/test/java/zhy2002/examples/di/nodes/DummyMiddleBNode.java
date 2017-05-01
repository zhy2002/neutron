package zhy2002.examples.di.nodes;

import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Named;

public class DummyMiddleBNode {

    private final DummyRootNode dummyRootNode;
    private final String name;

    @Inject
    @Named("dummyMiddleANodeLazy2")
    DummyMiddleANode dummyMiddleA2Node;

    @Inject
    @Named("dummyListANode")
    Lazy<DummyListANode> dummyListANodeLazy;

    DummyMiddleBNode(DummyRootNode dummyRootNode, String name) {
        this.dummyRootNode = dummyRootNode;
        this.name = name;
    }

    public DummyRootNode getDummyRootNode() {
        return dummyRootNode;
    }

    public String getName() {
        return name;
    }

    public DummyMiddleANode getDummyMiddleA2Node() {
        return dummyMiddleA2Node;
    }

    public Lazy<DummyListANode> getDummyListANodeLazy() {
        return dummyListANodeLazy;
    }
}
