package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.ChangeApplicationTypeRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class ChangeApplicationTypeRuleImpl extends ChangeApplicationTypeRule {

    @Inject
    public ChangeApplicationTypeRuleImpl(@Owner ApplicationTypeNode owner) {
        super(owner);
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
        }
    }
}
