package zhy2002.examples.register;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsMethod;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.ValidationError;

import javax.validation.constraints.NotNull;

public class ErrorNode extends LeafUiNode<ErrorListNode, ValidationError> {

    private ValidationError errorInfo;

    protected ErrorNode(@NotNull ErrorListNode parent, @NotNull String name) {
        super(parent, name);

        setValue(new ValidationError());
    }

    @JsMethod
    @Override
    public final void setValue(ValidationError value) {
        this.errorInfo = value;
        setValue(ValidationError.class, value);
    }

    @JsMethod
    @Override
    public final ValidationError getValue() {
        return super.getValue();
    }

    @JsMethod
    public UiNode<?> getSource() {
        return errorInfo.getOrigin();
    }

    public void setSource(UiNode<?> source) {
        errorInfo.setOrigin(source);
    }

    @JsMethod
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
