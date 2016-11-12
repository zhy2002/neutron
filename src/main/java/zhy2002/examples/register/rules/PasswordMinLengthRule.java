package zhy2002.examples.register.rules;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.PasswordNode;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.rules.UiNodeRule;

/**
 * Created by ZHY on 6/11/2016.
 */
public class PasswordMinLengthRule extends UiNodeRule {

    private final PasswordNode host;
    private final int minLength;

    public PasswordMinLengthRule(PasswordNode host, int minLength) {
        this.host = host;
        this.minLength = minLength;
    }

    /**
     * The phase to fire this rule.
     * Compared by reference.
     *
     * @return
     */
    public TickPhase getPhase() {
        return DefaultPhases.Validate;
    }

    public int getMinLength() {
        return minLength;
    }

    public PasswordNode getPasswordNode() {
        return host;
    }

    /**
     * This is an example of a query property.
     *
     * @return
     */
    public ErrorListNode getErrorListNode() {
        return this.host.getParent().getErrorListNode();
    }

    protected boolean canFire(StateChangeEvent event) {
        return "value".equals(event.getPropertyName()) && event.getOrigin() == host;
    }

    public final boolean fire(StateChangeEvent event) {
        if (!canFire(event)) {
            return false;
        }

        if (isActivated()) {
            activate();
        } else {
            deactivate();
        }
        return true;
    }

    protected boolean isActivated() {
        return getPasswordNode().getValue("").length() < getMinLength();
    }

    protected void activate() {

        //rrorNode errorNode = errorNodeFactory.create(getErrorListNode(), String.valueOf(getErrorListNode().getChildSequenceNumber()));
//        errorNode.setOrigin(getPasswordNode());
//        errorNode.setMessage("Password too short.");
//        errorNode.setRule(this);
    }

    protected void deactivate() {
        getErrorListNode().remove(errorNode -> errorNode.getRule() == this);
    }


}
