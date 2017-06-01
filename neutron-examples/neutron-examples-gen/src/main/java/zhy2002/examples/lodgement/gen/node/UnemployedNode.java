package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class UnemployedNode extends ObjectUiNode<EmploymentNode<?>> {

    private UnemployedNodeChildFactory childFactory;
    private UnemployedNodeComponent component;

    @Inject
    public UnemployedNode(@Owner EmploymentNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UnemployedNode.class;
    }

    @Inject
    void receiveNodeProvider(UnemployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(UnemployedNodeComponent.Builder builder) {
        this.component = builder.setUnemployedNodeModule(new UnemployedNodeModule(this)).build();
    }

    private RuleProvider<UnemployedNode> getRuleProvider() {
        return component.getUnemployedNodeRuleProvider();
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

    private RuleProvider<UnemployedNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("unemployedOnBenefitFlagNode");
        children.add(childFactory.createUnemployedOnBenefitFlagNode());
        setChildNodeIdentity("studentFlagNode");
        children.add(childFactory.createStudentFlagNode());
        setChildNodeIdentity("studentTypeNode");
        children.add(childFactory.createStudentTypeNode());
        setChildNodeIdentity("houseDutiesFlagNode");
        children.add(childFactory.createHouseDutiesFlagNode());
        setChildNodeIdentity("unemployedSinceNode");
        children.add(childFactory.createUnemployedSinceNode());
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
