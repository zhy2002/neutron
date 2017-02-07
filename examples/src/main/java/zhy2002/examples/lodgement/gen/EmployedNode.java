package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public abstract class EmployedNode extends ObjectUiNode<EmploymentNode<?>>
{
    private EmploymentStatusNode employmentStatusNode;
    private OccupationNode occupationNode;
    private EmployerNameNode employerNameNode;
    private EmployerAddressNode employerAddressNode;
    private EmployerPhoneNode employerPhoneNode;
    private EmploymentStartedNode employmentStartedNode;
    private EmploymentEndedNode employmentEndedNode;

    public EmployedNode(EmploymentNode parent, String name) {
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
        UiNodeContext<?> context = getContext();
        employmentStatusNode = context.createChildNode(EmploymentStatusNode.class, this, "employmentStatusNode");
        children.add(employmentStatusNode);
        occupationNode = context.createChildNode(OccupationNode.class, this, "occupationNode");
        children.add(occupationNode);
        employerNameNode = context.createChildNode(EmployerNameNode.class, this, "employerNameNode");
        children.add(employerNameNode);
        employerAddressNode = context.createChildNode(EmployerAddressNode.class, this, "employerAddressNode");
        children.add(employerAddressNode);
        employerPhoneNode = context.createChildNode(EmployerPhoneNode.class, this, "employerPhoneNode");
        children.add(employerPhoneNode);
        employmentStartedNode = context.createChildNode(EmploymentStartedNode.class, this, "employmentStartedNode");
        children.add(employmentStartedNode);
        employmentEndedNode = context.createChildNode(EmploymentEndedNode.class, this, "employmentEndedNode");
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
