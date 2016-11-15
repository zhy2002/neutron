package zhy2002.examples.register.rules;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.PasswordNode;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNodeRule;

/**
 * Created by ZHY on 6/11/2016.
 */
public class PasswordMinLengthRule extends UiNodeRule<PasswordNode> {

    private final int minLength;
    private ErrorNode errorNode;

    public PasswordMinLengthRule(PasswordNode host, int minLength) {
        super(host, DefaultPhases.Validate);
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

    @Override
    public void fire(UiNodeEvent event) {
       // fire(StateChangeEvent<Pass>)event);
    }

    public int getMinLength() {
        return minLength;
    }

    public PasswordNode getPasswordNode() {
        return getHost();
    }

    /**
     * This is an example of a query property.
     *
     * @return
     */
    public ErrorListNode getErrorListNode() {
        return null;
        //return this.host.getParent().getErrorListNode();
    }

    protected boolean canFire(StateChangeEvent event) {
        return true; //"value".equals(event.getPropertyName()) && event.getOrigin() == getHost();
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
        //getErrorListNode().remove(errorNode -> errorNode.getRule() == this);
    }


}
