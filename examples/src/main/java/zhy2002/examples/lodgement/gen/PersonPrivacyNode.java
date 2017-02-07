package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public  class PersonPrivacyNode extends ObjectUiNode<PersonNode>
{
    private CreditCheckFlagNode creditCheckFlagNode;
    private ThirdPartyDisclosureFlagNode thirdPartyDisclosureFlagNode;
    private LegalActionNode legalActionNode;

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
        UiNodeContext<?> context = getContext();
        creditCheckFlagNode = context.createChildNode(CreditCheckFlagNode.class, this, "creditCheckFlagNode");
        children.add(creditCheckFlagNode);
        thirdPartyDisclosureFlagNode = context.createChildNode(ThirdPartyDisclosureFlagNode.class, this, "thirdPartyDisclosureFlagNode");
        children.add(thirdPartyDisclosureFlagNode);
        legalActionNode = context.createChildNode(LegalActionNode.class, this, "legalActionNode");
        children.add(legalActionNode);
        return children;
    }



}
