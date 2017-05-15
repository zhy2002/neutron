package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class EmployedNode extends ObjectUiNode<EmploymentNode<?>> {

    private EmployedNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(EmployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }


    public EmployedNode(@NotNull EmploymentNode<?> parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public EmploymentStatusNode getEmploymentStatusNode() {
        return (EmploymentStatusNode)getChildByName("employmentStatusNode");
    }

    @JsMethod
    public OccupationNode getOccupationNode() {
        return (OccupationNode)getChildByName("occupationNode");
    }

    @JsMethod
    public EmployerNameNode getEmployerNameNode() {
        return (EmployerNameNode)getChildByName("employerNameNode");
    }

    @JsMethod
    public EmployerAddressNode getEmployerAddressNode() {
        return (EmployerAddressNode)getChildByName("employerAddressNode");
    }

    @JsMethod
    public EmployerPhoneNode getEmployerPhoneNode() {
        return (EmployerPhoneNode)getChildByName("employerPhoneNode");
    }

    @JsMethod
    public EmploymentStartedNode getEmploymentStartedNode() {
        return (EmploymentStartedNode)getChildByName("employmentStartedNode");
    }

    @JsMethod
    public EmploymentEndedNode getEmploymentEndedNode() {
        return (EmploymentEndedNode)getChildByName("employmentEndedNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createEmploymentStatusNode());
        children.add(childFactory.createOccupationNode());
        children.add(childFactory.createEmployerNameNode());
        children.add(childFactory.createEmployerAddressNode());
        children.add(childFactory.createEmployerPhoneNode());
        children.add(childFactory.createEmploymentStartedNode());
        children.add(childFactory.createEmploymentEndedNode());
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
