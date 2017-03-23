package zhy2002.neutron;


import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class ResetDirtyRule extends UiNodeRule<UiNode<?>> {

    @Inject
    protected ResetDirtyRule(@Owner UiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new RefreshEventBinding(
                        e -> getOwner().resetDirty(),
                        Collections.singleton(NeutronEventSubjects.RESET_DIRTY_REFRESH_REASON)
                )
        );
    }
}
