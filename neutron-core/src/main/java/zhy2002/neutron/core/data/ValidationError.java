package zhy2002.neutron.core.data;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.UiNodeRule;

public class ValidationError {

    private UiNode<?> origin;
    private String message;
    private UiNodeRule rule;
    private UiNode<?> errorNode;

    public ValidationError() {
    }

    public ValidationError(ValidationError error) {
        this.origin = error.origin;
        this.message = error.message;
        this.rule = error.rule;
    }

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

    public UiNodeRule<?> getRule() {
        return rule;
    }

    public void setRule(UiNodeRule<?> rule) {
        this.rule = rule;
    }

    public UiNode<?> getErrorNode() {
        return errorNode;
    }

    public void setErrorNode(UiNode<?> errorNode) {
        this.errorNode = errorNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValidationError that = (ValidationError) o;

        if (origin != null ? !origin.equals(that.origin) : that.origin != null) return false;
        return rule != null ? rule.equals(that.rule) : that.rule == null;
    }

    @Override
    public int hashCode() {
        int result = origin != null ? origin.hashCode() : 0;
        result = 31 * result + (rule != null ? rule.hashCode() : 0);
        return result;
    }
}
