package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.TrustTypeChangedRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TrustTypeChangedRuleImpl extends TrustTypeChangedRule {
    @Inject
    public TrustTypeChangedRuleImpl(@Owner PersonTrustTypeNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new StringStateChangeEventBinding(
                        (e) -> onChange()
                ),
                new RefreshEventBinding(
                        (e) -> onChange(),
                        Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)
                )
        );
    }

    private void onChange() {
        PersonTrustNode personTrustNode = getPersonTrustTypeNode().getParent();
        if (getPersonTrustTypeNode().hasValue()) {
            personTrustNode.getPersonTrustNameNode().setDisabled(false);
            personTrustNode.getPersonTrustRegistrationDateNode().setDisabled(false);
        } else {
            personTrustNode.getPersonTrustNameNode().setDisabled(true);
            personTrustNode.getPersonTrustNameNode().setValue("");
            personTrustNode.getPersonTrustRegistrationDateNode().setDisabled(true);
            personTrustNode.getPersonTrustRegistrationDateNode().setValue("");
        }

    }
}
