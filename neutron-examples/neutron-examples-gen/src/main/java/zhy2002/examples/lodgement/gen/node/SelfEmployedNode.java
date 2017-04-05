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

    public SelfEmployedNode(@NotNull EmploymentNode<?> parent, String name) {
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
