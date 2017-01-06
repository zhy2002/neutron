package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.PredefinedPhases;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class UpdateObjectHasValueRule extends UiNodeRule<ObjectUiNode<?>> {

    private final Set<String> noneEmptyChildNames = new HashSet<>();

    public UpdateObjectHasValueRule(ObjectUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new BooleanStateChangeEventBinding(
                        event -> event.getOrigin() != null && event.getOrigin().getParent() == getOwner(),
                        this::updateHasValue,
                        Collections.singletonList(NeutronEventSubjects.HAS_VALUE),
                        PredefinedPhases.Post
                )
        );
    }

    private void updateHasValue(BooleanStateChangeEvent event) {
        if (Boolean.TRUE.equals(event.getNewValue())) {
            noneEmptyChildNames.add(event.getSubject());
        } else {
            noneEmptyChildNames.remove(event.getSubject());
        }

        getOwner().setStateValue(NeutronEventSubjects.HAS_VALUE, Boolean.class, !noneEmptyChildNames.isEmpty());
    }
}