package zhy2002.neutron.rules;

import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.node.UiNode;

/**
 * Created by ZHY on 6/11/2016.
 */
public abstract class UiNodeRule<T extends UiNode<?>> {

    private final T host;
    private TickPhase phase;

    protected UiNodeRule(T host, TickPhase phase) {
        this.host = host;
        this.phase = phase;
    }

    public T getHost() {
        return host;
    }

    public TickPhase getPhase() {
        return phase;
    }
}
