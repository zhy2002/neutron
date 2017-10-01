package zhy2002.mortgage.di.nodes;

public class DummyMiddleANode {

    private final DummyRootNode dummyRootNode;
    private final String name;

    DummyMiddleANode(DummyRootNode dummyRootNode, String name) {
        this.dummyRootNode = dummyRootNode;
        this.name = name;
    }

    public DummyRootNode getDummyRootNode() {
        return dummyRootNode;
    }

    public String getName() {
        return name;
    }

}
