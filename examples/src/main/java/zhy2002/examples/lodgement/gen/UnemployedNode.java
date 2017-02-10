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

public class UnemployedNode extends ObjectUiNode<EmploymentNode<?>>
{
    private UnemployedOnBenefitFlagNode unemployedOnBenefitFlagNode;
    private StudentFlagNode studentFlagNode;
    private StudentTypeNode studentTypeNode;
    private HouseDutiesFlagNode houseDutiesFlagNode;
    private UnemployedSinceNode unemployedSinceNode;

    private UnemployedNodeChildFactory childFactory;

    @Inject
    void receiveProviders(UnemployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<UnemployedNode> config = classRegistry.getUiNodeConfig(UnemployedNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public UnemployedNode(EmploymentNode parent, String name) {
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
