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

public class AccessNode extends ObjectUiNode<RealEstateNode> {

    private AccessNodeChildFactory childFactory;
    private AccessNodeComponent component;

    @Inject
    public AccessNode(@Owner RealEstateNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessNode.class;
    }

    @Inject
    void receiveNodeProvider(AccessNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("accessContactTypeNode");
        children.add(childFactory.createAccessContactTypeNode());
        setChildNodeIdentity("accessContactTitleNode");
        children.add(childFactory.createAccessContactTitleNode());
        setChildNodeIdentity("accessContactFirstNameNode");
        children.add(childFactory.createAccessContactFirstNameNode());
        setChildNodeIdentity("accessContactLastNameNode");
        children.add(childFactory.createAccessContactLastNameNode());
        setChildNodeIdentity("accessCompanyNameNode");
        children.add(childFactory.createAccessCompanyNameNode());
        setChildNodeIdentity("accessTelephoneNode");
        children.add(childFactory.createAccessTelephoneNode());
        setChildNodeIdentity("accessOtherDescriptionNode");
        children.add(childFactory.createAccessOtherDescriptionNode());
        setChildNodeIdentity(null);
        return children;
    }

}
