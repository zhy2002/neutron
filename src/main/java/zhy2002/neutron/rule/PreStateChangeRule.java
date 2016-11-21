package zhy2002.neutron.rule;

import zhy2002.neutron.UiNodeEventTypeEnum;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UiNode;

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
    public UiNodeEventTypeEnum getEventType() {
        return UiNodeEventTypeEnum.StateChange;
    }
}
