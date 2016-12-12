package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.SetHasErrorRule;
import zhy2002.neutron.*;
import zhy2002.neutron.util.EnhancedLinkedList;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

@JsType
public class RegisterNode extends ObjectUiNode<VoidUiNode> {

    private UsernameNode usernameNode;
    private EmailNode emailNode;
    private PasswordNode passwordNode;
    private RepeatPasswordNode repeatPasswordNode;
    private AgeNode ageNode;
    private ReceiveOffersNode receiveOffersNode;
    private OwnInvestmentPropertyNode ownInvestmentPropertyNode;
    private PropertyDetailsNode residentialPropertyNode;
    private PropertyDetailsNode investmentPropertyNode;
    private PhoneInfoNode homePhoneNode;
    private ErrorListNode errorListNode;

    RegisterNode(@NotNull AbstractUiNodeContext<?> context) {
        super(context);

        setHasError(false);
    }

    public boolean getHasError() {
        return getStateValue(PredefinedUiNodeStateKeys.HAS_ERROR);
    }

    public void setHasError(boolean value) {
        setStateValue(PredefinedUiNodeStateKeys.HAS_ERROR, Boolean.class, value);
    }

    public UsernameNode getUsernameNode() {
        return usernameNode;
    }

    public PasswordNode getPasswordNode() {
        return passwordNode;
    }

    public RepeatPasswordNode getRepeatPasswordNode() {
        return repeatPasswordNode;
    }

    public ReceiveOffersNode getReceiveOffersNode() {
        return receiveOffersNode;
    }

    public EmailNode getEmailNode() {
        return emailNode;
    }

    public AgeNode getAgeNode() {
        return ageNode;
    }

    public OwnInvestmentPropertyNode getOwnInvestmentPropertyNode() {
        return ownInvestmentPropertyNode;
    }


    public PhoneInfoNode getHomePhoneNode() {
        return homePhoneNode;
    }

    public PropertyDetailsNode getResidentialPropertyNode() {
        return residentialPropertyNode;
    }

    public PropertyDetailsNode getInvestmentPropertyNode() {
        return investmentPropertyNode;
    }


    public ErrorListNode getErrorListNode() {
        return errorListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();
        usernameNode = context.createChildNode(UsernameNode.class, this, "usernameNode");
        emailNode = context.createChildNode(EmailNode.class, this, "emailNode");
        passwordNode = context.createChildNode(PasswordNode.class, this, "passwordNode");
        repeatPasswordNode = context.createChildNode(RepeatPasswordNode.class, this, "repeatPasswordNode");
        receiveOffersNode = context.createChildNode(ReceiveOffersNode.class, this, "receiveOffersNode");
        ageNode = context.createChildNode(AgeNode.class, this, "ageNode");
        ownInvestmentPropertyNode = context.createChildNode(OwnInvestmentPropertyNode.class, this, "ownInvestmentPropertyNode");
        residentialPropertyNode = context.createChildNode(PropertyDetailsNode.class, this, "residentialPropertyNode");
        investmentPropertyNode = context.createChildNode(PropertyDetailsNode.class, this, "investmentPropertyNode");
        homePhoneNode = context.createChildNode(PhoneInfoNode.class, this, "homePhoneNode");
        errorListNode = context.createChildNode(ErrorListNode.class, this, "errorListNode");

        return Arrays.asList(
                usernameNode,
                emailNode,
                passwordNode,
                repeatPasswordNode,
                receiveOffersNode,
                ageNode,
                ownInvestmentPropertyNode,
                residentialPropertyNode,
                investmentPropertyNode,
                homePhoneNode,
                errorListNode
        );
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?, ?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(SetHasErrorRule.class, this));
    }
}
