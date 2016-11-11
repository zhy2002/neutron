package zhy2002.neutron.examples.register;

import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.VoidUiNode;

import javax.validation.constraints.NotNull;

public class RootNode extends ObjectUiNode<VoidUiNode> {

    private PasswordNode passwordNode;
    private ErrorListNode errorListNode;


    protected RootNode(@NotNull UiNodeContext context) {
        super(context);
    }

    void setPasswordNode(PasswordNode passwordNode) {
        this.passwordNode = passwordNode;
    }

    void setErrorList(ErrorListNode errorListNode) {
        this.errorListNode = errorListNode;
    }

    public PasswordNode getPasswordNode() {
        return passwordNode;
    }

    public ErrorListNode getErrorListNode() {
        return errorListNode;
    }
}
