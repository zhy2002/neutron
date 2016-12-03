package zhy2002.examples.register;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeRule;

public class RegisterError {
    private UiNode<?> origin;
    private String message;
    private UiNodeRule rule;

    @JsMethod
    public UiNode<?> getOrigin() {
        return origin;
    }

    public void setOrigin(UiNode<?> origin) {
        this.origin = origin;
    }

    @JsMethod
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UiNodeRule getRule() {
        return rule;
    }

    public void setRule(UiNodeRule rule) {
        this.rule = rule;
    }
}
