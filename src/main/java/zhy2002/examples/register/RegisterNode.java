package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.ClearHasErrorRule;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRule;
import zhy2002.examples.register.rule.SetHasErrorRule;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.PredefinedUiNodeStateKeys;
import zhy2002.neutron.UiNodeContextImpl;
import zhy2002.neutron.VoidUiNode;

import javax.validation.constraints.NotNull;

@JsType
public class RegisterNode extends ObjectUiNode<VoidUiNode> {

    private UsernameNode usernameNode;
    private EmailNode emailNode;
    private PasswordNode passwordNode;
    private RepeatPasswordNode repeatPasswordNode;
    private ReceiveOffersNode receiveOffersNode;
    private ErrorListNode errorListNode;

    RegisterNode(@NotNull UiNodeContextImpl<?> context) {
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
    protected void initializeSelf() {
        setHasError(false);
        getContext().getInstance(SetHasErrorRule.Factory.class).create(this).addToOwner();
        getContext().getInstance(ClearHasErrorRule.Factory.class).create(this).addToOwner();
    }

    @Override
    protected void addChildren() {
        usernameNode = createUsernameNode();
        addUsernameNode();
        getContext().getInstance(DefaultEmailByUsernameRule.Factory.class).create(usernameNode).addToOwner();

        emailNode = createEmailNode();
        addEmailNode();

        passwordNode = createPasswordNode();
        addPasswordNode();

        repeatPasswordNode = createRepeatPasswordNode();
        addRepeatPasswordNode();

        receiveOffersNode = createReceiveOffersNode();
        addReceiveOffersNode();

        errorListNode = createErrorListNode();
        addErrorListNode();
    }

    protected ErrorListNode createErrorListNode() {
        ErrorListNodeFactory errorListNodeFactory = getContext().getInstance(ErrorListNodeFactory.class);
        return errorListNodeFactory.create(this, "errorListNode");
    }

    protected PasswordNode createPasswordNode() {
        PasswordNodeFactory passwordNodeFactory = getContext().getInstance(PasswordNodeFactory.class);
        return passwordNodeFactory.create(this, "passwordNode");
    }

    protected RepeatPasswordNode createRepeatPasswordNode() {
        RepeatPasswordNodeFactory repeatPasswordNodeFactory = getContext().getInstance(RepeatPasswordNodeFactory.class);
        return repeatPasswordNodeFactory.create(this, "repeatPasswordNode");
    }

    protected ReceiveOffersNode createReceiveOffersNode() {
        ReceiveOffersNodeFactory receiveOffersNodeFactory = getContext().getInstance(ReceiveOffersNodeFactory.class);
        return receiveOffersNodeFactory.create(this, "receiveOffersNode");
    }

    protected UsernameNode createUsernameNode() {
        UsernameNodeFactory usernameNodeFactory = getContext().getInstance(UsernameNodeFactory.class);
        return usernameNodeFactory.create(this, "usernameNode");
    }

    protected EmailNode createEmailNode() {
        EmailNodeFactory emailNodeFactory = getContext().getInstance(EmailNodeFactory.class);
        return emailNodeFactory.create(this, "emailNode");
    }

    protected void addUsernameNode() {
        usernameNode.addToParent();
    }

    protected void addPasswordNode() {
        passwordNode.addToParent();
    }

    protected void addRepeatPasswordNode() {
        repeatPasswordNode.addToParent();
    }

    protected void addReceiveOffersNode() {
        receiveOffersNode.addToParent();
    }

    protected void addErrorListNode() {
        errorListNode.addToParent();
    }

    protected void addEmailNode() {
        emailNode.addToParent();
    }

    @Override
    protected void loadChildren() {
        loadUsernameNode();
        loadEmailNode();
        loadPasswordNode();
        loadRepeatPasswordNode();
        loadReceivesOffersNode();
        loadErrorListNode();
    }

    private void loadEmailNode() {
        emailNode.load();
    }

    protected void loadErrorListNode() {
        errorListNode.load();
    }

    protected void loadPasswordNode() {
        passwordNode.load();
    }

    protected void loadUsernameNode() {
        usernameNode.load();
    }

    protected void loadRepeatPasswordNode() {
        repeatPasswordNode.load();
    }

    protected void loadReceivesOffersNode() {
        receiveOffersNode.load();
    }
}
