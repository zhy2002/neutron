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

public class PayeEmployedNode extends EmployedNode {
    private PayeEmployedNodeChildFactory childFactory;
    private PayeEmployedNodeComponent component;

    public PayeEmployedNode(@NotNull EmploymentNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PayeEmployedNode.class;
    }

    @Inject
    void receiveNodeProvider(PayeEmployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(PayeEmployedNodeComponent.Builder builder) {
        this.component = builder.setPayeEmployedNodeModule(new PayeEmployedNodeModule(this)).build();
    }

    private RuleProvider<PayeEmployedNode> getRuleProvider() {
        return component.getPayeEmployedNodeRuleProvider();
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

    private RuleProvider<PayeEmployedNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public GrossYearlySalaryNode getGrossYearlySalaryNode() {
        return (GrossYearlySalaryNode)getChildByName("grossYearlySalaryNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("grossYearlySalaryNode");
        children.add(childFactory.createGrossYearlySalaryNode());
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
