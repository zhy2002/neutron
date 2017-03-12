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

    private ThirdPartyTypeNode thirdPartyTypeNode;
    private ThirdPartyDescriptionNode thirdPartyDescriptionNode;
    private ThirdPartyTitleNode thirdPartyTitleNode;
    private ThirdPartyFirstNameNode thirdPartyFirstNameNode;
    private ThirdPartyLastNameNode thirdPartyLastNameNode;
    private ThirdPartyDobNode thirdPartyDobNode;
    private ThirdPartyCompanyNameNode thirdPartyCompanyNameNode;
    private ThirdPartyAddressNode thirdPartyAddressNode;
    private ThirdPartyWorkPhoneNode thirdPartyWorkPhoneNode;
    private ThirdPartyEmailNode thirdPartyEmailNode;

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

    private RelatedPartyNodeRuleProvider getRuleProvider() {
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
        return thirdPartyTypeNode;
    }

    @JsMethod
    public ThirdPartyDescriptionNode getThirdPartyDescriptionNode() {
        return thirdPartyDescriptionNode;
    }

    @JsMethod
    public ThirdPartyTitleNode getThirdPartyTitleNode() {
        return thirdPartyTitleNode;
    }

    @JsMethod
    public ThirdPartyFirstNameNode getThirdPartyFirstNameNode() {
        return thirdPartyFirstNameNode;
    }

    @JsMethod
    public ThirdPartyLastNameNode getThirdPartyLastNameNode() {
        return thirdPartyLastNameNode;
    }

    @JsMethod
    public ThirdPartyDobNode getThirdPartyDobNode() {
        return thirdPartyDobNode;
    }

    @JsMethod
    public ThirdPartyCompanyNameNode getThirdPartyCompanyNameNode() {
        return thirdPartyCompanyNameNode;
    }

    @JsMethod
    public ThirdPartyAddressNode getThirdPartyAddressNode() {
        return thirdPartyAddressNode;
    }

    @JsMethod
    public ThirdPartyWorkPhoneNode getThirdPartyWorkPhoneNode() {
        return thirdPartyWorkPhoneNode;
    }

    @JsMethod
    public ThirdPartyEmailNode getThirdPartyEmailNode() {
        return thirdPartyEmailNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        thirdPartyTypeNode = childFactory.createThirdPartyTypeNode();
        children.add(thirdPartyTypeNode);
        thirdPartyDescriptionNode = childFactory.createThirdPartyDescriptionNode();
        children.add(thirdPartyDescriptionNode);
        thirdPartyTitleNode = childFactory.createThirdPartyTitleNode();
        children.add(thirdPartyTitleNode);
        thirdPartyFirstNameNode = childFactory.createThirdPartyFirstNameNode();
        children.add(thirdPartyFirstNameNode);
        thirdPartyLastNameNode = childFactory.createThirdPartyLastNameNode();
        children.add(thirdPartyLastNameNode);
        thirdPartyDobNode = childFactory.createThirdPartyDobNode();
        children.add(thirdPartyDobNode);
        thirdPartyCompanyNameNode = childFactory.createThirdPartyCompanyNameNode();
        children.add(thirdPartyCompanyNameNode);
        thirdPartyAddressNode = childFactory.createThirdPartyAddressNode();
        children.add(thirdPartyAddressNode);
        thirdPartyWorkPhoneNode = childFactory.createThirdPartyWorkPhoneNode();
        children.add(thirdPartyWorkPhoneNode);
        thirdPartyEmailNode = childFactory.createThirdPartyEmailNode();
        children.add(thirdPartyEmailNode);
        return children;
    }

}
