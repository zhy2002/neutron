package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class CurrentEmploymentListNode extends ListUiNode<PersonNode,CurrentEmploymentListNode,CurrentEmploymentNode>
{
    private CurrentEmploymentListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(CurrentEmploymentListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<CurrentEmploymentListNode> config = classRegistry.getUiNodeConfig(CurrentEmploymentListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public CurrentEmploymentListNode(PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<CurrentEmploymentNode> getItemClass() {
        return CurrentEmploymentNode.class;
    }

    @Override
    protected <M extends CurrentEmploymentNode> CurrentEmploymentNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createCurrentEmploymentNode(name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Current Employment");
    }



}
