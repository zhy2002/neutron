package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmployedNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class EmployedNode extends ObjectUiNode<EmploymentNode<?>> {

    public EmployedNode(EmploymentNode<?> parent, String name) {
        super(parent, name);
    }

    protected abstract EmployedNodeComponent getComponent();


    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("employmentStatusNode");
        children.add(getComponent().createEmploymentStatusNode());
        setChildNodeIdentity("occupationNode");
        children.add(getComponent().createOccupationNode());
        setChildNodeIdentity("employerNameNode");
        children.add(getComponent().createEmployerNameNode());
        setChildNodeIdentity("employerAddressNode");
        children.add(getComponent().createEmployerAddressNode());
        setChildNodeIdentity("employerPhoneNode");
        children.add(getComponent().createEmployerPhoneNode());
        setChildNodeIdentity("employmentStartedNode");
        children.add(getComponent().createEmploymentStartedNode());
        setChildNodeIdentity("employmentEndedNode");
        children.add(getComponent().createEmploymentEndedNode());
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
