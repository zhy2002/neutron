package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.data.ApplicationNodeConstants;
import zhy2002.examples.lodgement.gen.node.AddressNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeActionEventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.ObjectActionEvent;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;


public class HandleCopyAddressActionRule extends UiNodeRule<AddressNode<?>> {

    @Inject
    protected HandleCopyAddressActionRule(@Owner AddressNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new NodeActionEventBinding<>(
                        this::handleAction,
                        ObjectActionEvent.class,
                        ApplicationNodeConstants.COPY_ADDRESS_ACTION
                )
        );
    }

    private void handleAction(ObjectActionEvent event) {
        AddressNode<?> source = (AddressNode<?>) event.getParameter();
        getOwner().getAddressLineNode().setValue(source.getAddressLineNode().getValue());
        getOwner().getSuburbNode().setValue(source.getSuburbNode().getValue());
        getOwner().getPostcodeNode().setValue(source.getPostcodeNode().getValue());
        getOwner().getCountryNode().setValue(source.getCountryNode().getValue());
    }
}