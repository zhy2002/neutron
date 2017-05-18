package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class EmploymentNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    private EmploymentNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(EmploymentNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }


    public EmploymentNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    public static final PropertyMetadata<Boolean> CURRENT_RECORD_PROPERTY = MetadataRegistry.createProperty(EmploymentNode.class, "currentRecord", Boolean.class, Boolean.FALSE);

    @JsMethod
    public Boolean getCurrentRecord() {
        return getStateValue(CURRENT_RECORD_PROPERTY);
    }

    @JsMethod
    public void setCurrentRecord(Boolean value) {
        setStateValue(CURRENT_RECORD_PROPERTY, value);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("employmentTypeNode");
        children.add(childFactory.createEmploymentTypeNode());
        setChildNodeIdentity("payeEmployedNode");
        children.add(childFactory.createPayeEmployedNode());
        setChildNodeIdentity("selfEmployedNode");
        children.add(childFactory.createSelfEmployedNode());
        setChildNodeIdentity("unemployedNode");
        children.add(childFactory.createUnemployedNode());
        setChildNodeIdentity("retiredEmploymentNode");
        children.add(childFactory.createRetiredEmploymentNode());
        setChildNodeIdentity(null);
        return children;
    }

}
