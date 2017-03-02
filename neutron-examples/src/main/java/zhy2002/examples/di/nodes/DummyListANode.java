package zhy2002.examples.di.nodes;


import javax.inject.Inject;
import javax.inject.Provider;

public class DummyListANode {

    private final DummyMiddleBNode parent;
    private final String name;

    @Inject
    Provider<DummyListAItemComponent.Builder> itemComponentBuilderProvider;

    public DummyListANode(DummyMiddleBNode parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    public DummyMiddleBNode getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    public Provider<DummyListAItemComponent.Builder> getItemComponentBuilderProvider() {
        return itemComponentBuilderProvider;
    }
}
