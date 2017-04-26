package zhy2002.neutron;

import zhy2002.neutron.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import java.util.Arrays;
import java.util.Collection;

public abstract class UpdateItemNodeLabelRule<N extends UiNode<?>> extends UiNodeRule<N> {

    public UpdateItemNodeLabelRule(N owner) {
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
                        NeutronEventSubjects.INDEX
                ),
                new RefreshEventBinding(
                        this::updateLabel,
                        NeutronEventSubjects.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    protected abstract boolean filter(UiNodeEvent event);

    protected abstract void updateLabel(UiNodeEvent event);
}
