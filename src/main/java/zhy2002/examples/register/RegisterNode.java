package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.ClearHasErrorRule;
import zhy2002.examples.register.rule.SetHasErrorRule;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.node.ChildNodeFactory;
import zhy2002.neutron.node.DefaultUiNodeStateKeys;
import zhy2002.neutron.node.ObjectUiNode;
import zhy2002.neutron.node.VoidUiNode;

import javax.validation.constraints.NotNull;

@JsType
public class RegisterNode extends ObjectUiNode<VoidUiNode> {

    private UsernameNode usernameNode;
    private EmailNode emailNode;
    private PasswordNode passwordNode;
    private ErrorListNode errorListNode;

    RegisterNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    public boolean getHasError() {
        return getStateValueInternal(DefaultUiNodeStateKeys.HAS_ERROR);
    }

    public void setHasError(boolean value) {
        setStateValueInternal(DefaultUiNodeStateKeys.HAS_ERROR, value);
    }

    public UsernameNode getUsernameNode() {
        return usernameNode;
    }

    public PasswordNode getPasswordNode() {
        return passwordNode;
    }

    public EmailNode getEmailNode() {
        return emailNode;
    }

    public ErrorListNode getErrorListNode() {
        return errorListNode;
    }

    @Override
    protected void initializeSelf() {
        setStateValueInternal(DefaultUiNodeStateKeys.HAS_ERROR, false);

        SetHasErrorRule rule = new SetHasErrorRule(this);
        rule.addToOwner();

        ClearHasErrorRule rule2 = new ClearHasErrorRule(this);
        rule2.addToOwner();
    }

    @Override
    protected void addChildren() {
        usernameNode = createUsernameNode();
        addUsernameNode();

        emailNode = createEmailNode();
        addEmailNode();

        passwordNode = createPasswordNode();
        addPasswordNode();

        errorListNode = createErrorListNode();
        addErrorListNode();
    }

    protected ErrorListNode createErrorListNode() {
        ChildNodeFactory<ErrorListNode, RegisterNode> errorListNodeFactory = getContext().getChildNodeFactory(ErrorListNode.class);
        return errorListNodeFactory.create(this, "errorListNode");
    }

    protected PasswordNode createPasswordNode() {
        ChildNodeFactory<PasswordNode, RegisterNode> passwordNodeFactory = getContext().getChildNodeFactory(PasswordNode.class);
        return passwordNodeFactory.create(this, "passwordNode");
    }

    protected UsernameNode createUsernameNode() {
        ChildNodeFactory<UsernameNode, RegisterNode> usernameNodeFactory = getContext().getChildNodeFactory(UsernameNode.class);
        return usernameNodeFactory.create(this, "usernameNode");
    }

    protected EmailNode createEmailNode() {
        ChildNodeFactory<EmailNode, RegisterNode> emailNodeFactory = getContext().getChildNodeFactory(EmailNode.class);
        return emailNodeFactory.create(this, "emailNode");
    }

    protected void addUsernameNode() {
        usernameNode.addToParent();
    }

    protected void addPasswordNode() {
        passwordNode.addToParent();
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


}
