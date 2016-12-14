package zhy2002.neutron.rule;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeRule;

public class ValidationError {
    private UiNode<?> origin;
    private String message;
    private UiNodeRule rule;

    public ValidationError() {}

    public ValidationError(UiNode<?> origin, String message, UiNodeRule rule) {
        this.origin = origin;
        this.message = message;
        this.rule = rule;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValidationError error = (ValidationError) o;

        if (!origin.equals(error.origin)) return false;
        return rule.equals(error.rule);
    }

    @Override
    public int hashCode() {
        int result = origin.hashCode();
        result = 31 * result + rule.hashCode();
        return result;
    }
}
