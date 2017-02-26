package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonPrivacyNode extends ObjectUiNode<PersonNode> {

    private CreditCheckFlagNode creditCheckFlagNode;
    private ThirdPartyDisclosureFlagNode thirdPartyDisclosureFlagNode;
    private LegalActionNode legalActionNode;

    private PersonPrivacyNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonPrivacyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonPrivacyNode.class;
    }

    private PersonPrivacyNodeComponent component;

    @Inject
    void createComponent(PersonPrivacyNodeComponent.Builder builder) {
        this.component = builder.setPersonPrivacyNodeModule(new PersonPrivacyNodeModule(this)).build();
    }

    @Override
    protected PersonPrivacyNodeRuleProvider getRuleProvider() {
        return component.getPersonPrivacyNodeRuleProvider();
    }

    public PersonPrivacyNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CreditCheckFlagNode getCreditCheckFlagNode() {
        return creditCheckFlagNode;
    }

    @JsMethod
    public ThirdPartyDisclosureFlagNode getThirdPartyDisclosureFlagNode() {
        return thirdPartyDisclosureFlagNode;
    }

    @JsMethod
    public LegalActionNode getLegalActionNode() {
        return legalActionNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        creditCheckFlagNode = childFactory.createCreditCheckFlagNode();
        children.add(creditCheckFlagNode);
        thirdPartyDisclosureFlagNode = childFactory.createThirdPartyDisclosureFlagNode();
        children.add(thirdPartyDisclosureFlagNode);
        legalActionNode = childFactory.createLegalActionNode();
        children.add(legalActionNode);
        return children;
    }

}