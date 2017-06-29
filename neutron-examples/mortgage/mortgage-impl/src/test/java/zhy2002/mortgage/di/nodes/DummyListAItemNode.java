package zhy2002.mortgage.di.nodes;


import javax.inject.Inject;

public class DummyListAItemNode {

    private final DummyListANode parent;
    private final String name;

    @Inject
    DummyRootNode rootNode;

    public DummyListAItemNode(DummyListANode parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    public DummyListANode getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    public DummyRootNode getRootNode() {
        return rootNode;
    }
}
