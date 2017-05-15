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

    @Inject
    void receiveNodeProvider(RelatedPartyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return RelatedPartyNode.class;
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


    public RelatedPartyNode(@NotNull RelatedPartyListNode parent, String name) {
        super(parent, name);
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
        children.add(childFactory.createThirdPartyTypeNode());
        children.add(childFactory.createThirdPartyDescriptionNode());
        children.add(childFactory.createThirdPartyTitleNode());
        children.add(childFactory.createThirdPartyFirstNameNode());
        children.add(childFactory.createThirdPartyLastNameNode());
        children.add(childFactory.createThirdPartyDobNode());
        children.add(childFactory.createThirdPartyCompanyNameNode());
        children.add(childFactory.createThirdPartyAddressNode());
        children.add(childFactory.createThirdPartyWorkPhoneNode());
        children.add(childFactory.createThirdPartyEmailNode());
        return children;
    }

}
