package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessNode extends ObjectUiNode<RealEstateNode> {

    private AccessContactTypeNode accessContactTypeNode;
    private AccessContactTitleNode accessContactTitleNode;
    private AccessContactFirstNameNode accessContactFirstNameNode;
    private AccessContactLastNameNode accessContactLastNameNode;
    private AccessCompanyNameNode accessCompanyNameNode;
    private AccessTelephoneNode accessTelephoneNode;
    private AccessOtherDescriptionNode accessOtherDescriptionNode;

    private AccessNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(AccessNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return AccessNode.class;
    }

    private AccessNodeComponent component;

    @Inject
    void createComponent(AccessNodeComponent.Builder builder) {
        this.component = builder.setAccessNodeModule(new AccessNodeModule(this)).build();
    }

    private AccessNodeRuleProvider getRuleProvider() {
        return component.getAccessNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public AccessNode(@NotNull RealEstateNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public AccessContactTypeNode getAccessContactTypeNode() {
        return accessContactTypeNode;
    }

    @JsMethod
    public AccessContactTitleNode getAccessContactTitleNode() {
        return accessContactTitleNode;
    }

    @JsMethod
    public AccessContactFirstNameNode getAccessContactFirstNameNode() {
        return accessContactFirstNameNode;
    }

    @JsMethod
    public AccessContactLastNameNode getAccessContactLastNameNode() {
        return accessContactLastNameNode;
    }

    @JsMethod
    public AccessCompanyNameNode getAccessCompanyNameNode() {
        return accessCompanyNameNode;
    }

    @JsMethod
    public AccessTelephoneNode getAccessTelephoneNode() {
        return accessTelephoneNode;
    }

    @JsMethod
    public AccessOtherDescriptionNode getAccessOtherDescriptionNode() {
        return accessOtherDescriptionNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        accessContactTypeNode = childFactory.createAccessContactTypeNode();
        children.add(accessContactTypeNode);
        accessContactTitleNode = childFactory.createAccessContactTitleNode();
        children.add(accessContactTitleNode);
        accessContactFirstNameNode = childFactory.createAccessContactFirstNameNode();
        children.add(accessContactFirstNameNode);
        accessContactLastNameNode = childFactory.createAccessContactLastNameNode();
        children.add(accessContactLastNameNode);
        accessCompanyNameNode = childFactory.createAccessCompanyNameNode();
        children.add(accessCompanyNameNode);
        accessTelephoneNode = childFactory.createAccessTelephoneNode();
        children.add(accessTelephoneNode);
        accessOtherDescriptionNode = childFactory.createAccessOtherDescriptionNode();
        children.add(accessOtherDescriptionNode);
        return children;
    }

}
