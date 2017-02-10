package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class PersonPrivacyNode extends ObjectUiNode<PersonNode>
{
    private CreditCheckFlagNode creditCheckFlagNode;
    private ThirdPartyDisclosureFlagNode thirdPartyDisclosureFlagNode;
    private LegalActionNode legalActionNode;

    private PersonPrivacyNodeChildFactory childFactory;

    @Inject
    void receiveProviders(PersonPrivacyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonPrivacyNode> config = classRegistry.getUiNodeConfig(PersonPrivacyNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PersonPrivacyNode(PersonNode parent, String name) {
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
