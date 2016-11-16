package zhy2002.neutron.rule;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNode;

/**
 * Created by ZHY on 16/11/2016.
 */
public class PreStateChangeRule<E extends UiNodeEvent, N extends UiNode<?>>
        extends UiNodeRule<E, N> {

    protected PreStateChangeRule(N owner, TickPhase phase) {
        super(owner, phase);
    }

    @Override
    protected void execute(E typedEvent) {

    }

    @Override
    public EventTypeEnum getEventType() {
        return EventTypeEnum.StateChange;
    }
}
