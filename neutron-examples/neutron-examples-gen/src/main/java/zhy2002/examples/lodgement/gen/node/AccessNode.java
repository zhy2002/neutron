package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AccessNode extends ObjectUiNode<RealEstateNode> {

    @Inject
    public AccessNode(@Owner RealEstateNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessNode.class;
    }

    protected final AccessNodeComponent getComponent() {
        return component;
    }


    private AccessNodeComponent component;

    @Inject
    void createComponent(AccessNodeComponent.Builder builder) {
        this.component = builder.setAccessNodeModule(new AccessNodeModule(this)).build();
    }

    private RuleProvider<AccessNode> getRuleProvider() {
        return component.getAccessNodeRuleProvider();
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

    private RuleProvider<AccessNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    //region children getters

    @JsMethod
    public AccessContactTypeNode getAccessContactTypeNode() {
        return (AccessContactTypeNode)getChildByName("accessContactTypeNode");
    }

    @JsMethod
    public AccessContactTitleNode getAccessContactTitleNode() {
        return (AccessContactTitleNode)getChildByName("accessContactTitleNode");
    }

    @JsMethod
    public AccessContactFirstNameNode getAccessContactFirstNameNode() {
        return (AccessContactFirstNameNode)getChildByName("accessContactFirstNameNode");
    }

    @JsMethod
    public AccessContactLastNameNode getAccessContactLastNameNode() {
        return (AccessContactLastNameNode)getChildByName("accessContactLastNameNode");
    }

    @JsMethod
    public AccessCompanyNameNode getAccessCompanyNameNode() {
        return (AccessCompanyNameNode)getChildByName("accessCompanyNameNode");
    }

    @JsMethod
    public AccessTelephoneNode getAccessTelephoneNode() {
        return (AccessTelephoneNode)getChildByName("accessTelephoneNode");
    }

    @JsMethod
    public AccessOtherDescriptionNode getAccessOtherDescriptionNode() {
        return (AccessOtherDescriptionNode)getChildByName("accessOtherDescriptionNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("accessContactTypeNode");
        children.add(getComponent().createAccessContactTypeNode());
        setChildNodeIdentity("accessContactTitleNode");
        children.add(getComponent().createAccessContactTitleNode());
        setChildNodeIdentity("accessContactFirstNameNode");
        children.add(getComponent().createAccessContactFirstNameNode());
        setChildNodeIdentity("accessContactLastNameNode");
        children.add(getComponent().createAccessContactLastNameNode());
        setChildNodeIdentity("accessCompanyNameNode");
        children.add(getComponent().createAccessCompanyNameNode());
        setChildNodeIdentity("accessTelephoneNode");
        children.add(getComponent().createAccessTelephoneNode());
        setChildNodeIdentity("accessOtherDescriptionNode");
        children.add(getComponent().createAccessOtherDescriptionNode());
        setChildNodeIdentity(null);
        return children;
    }

}
