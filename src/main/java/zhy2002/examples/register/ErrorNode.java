package zhy2002.examples.register;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsMethod;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.data.ValidationError;

import javax.validation.constraints.NotNull;

public class ErrorNode extends LeafUiNode<ErrorListNode, ValidationError> {

    ErrorNode(@NotNull ErrorListNode parent, @NotNull String name) {
        super(parent, name);

        setValue(new ValidationError());
    }

    @JsMethod
    @Override
    public final void setValue(ValidationError value) {
        setValue(ValidationError.class, value);
    }

    @JsMethod
    public UiNode<?> getSource() {
        return getValue().getOrigin();
    }

    public void setSource(UiNode<?> source) {
        getValue().setOrigin(source);
    }

    @JsMethod
    public String getMessage() {
        return getValue().getMessage();
    }

    public void setMessage(String message) {
        getValue().setMessage(message);
    }

    @JsIgnore
    public UiNodeRule<?> getRule() {
        return getValue().getRule();
    }

    @JsIgnore
    public void setRule(UiNodeRule<?> rule) {
        getValue().setRule(rule);
    }
}
