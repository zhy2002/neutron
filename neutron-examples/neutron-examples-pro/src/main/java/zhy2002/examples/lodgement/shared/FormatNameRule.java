package zhy2002.examples.lodgement.shared;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeActionEventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.ObjectActionEvent;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.ValueUtil;

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
                        ObjectActionEvent.class,
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
