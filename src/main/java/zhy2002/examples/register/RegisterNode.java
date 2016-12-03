package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.ClearHasErrorRule;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRule;
import zhy2002.examples.register.rule.SetHasErrorRule;
import zhy2002.neutron.*;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

@JsType
public class RegisterNode extends ObjectUiNode<VoidUiNode> {

    private UsernameNode usernameNode;
    private EmailNode emailNode;
    private PasswordNode passwordNode;
    private RepeatPasswordNode repeatPasswordNode;
    private ReceiveOffersNode receiveOffersNode;
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
        errorListNode = context.createChildNode(ErrorListNode.class, this, "errorListNode");

        return Arrays.asList(
                usernameNode,
                emailNode,
                passwordNode,
                repeatPasswordNode,
                receiveOffersNode,
                errorListNode
        );
    }

    @Override
    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return Arrays.asList(
                getContext().getInstance(SetHasErrorRule.Factory.class).create(this),
                getContext().getInstance(ClearHasErrorRule.Factory.class).create(this)
        );
    }
}
