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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    public final Class<?> getConcreteClass() {
        return SelfEmployedNode.class;
    }

    private SelfEmployedNodeComponent component;

    @Inject
    void createComponent(SelfEmployedNodeComponent.Builder builder) {
        this.component = builder.setSelfEmployedNodeModule(new SelfEmployedNodeModule(this)).build();
    }

    @Override
    protected SelfEmployedNodeRuleProvider getRuleProvider() {
        return component.getSelfEmployedNodeRuleProvider();
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
