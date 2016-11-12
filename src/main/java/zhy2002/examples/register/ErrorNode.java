package zhy2002.examples.register;

import zhy2002.neutron.node.LeafUiNode;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.rules.UiNodeRule;

import javax.validation.constraints.NotNull;

public class ErrorNode extends LeafUiNode<ErrorListNode, RegisterError> {

    private UiNode<?> origin;
    private String message;
    private UiNodeRule rule;

    protected ErrorNode(@NotNull ErrorListNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {

    }

    @Override
    protected void doUnload() {

    }

    public UiNode<?> getOrigin() {
        return origin;
    }

    public void setOrigin(UiNode<?> origin) {
        this.origin = origin;
        setStateValueInternal("origin", origin);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        setStateValueInternal("message", message);
    }

    public UiNodeRule getRule() {
        return rule;
    }

    public void setRule(UiNodeRule rule) {
        this.rule = rule;
        setStateValueInternal("rule", rule);
    }
}
