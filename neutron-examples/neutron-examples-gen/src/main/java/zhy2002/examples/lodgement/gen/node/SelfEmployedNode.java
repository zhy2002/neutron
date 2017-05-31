package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SelfEmployedNode extends EmployedNode {
    private SelfEmployedNodeChildFactory childFactory;
    private SelfEmployedNodeComponent component;

    public SelfEmployedNode(@NotNull EmploymentNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SelfEmployedNode.class;
    }

    @Inject
    void receiveNodeProvider(SelfEmployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(SelfEmployedNodeComponent.Builder builder) {
        this.component = builder.setSelfEmployedNodeModule(new SelfEmployedNodeModule(this)).build();
    }

    private RuleProvider<SelfEmployedNode> getRuleProvider() {
        return component.getSelfEmployedNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<SelfEmployedNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public BusinessTypeNode getBusinessTypeNode() {
        return (BusinessTypeNode)getChildByName("businessTypeNode");
    }

    @JsMethod
    public ProfitThisYearNode getProfitThisYearNode() {
        return (ProfitThisYearNode)getChildByName("profitThisYearNode");
    }

    @JsMethod
    public ProfitPreviousYearNode getProfitPreviousYearNode() {
        return (ProfitPreviousYearNode)getChildByName("profitPreviousYearNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("businessTypeNode");
        children.add(childFactory.createBusinessTypeNode());
        setChildNodeIdentity("profitThisYearNode");
        children.add(childFactory.createProfitThisYearNode());
        setChildNodeIdentity("profitPreviousYearNode");
        children.add(childFactory.createProfitPreviousYearNode());
        setChildNodeIdentity(null);
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
