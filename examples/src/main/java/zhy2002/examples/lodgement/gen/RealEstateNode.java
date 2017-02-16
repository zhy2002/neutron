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

public class RealEstateNode extends ObjectUiNode<RealEstateListNode>
{
    private UsageNode usageNode;
    private PropertyNode propertyNode;
    private AccessNode accessNode;

    private RealEstateNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(RealEstateNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return RealEstateNode.class;
    }

    public RealEstateNode(RealEstateListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UsageNode getUsageNode() {
        return usageNode;
    }

    @JsMethod
    public PropertyNode getPropertyNode() {
        return propertyNode;
    }

    @JsMethod
    public AccessNode getAccessNode() {
        return accessNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        usageNode = childFactory.createUsageNode();
        children.add(usageNode);
        propertyNode = childFactory.createPropertyNode();
        children.add(propertyNode);
        accessNode = childFactory.createAccessNode();
        children.add(accessNode);
        return children;
    }

}
