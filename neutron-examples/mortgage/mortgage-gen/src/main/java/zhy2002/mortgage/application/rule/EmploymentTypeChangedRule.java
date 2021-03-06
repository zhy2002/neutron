package zhy2002.mortgage.application.rule;

import zhy2002.mortgage.application.gen.node.EmploymentNode;
import zhy2002.mortgage.application.gen.node.EmploymentTypeNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.RefreshEventBinding;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEvent;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

public class EmploymentTypeChangedRule extends UiNodeRule<EmploymentTypeNode> {

    private static Logger logger = Logger.getLogger("EmploymentTypeChangedRule");

    @Inject
    public EmploymentTypeChangedRule(@Owner EmploymentTypeNode owner) {
        super(owner);
    }

    private EmploymentNode<?> getEmploymentNode() {
        return getOwner().getParent();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new StringStateChangeEventBinding(
                        this::changeEmploymentType
                ),
                new RefreshEventBinding(
                        e -> refresh(),
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private void refresh() {
        changeEmploymentType(getOwner().getValue());
    }

    private void changeEmploymentType(StringStateChangeEvent event) {
        String newType = event.getNewValue();
        changeEmploymentType(newType);
    }

    private void changeEmploymentType(String newType) {
        logger.info("Changing employment type to: " + newType);
        for (UiNode<?> node : getEmploymentNode().getChildren()) {
            if (node == getOwner())
                continue;

            if (node.getName().equals(newType)) {
                node.setDisabled(false);
                getEmploymentNode().setSelectedName(newType);
            } else {
                node.setDisabled(true);
            }
        }
    }
}
