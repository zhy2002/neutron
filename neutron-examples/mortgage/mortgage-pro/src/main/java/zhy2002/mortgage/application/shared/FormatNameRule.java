package zhy2002.mortgage.application.shared;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.NodeActionEventBinding;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.ObjectActionEvent;
import zhy2002.neutron.core.event.VoidActionEvent;
import zhy2002.neutron.core.node.StringUiNode;
import zhy2002.neutron.core.util.ValueUtil;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class FormatNameRule extends UiNodeRule<StringUiNode<?>> {

    @Inject
    protected FormatNameRule(@Owner StringUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singleton(
                new NodeActionEventBinding<>(
                        e -> handleAction(),
                        VoidActionEvent.class,
                        NeutronConstants.ACCEPT_VALUE_ACTION
                )
        );
    }

    private void handleAction() {
        String value = getOwner().getValue();
        if (ValueUtil.isEmpty(value))
            return;

        value = ValueUtil.capFirst(value);
        getOwner().setValue(value);
    }
}
