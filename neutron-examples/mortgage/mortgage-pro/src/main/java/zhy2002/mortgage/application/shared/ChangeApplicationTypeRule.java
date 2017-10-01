package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.ApplicationTypeNode;
import zhy2002.mortgage.application.gen.node.SpouseNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class ChangeApplicationTypeRule extends UiNodeRule<ApplicationTypeNode> {

    @Inject
    public ChangeApplicationTypeRule(@Owner ApplicationTypeNode owner) {
        super(owner);
    }

    protected ApplicationTypeNode getApplicationTypeNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        (e) -> updateUi()
                )
        );
    }

    @Override
    public void addToOwner() {
        super.addToOwner();

        updateUi();
    }

    private void updateUi() {
        String value = getApplicationTypeNode().getValue();
        SpouseNode spouseNode = getApplicationTypeNode().getParent().getSpouseNode();
        if ("Spouse".equals(value)) {
            spouseNode.setDisabled(false);
        } else {
            spouseNode.setDisabled(true);
            spouseNode.setValue(null);
        }
    }
}
