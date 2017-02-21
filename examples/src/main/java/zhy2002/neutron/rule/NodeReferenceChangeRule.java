package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class NodeReferenceChangeRule extends UiNodeRule<ReferenceUiNode<?>> {

    @Inject
    NodeReferenceRegistry nodeReferenceRegistry;

    public NodeReferenceChangeRule(ReferenceUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        this::loadReference,
                        Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)
                ),
                new StringStateChangeEventBinding(
                        this::updateReference
                )
        );
    }

    private void loadReference(RefreshUiNodeEvent event) {
        nodeReferenceRegistry.update(getOwner(), null, getOwner().getValue());
    }

    private void updateReference(StringStateChangeEvent event) {
        nodeReferenceRegistry.update(getOwner(), event.getOldValue(), event.getNewValue());
    }
}
