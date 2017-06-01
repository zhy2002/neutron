package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RelatedPartyNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RelatedPartyNode extends ObjectUiNode<RelatedPartyListNode> {

    @Inject
    public RelatedPartyNode(@Owner RelatedPartyListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RelatedPartyNode.class;
    }

    protected final RelatedPartyNodeComponent getComponent() {
        return component;
    }


    private RelatedPartyNodeComponent component;

    @Inject
    void createComponent(RelatedPartyNodeComponent.Builder builder) {
        this.component = builder.setRelatedPartyNodeModule(new RelatedPartyNodeModule(this)).build();
    }

    private RuleProvider<RelatedPartyNode> getRuleProvider() {
        return component.getRelatedPartyNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    //region children getters

    @JsMethod
    public ThirdPartyTypeNode getThirdPartyTypeNode() {
        return (ThirdPartyTypeNode)getChildByName("thirdPartyTypeNode");
    }

    @JsMethod
    public ThirdPartyDescriptionNode getThirdPartyDescriptionNode() {
        return (ThirdPartyDescriptionNode)getChildByName("thirdPartyDescriptionNode");
    }

    @JsMethod
    public ThirdPartyTitleNode getThirdPartyTitleNode() {
        return (ThirdPartyTitleNode)getChildByName("thirdPartyTitleNode");
    }

    @JsMethod
    public ThirdPartyFirstNameNode getThirdPartyFirstNameNode() {
        return (ThirdPartyFirstNameNode)getChildByName("thirdPartyFirstNameNode");
    }

    @JsMethod
    public ThirdPartyLastNameNode getThirdPartyLastNameNode() {
        return (ThirdPartyLastNameNode)getChildByName("thirdPartyLastNameNode");
    }

    @JsMethod
    public ThirdPartyDobNode getThirdPartyDobNode() {
        return (ThirdPartyDobNode)getChildByName("thirdPartyDobNode");
    }

    @JsMethod
    public ThirdPartyCompanyNameNode getThirdPartyCompanyNameNode() {
        return (ThirdPartyCompanyNameNode)getChildByName("thirdPartyCompanyNameNode");
    }

    @JsMethod
    public ThirdPartyAddressNode getThirdPartyAddressNode() {
        return (ThirdPartyAddressNode)getChildByName("thirdPartyAddressNode");
    }

    @JsMethod
    public ThirdPartyWorkPhoneNode getThirdPartyWorkPhoneNode() {
        return (ThirdPartyWorkPhoneNode)getChildByName("thirdPartyWorkPhoneNode");
    }

    @JsMethod
    public ThirdPartyEmailNode getThirdPartyEmailNode() {
        return (ThirdPartyEmailNode)getChildByName("thirdPartyEmailNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("thirdPartyTypeNode");
        children.add(getComponent().createThirdPartyTypeNode());
        setChildNodeIdentity("thirdPartyDescriptionNode");
        children.add(getComponent().createThirdPartyDescriptionNode());
        setChildNodeIdentity("thirdPartyTitleNode");
        children.add(getComponent().createThirdPartyTitleNode());
        setChildNodeIdentity("thirdPartyFirstNameNode");
        children.add(getComponent().createThirdPartyFirstNameNode());
        setChildNodeIdentity("thirdPartyLastNameNode");
        children.add(getComponent().createThirdPartyLastNameNode());
        setChildNodeIdentity("thirdPartyDobNode");
        children.add(getComponent().createThirdPartyDobNode());
        setChildNodeIdentity("thirdPartyCompanyNameNode");
        children.add(getComponent().createThirdPartyCompanyNameNode());
        setChildNodeIdentity("thirdPartyAddressNode");
        children.add(getComponent().createThirdPartyAddressNode());
        setChildNodeIdentity("thirdPartyWorkPhoneNode");
        children.add(getComponent().createThirdPartyWorkPhoneNode());
        setChildNodeIdentity("thirdPartyEmailNode");
        children.add(getComponent().createThirdPartyEmailNode());
        setChildNodeIdentity(null);
        return children;
    }

}
