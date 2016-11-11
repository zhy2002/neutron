package zhy2002.neutron.examples.register;

import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.event.TickPhase;

/**
 * Created by ZHY on 6/11/2016.
 */
public class PasswordMinLengthRule extends UiNodeRule {

    private final PasswordNode host;
    private final int minLength;
    private final ErrorNodeFactory errorNodeFactory;

    public PasswordMinLengthRule(PasswordNode host, int minLength, ErrorNodeFactory errorNodeFactory) {
        this.host = host;
        this.minLength = minLength;
        this.errorNodeFactory = errorNodeFactory;
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

        ErrorNode errorNode = errorNodeFactory.create(getErrorListNode(), String.valueOf(getErrorListNode().getChildSequenceNumber()));
        errorNode.setOrigin(getPasswordNode());
        errorNode.setMessage("Password too short.");
        errorNode.setRule(this);
    }

    protected void deactivate() {
        getErrorListNode().remove(errorNode -> errorNode.getRule() == this);
    }


}
