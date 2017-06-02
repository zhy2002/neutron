package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.UnemployedNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class UnemployedNode extends ObjectUiNode<EmploymentNode<?>> {

    @Inject
    protected UnemployedNode(@Owner EmploymentNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UnemployedNode.class;
    }

    protected final UnemployedNodeComponent getComponent() {
        return component;
    }


    private UnemployedNodeComponent component;

    @Inject
    void createComponent(UnemployedNodeComponent.Builder builder) {
        this.component = builder.setUnemployedNodeModule(new UnemployedNodeModule(this)).build();
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
    public UnemployedOnBenefitFlagNode getUnemployedOnBenefitFlagNode() {
        return (UnemployedOnBenefitFlagNode)getChildByName("unemployedOnBenefitFlagNode");
    }

    @JsMethod
    public StudentFlagNode getStudentFlagNode() {
        return (StudentFlagNode)getChildByName("studentFlagNode");
    }

    @JsMethod
    public StudentTypeNode getStudentTypeNode() {
        return (StudentTypeNode)getChildByName("studentTypeNode");
    }

    @JsMethod
    public HouseDutiesFlagNode getHouseDutiesFlagNode() {
        return (HouseDutiesFlagNode)getChildByName("houseDutiesFlagNode");
    }

    @JsMethod
    public UnemployedSinceNode getUnemployedSinceNode() {
        return (UnemployedSinceNode)getChildByName("unemployedSinceNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("unemployedOnBenefitFlagNode");
        children.add(getComponent().createUnemployedOnBenefitFlagNode());
        setChildNodeIdentity("studentFlagNode");
        children.add(getComponent().createStudentFlagNode());
        setChildNodeIdentity("studentTypeNode");
        children.add(getComponent().createStudentTypeNode());
        setChildNodeIdentity("houseDutiesFlagNode");
        children.add(getComponent().createHouseDutiesFlagNode());
        setChildNodeIdentity("unemployedSinceNode");
        children.add(getComponent().createUnemployedSinceNode());
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
