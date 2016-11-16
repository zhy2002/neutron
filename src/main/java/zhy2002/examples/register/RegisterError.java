package zhy2002.examples.register;

import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.rule.UiNodeRule;

import java.io.Serializable;

/**
 * Created by ZHY on 12/11/2016.
 */
public class RegisterError implements Serializable {
    private UiNode<?> origin;
    private String message;
    private UiNodeRule rule;

    public UiNode<?> getOrigin() {
        return origin;
    }

    public void setOrigin(UiNode<?> origin) {
        this.origin = origin;
    }

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
