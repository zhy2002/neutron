package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmploymentNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class EmploymentNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    public EmploymentNode(P parent) {
        super(parent);
    }

    protected abstract EmploymentNodeComponent getComponent();


    public static final PropertyMetadata<Boolean> CURRENT_RECORD_PROPERTY = MetadataRegistry.createProperty(EmploymentNode.class, "currentRecord", Boolean.class, Boolean.FALSE);

    @JsMethod
    public Boolean getCurrentRecord() {
        return getStateValue(CURRENT_RECORD_PROPERTY);
    }

    @JsMethod
    public void setCurrentRecord(Boolean value) {
        setStateValue(CURRENT_RECORD_PROPERTY, value);
    }

    //region children getters

    @JsMethod
    public EmploymentTypeNode getEmploymentTypeNode() {
        return (EmploymentTypeNode)getChildByName("employmentTypeNode");
    }

    @JsMethod
    public PayeEmployedNode getPayeEmployedNode() {
        return (PayeEmployedNode)getChildByName("payeEmployedNode");
    }

    @JsMethod
    public SelfEmployedNode getSelfEmployedNode() {
        return (SelfEmployedNode)getChildByName("selfEmployedNode");
    }

    @JsMethod
    public UnemployedNode getUnemployedNode() {
        return (UnemployedNode)getChildByName("unemployedNode");
    }

    @JsMethod
    public RetiredEmploymentNode getRetiredEmploymentNode() {
        return (RetiredEmploymentNode)getChildByName("retiredEmploymentNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("employmentTypeNode");
        children.add(getComponent().createEmploymentTypeNode());
        setChildNodeIdentity("payeEmployedNode");
        children.add(getComponent().createPayeEmployedNode());
        setChildNodeIdentity("selfEmployedNode");
        children.add(getComponent().createSelfEmployedNode());
        setChildNodeIdentity("unemployedNode");
        children.add(getComponent().createUnemployedNode());
        setChildNodeIdentity("retiredEmploymentNode");
        children.add(getComponent().createRetiredEmploymentNode());
        setChildNodeIdentity(null);
        return children;
    }

}
