package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RetiredEmploymentNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RetiredEmploymentNode extends ObjectUiNode<EmploymentNode<?>> {

    @Inject
    public RetiredEmploymentNode(@Owner EmploymentNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RetiredEmploymentNode.class;
    }

    protected final RetiredEmploymentNodeComponent getComponent() {
        return component;
    }


    private RetiredEmploymentNodeComponent component;

    @Inject
    void createComponent(RetiredEmploymentNodeComponent.Builder builder) {
        this.component = builder.setRetiredEmploymentNodeModule(new RetiredEmploymentNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public RetiredOnBenefitFlagNode getRetiredOnBenefitFlagNode() {
        return (RetiredOnBenefitFlagNode)getChildByName("retiredOnBenefitFlagNode");
    }

    @JsMethod
    public RetiredSinceNode getRetiredSinceNode() {
        return (RetiredSinceNode)getChildByName("retiredSinceNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("retiredOnBenefitFlagNode");
        children.add(getComponent().createRetiredOnBenefitFlagNode());
        setChildNodeIdentity("retiredSinceNode");
        children.add(getComponent().createRetiredSinceNode());
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
