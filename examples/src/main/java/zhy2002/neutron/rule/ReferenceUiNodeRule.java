package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.event.NodeReferenceStateChangeEvent;
import zhy2002.neutron.event.NodeReferenceStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;


public class ReferenceUiNodeRule extends UiNodeRule<ReferenceUiNode<?>> {

    @Inject
    NodeFinder nodeFinder;

    @Inject
    NodeReferenceRegistry nodeReferenceRegistry;

    public ReferenceUiNodeRule(ReferenceUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new NodeReferenceStateChangeEventBinding(
                        this::updateReference
                )
        );
    }

    private void updateReference(NodeReferenceStateChangeEvent event) {
        nodeReferenceRegistry.update(getOwner(), event.getOldValue(), event.getNewValue());
    }
}
