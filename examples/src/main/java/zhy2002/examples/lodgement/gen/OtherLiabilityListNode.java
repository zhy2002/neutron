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

public class OtherLiabilityListNode extends ListUiNode<LiabilitiesNode,OtherLiabilityListNode,OtherLiabilityNode>
{
    private OtherLiabilityListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(OtherLiabilityListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<OtherLiabilityListNode> config = classRegistry.getUiNodeConfig(OtherLiabilityListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public OtherLiabilityListNode(LiabilitiesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<OtherLiabilityNode> getItemClass() {
        return OtherLiabilityNode.class;
    }

    @Override
    protected <M extends OtherLiabilityNode> OtherLiabilityNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createOtherLiabilityNode(name);
    }



}
