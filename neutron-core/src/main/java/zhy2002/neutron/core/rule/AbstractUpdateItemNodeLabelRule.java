package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.*;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;

import java.util.Arrays;
import java.util.Collection;

public abstract class AbstractUpdateItemNodeLabelRule<N extends UiNode<?>> extends UiNodeRule<N> {

    public AbstractUpdateItemNodeLabelRule(N owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new StringStateChangeEventBinding(
                        this::filter,
                        this::updateLabel
                ),
                new IntegerStateChangeEventBinding(
                        this::updateLabel,
                        UiNode.INDEX_PROPERTY.getStateKey()
                ),
                new RefreshEventBinding(
                        this::updateLabel,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    protected abstract boolean filter(UiNodeEvent event);

    protected abstract void updateLabel(UiNodeEvent event);
}
