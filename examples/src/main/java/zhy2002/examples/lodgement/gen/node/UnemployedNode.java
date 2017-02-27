package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class UnemployedNode extends ObjectUiNode<EmploymentNode<?>> {

    private UnemployedOnBenefitFlagNode unemployedOnBenefitFlagNode;
    private StudentFlagNode studentFlagNode;
    private StudentTypeNode studentTypeNode;
    private HouseDutiesFlagNode houseDutiesFlagNode;
    private UnemployedSinceNode unemployedSinceNode;

    private UnemployedNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(UnemployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return UnemployedNode.class;
    }

    private UnemployedNodeComponent component;

    @Inject
    void createComponent(UnemployedNodeComponent.Builder builder) {
        this.component = builder.setUnemployedNodeModule(new UnemployedNodeModule(this)).build();
    }

    @Override
    protected UnemployedNodeRuleProvider getRuleProvider() {
        return component.getUnemployedNodeRuleProvider();
    }

    public UnemployedNode(@NotNull EmploymentNode<?> parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UnemployedOnBenefitFlagNode getUnemployedOnBenefitFlagNode() {
        return unemployedOnBenefitFlagNode;
    }

    @JsMethod
    public StudentFlagNode getStudentFlagNode() {
        return studentFlagNode;
    }

    @JsMethod
    public StudentTypeNode getStudentTypeNode() {
        return studentTypeNode;
    }

    @JsMethod
    public HouseDutiesFlagNode getHouseDutiesFlagNode() {
        return houseDutiesFlagNode;
    }

    @JsMethod
    public UnemployedSinceNode getUnemployedSinceNode() {
        return unemployedSinceNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        unemployedOnBenefitFlagNode = childFactory.createUnemployedOnBenefitFlagNode();
        children.add(unemployedOnBenefitFlagNode);
        studentFlagNode = childFactory.createStudentFlagNode();
        children.add(studentFlagNode);
        studentTypeNode = childFactory.createStudentTypeNode();
        children.add(studentTypeNode);
        houseDutiesFlagNode = childFactory.createHouseDutiesFlagNode();
        children.add(houseDutiesFlagNode);
        unemployedSinceNode = childFactory.createUnemployedSinceNode();
        children.add(unemployedSinceNode);
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
