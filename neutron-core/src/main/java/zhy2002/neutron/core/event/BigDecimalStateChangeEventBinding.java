package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEventBinding;
import zhy2002.neutron.core.TickPhase;
import zhy2002.neutron.core.UiNodeEventFilter;
import zhy2002.neutron.core.UiNodeEventHandler;
import zhy2002.neutron.core.node.BigDecimalUiNode;
import zhy2002.neutron.core.util.ValueUtil;

public class BigDecimalStateChangeEventBinding extends StateChangeEventBinding<BigDecimalStateChangeEvent> {

    public BigDecimalStateChangeEventBinding(
            UiNodeEventFilter<BigDecimalStateChangeEvent> filter,
            UiNodeEventHandler<BigDecimalStateChangeEvent> handler,
            String subject,
            TickPhase phase
    ) {
        super(filter, handler, BigDecimalStateChangeEvent.class, ValueUtil.ifNull(subject, BigDecimalUiNode.VALUE_PROPERTY.getStateKey()), phase);
    }

    public BigDecimalStateChangeEventBinding(
            UiNodeEventFilter<BigDecimalStateChangeEvent> filter,
            UiNodeEventHandler<BigDecimalStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public BigDecimalStateChangeEventBinding(
            UiNodeEventHandler<BigDecimalStateChangeEvent> handler
    ) {
        this(null, handler);
    }
}
