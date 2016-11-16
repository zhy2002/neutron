package zhy2002.examples.register;

import zhy2002.neutron.node.LeafUiNode;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.rule.UiNodeRule;

import javax.validation.constraints.NotNull;

public class ErrorNode extends LeafUiNode<ErrorListNode, RegisterError> {

    protected ErrorNode(@NotNull ErrorListNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        setValueInternal(new RegisterError());
    }

    @Override
    protected void doUnload() {

    }

    public UiNode<?> getSource() {
        return getValueInternal().getOrigin();
    }

    public void setSource(UiNode<?> source) {
        getValueInternal().setOrigin(source);
    }

    public String getMessage() {
        return getValueInternal().getMessage();
    }

    public void setMessage(String message) {
        getValueInternal().setMessage(message);
    }

    public UiNodeRule getRule() {
        return getValueInternal().getRule();
    }

    public void setRule(UiNodeRule rule) {
        getValueInternal().setRule(rule);
    }
}
