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

public class OtherLiabilityNode extends ObjectUiNode<OtherLiabilityListNode>
{
    private OtherLiabilityTypeNode otherLiabilityTypeNode;
    private OtherLiabilityDescriptionNode otherLiabilityDescriptionNode;
    private OtherLiabilityMarketValueNode otherLiabilityMarketValueNode;

    private OtherLiabilityNodeChildFactory childFactory;

    @Inject
    void receiveProviders(OtherLiabilityNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<OtherLiabilityNode> config = classRegistry.getUiNodeConfig(OtherLiabilityNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public OtherLiabilityNode(OtherLiabilityListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public OtherLiabilityTypeNode getOtherLiabilityTypeNode() {
        return otherLiabilityTypeNode;
    }

    @JsMethod
    public OtherLiabilityDescriptionNode getOtherLiabilityDescriptionNode() {
        return otherLiabilityDescriptionNode;
    }

    @JsMethod
    public OtherLiabilityMarketValueNode getOtherLiabilityMarketValueNode() {
        return otherLiabilityMarketValueNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        otherLiabilityTypeNode = childFactory.createOtherLiabilityTypeNode();
        children.add(otherLiabilityTypeNode);
        otherLiabilityDescriptionNode = childFactory.createOtherLiabilityDescriptionNode();
        children.add(otherLiabilityDescriptionNode);
        otherLiabilityMarketValueNode = childFactory.createOtherLiabilityMarketValueNode();
        children.add(otherLiabilityMarketValueNode);
        return children;
    }



}
