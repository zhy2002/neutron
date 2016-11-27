package zhy2002.neutron.rule;

import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeEvent;

/**
 * Created by ZHY on 16/11/2016.
 */
public abstract class PreStateChangeRule<E extends UiNodeEvent, N extends UiNode<?>>
        extends UiNodeRule<E, N> {

    protected PreStateChangeRule(N owner, TickPhase phase) {
        super(owner, phase);
    }

}
