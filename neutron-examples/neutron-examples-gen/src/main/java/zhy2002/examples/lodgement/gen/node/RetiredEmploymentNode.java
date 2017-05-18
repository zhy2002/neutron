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

public class RetiredEmploymentNode extends ObjectUiNode<EmploymentNode<?>> {

    private RetiredEmploymentNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(RetiredEmploymentNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return RetiredEmploymentNode.class;
    }

    private RetiredEmploymentNodeComponent component;

    @Inject
    void createComponent(RetiredEmploymentNodeComponent.Builder builder) {
        this.component = builder.setRetiredEmploymentNodeModule(new RetiredEmploymentNodeModule(this)).build();
    }

    private RuleProvider<RetiredEmploymentNode> getRuleProvider() {
        return component.getRetiredEmploymentNodeRuleProvider();
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

    private RuleProvider<RetiredEmploymentNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public RetiredEmploymentNode(@NotNull EmploymentNode<?> parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public RetiredOnBenefitFlagNode getRetiredOnBenefitFlagNode() {
        return (RetiredOnBenefitFlagNode)getChildByName("retiredOnBenefitFlagNode");
    }

    @JsMethod
    public RetiredSinceNode getRetiredSinceNode() {
        return (RetiredSinceNode)getChildByName("retiredSinceNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("retiredOnBenefitFlagNode");
        children.add(childFactory.createRetiredOnBenefitFlagNode());
        setChildNodeIdentity("retiredSinceNode");
        children.add(childFactory.createRetiredSinceNode());
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
