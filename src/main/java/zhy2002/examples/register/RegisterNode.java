package zhy2002.examples.register;

import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.node.ChildNodeFactory;
import zhy2002.neutron.node.ObjectUiNode;
import zhy2002.neutron.node.VoidUiNode;

import javax.validation.constraints.NotNull;

public class RegisterNode extends ObjectUiNode<VoidUiNode> {

    private UsernameNode usernameNode;
    private PasswordNode passwordNode;
    private ErrorListNode errorListNode;

    RegisterNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    public UsernameNode getUsernameNode() {
        return usernameNode;
    }

    public PasswordNode getPasswordNode() {
        return passwordNode;
    }

    public ErrorListNode getErrorListNode() {
        return errorListNode;
    }

    @Override
    protected void initializeSelf() {
    }

    @Override
    protected void addChildren() {
        usernameNode = createUsernameNode();
        addUsernameNode();

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

    protected void addUsernameNode() {
        usernameNode.addToParent();
    }

    protected void addPasswordNode() {
        passwordNode.addToParent();
    }

    protected void addErrorListNode() {
        errorListNode.addToParent();
    }

    @Override
    protected void loadChildren() {
        loadUsernameNode();
        loadPasswordNode();
        loadErrorListNode();
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
