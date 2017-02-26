package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class EmployedNode extends ObjectUiNode<EmploymentNode<?>> {

    private EmploymentStatusNode employmentStatusNode;
    private OccupationNode occupationNode;
    private EmployerNameNode employerNameNode;
    private EmployerAddressNode employerAddressNode;
    private EmployerPhoneNode employerPhoneNode;
    private EmploymentStartedNode employmentStartedNode;
    private EmploymentEndedNode employmentEndedNode;

    private EmployedNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(EmployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    protected abstract EmployedNodeRuleProvider<?> getRuleProvider();

    public EmployedNode(@NotNull EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public EmploymentStatusNode getEmploymentStatusNode() {
        return employmentStatusNode;
    }

    @JsMethod
    public OccupationNode getOccupationNode() {
        return occupationNode;
    }

    @JsMethod
    public EmployerNameNode getEmployerNameNode() {
        return employerNameNode;
    }

    @JsMethod
    public EmployerAddressNode getEmployerAddressNode() {
        return employerAddressNode;
    }

    @JsMethod
    public EmployerPhoneNode getEmployerPhoneNode() {
        return employerPhoneNode;
    }

    @JsMethod
    public EmploymentStartedNode getEmploymentStartedNode() {
        return employmentStartedNode;
    }

    @JsMethod
    public EmploymentEndedNode getEmploymentEndedNode() {
        return employmentEndedNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        employmentStatusNode = childFactory.createEmploymentStatusNode();
        children.add(employmentStatusNode);
        occupationNode = childFactory.createOccupationNode();
        children.add(occupationNode);
        employerNameNode = childFactory.createEmployerNameNode();
        children.add(employerNameNode);
        employerAddressNode = childFactory.createEmployerAddressNode();
        children.add(employerAddressNode);
        employerPhoneNode = childFactory.createEmployerPhoneNode();
        children.add(employerPhoneNode);
        employmentStartedNode = childFactory.createEmploymentStartedNode();
        children.add(employmentStartedNode);
        employmentEndedNode = childFactory.createEmploymentEndedNode();
        children.add(employmentEndedNode);
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
