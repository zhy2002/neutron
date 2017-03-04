package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class RetiredEmploymentNode extends ObjectUiNode<EmploymentNode<?>> {

    private RetiredOnBenefitFlagNode retiredOnBenefitFlagNode;
    private RetiredSinceNode retiredSinceNode;

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

    @Override
    protected RetiredEmploymentNodeRuleProvider getRuleProvider() {
        return component.getRetiredEmploymentNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public RetiredEmploymentNode(@NotNull EmploymentNode<?> parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public RetiredOnBenefitFlagNode getRetiredOnBenefitFlagNode() {
        return retiredOnBenefitFlagNode;
    }

    @JsMethod
    public RetiredSinceNode getRetiredSinceNode() {
        return retiredSinceNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        retiredOnBenefitFlagNode = childFactory.createRetiredOnBenefitFlagNode();
        children.add(retiredOnBenefitFlagNode);
        retiredSinceNode = childFactory.createRetiredSinceNode();
        children.add(retiredSinceNode);
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
