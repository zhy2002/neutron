package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.ClearHasErrorRule;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRule;
import zhy2002.examples.register.rule.SetHasErrorRule;
import zhy2002.neutron.UiNodeContextImpl;
import zhy2002.neutron.ChildNodeFactory;
import zhy2002.neutron.PredefinedUiNodeStateKeys;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.VoidUiNode;

import javax.validation.constraints.NotNull;

@JsType
public class RegisterNode extends ObjectUiNode<VoidUiNode> {

    private UsernameNode usernameNode;
    private EmailNode emailNode;
    private PasswordNode passwordNode;
    private ErrorListNode errorListNode;

    RegisterNode(@NotNull UiNodeContextImpl<?> context) {
        super(context);
    }

    public boolean getHasError() {
        return getStateValueInternal(PredefinedUiNodeStateKeys.HAS_ERROR);
    }

    public void setHasError(boolean value) {
        setStateValueInternal(PredefinedUiNodeStateKeys.HAS_ERROR, value);
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
        setStateValueInternal(PredefinedUiNodeStateKeys.HAS_ERROR, false);

        SetHasErrorRule rule = new SetHasErrorRule(this);
        rule.addToOwner();

        ClearHasErrorRule rule2 = new ClearHasErrorRule(this);
        rule2.addToOwner();
    }

    @Override
    protected void addChildren() {
        usernameNode = createUsernameNode();
        DefaultEmailByUsernameRule defaultEmailByUsernameRule = new DefaultEmailByUsernameRule(usernameNode);
        defaultEmailByUsernameRule.addToOwner();
        addUsernameNode();

        emailNode = createEmailNode();
        addEmailNode();

        passwordNode = createPasswordNode();
        addPasswordNode();

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
