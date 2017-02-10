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

public class SelfEmployedNode extends EmployedNode
{
    private BusinessTypeNode businessTypeNode;
    private ProfitThisYearNode profitThisYearNode;
    private ProfitPreviousYearNode profitPreviousYearNode;

    private SelfEmployedNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(SelfEmployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<SelfEmployedNode> config = classRegistry.getUiNodeConfig(SelfEmployedNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public SelfEmployedNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public BusinessTypeNode getBusinessTypeNode() {
        return businessTypeNode;
    }

    @JsMethod
    public ProfitThisYearNode getProfitThisYearNode() {
        return profitThisYearNode;
    }

    @JsMethod
    public ProfitPreviousYearNode getProfitPreviousYearNode() {
        return profitPreviousYearNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        businessTypeNode = childFactory.createBusinessTypeNode();
        children.add(businessTypeNode);
        profitThisYearNode = childFactory.createProfitThisYearNode();
        children.add(profitThisYearNode);
        profitPreviousYearNode = childFactory.createProfitPreviousYearNode();
        children.add(profitPreviousYearNode);
        return children;
    }




    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
