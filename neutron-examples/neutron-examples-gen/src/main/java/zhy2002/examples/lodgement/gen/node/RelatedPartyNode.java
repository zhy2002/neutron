package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class RelatedPartyNode extends ObjectUiNode<RelatedPartyListNode> {
    private RelatedPartyNodeChildFactory childFactory;
    private RelatedPartyNodeComponent component;

    public RelatedPartyNode(@NotNull RelatedPartyListNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return RelatedPartyNode.class;
    }

    @Inject
    void receiveNodeProvider(RelatedPartyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("thirdPartyTypeNode");
        children.add(childFactory.createThirdPartyTypeNode());
        setChildNodeIdentity("thirdPartyDescriptionNode");
        children.add(childFactory.createThirdPartyDescriptionNode());
        setChildNodeIdentity("thirdPartyTitleNode");
        children.add(childFactory.createThirdPartyTitleNode());
        setChildNodeIdentity("thirdPartyFirstNameNode");
        children.add(childFactory.createThirdPartyFirstNameNode());
        setChildNodeIdentity("thirdPartyLastNameNode");
        children.add(childFactory.createThirdPartyLastNameNode());
        setChildNodeIdentity("thirdPartyDobNode");
        children.add(childFactory.createThirdPartyDobNode());
        setChildNodeIdentity("thirdPartyCompanyNameNode");
        children.add(childFactory.createThirdPartyCompanyNameNode());
        setChildNodeIdentity("thirdPartyAddressNode");
        children.add(childFactory.createThirdPartyAddressNode());
        setChildNodeIdentity("thirdPartyWorkPhoneNode");
        children.add(childFactory.createThirdPartyWorkPhoneNode());
        setChildNodeIdentity("thirdPartyEmailNode");
        children.add(childFactory.createThirdPartyEmailNode());
        setChildNodeIdentity(null);
        return children;
    }

}
