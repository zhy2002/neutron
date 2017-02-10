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

public class PreviousEmploymentListNode extends ListUiNode<PersonNode,PreviousEmploymentListNode,PreviousEmploymentNode>
{
    private PreviousEmploymentListNodeItemFactory itemFactory;

    @Inject
    void receiveProviders(PreviousEmploymentListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PreviousEmploymentListNode> config = classRegistry.getUiNodeConfig(PreviousEmploymentListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PreviousEmploymentListNode(PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<PreviousEmploymentNode> getItemClass() {
        return PreviousEmploymentNode.class;
    }

    @Override
    protected <M extends PreviousEmploymentNode> PreviousEmploymentNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createPreviousEmploymentNode(name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Previous Employment");
    }



}
