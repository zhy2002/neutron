package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.EmploymentTypeChangedRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Logger;

public class EmploymentTypeChangedRuleImpl extends EmploymentTypeChangedRule {

    private static Logger logger = Logger.getLogger("EmploymentTypeChangedRuleImpl");

    @Inject
    public EmploymentTypeChangedRuleImpl(@Owner EmploymentTypeNode owner) {
        super(owner);
    }

    private EmploymentNode<?> getEmploymentNode() {
        return getOwner().getParent();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        this::changeEmploymentType
                )
        );
    }

    //todo this is a temporary solution
    //replace with load default json or deferred init instead
    @Override
    public void addToOwner() {
        super.addToOwner();

        changeEmploymentType(getOwner().getValue());
    }

    private void changeEmploymentType(StringStateChangeEvent event) {
        String newType = event.getNewValue();
        changeEmploymentType(newType);
    }

    private void changeEmploymentType(String newType) {
        logger.info("Changing employment type to: " + newType);
        for (UiNode<?> node : getEmploymentNode().getChildren()) {
            if (node.getName().equals(newType)) {
                node.setDisabled(false);
                getEmploymentNode().setSelectedName(newType);
            } else {
                node.setDisabled(true);
            }
        }
    }
}
