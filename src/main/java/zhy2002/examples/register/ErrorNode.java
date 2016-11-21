package zhy2002.examples.register;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.rule.UiNodeRule;

import javax.validation.constraints.NotNull;

@JsType
public class ErrorNode extends LeafUiNode<ErrorListNode, RegisterError> {

    private final RegisterError errorInfo = new RegisterError();

    protected ErrorNode(@NotNull ErrorListNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        setValueInternal(errorInfo);
    }

    @Override
    protected void doUnload() {

    }

    public UiNode<?> getSource() {
        return errorInfo.getOrigin();
    }

    public void setSource(UiNode<?> source) {
        errorInfo.setOrigin(source);
    }

    public String getMessage() {
        return errorInfo.getMessage();
    }

    public void setMessage(String message) {
        errorInfo.setMessage(message);
    }

    @JsIgnore
    public UiNodeRule getRule() {
        return errorInfo.getRule();
    }

    @JsIgnore
    public void setRule(UiNodeRule rule) {
        errorInfo.setRule(rule);
    }
}
