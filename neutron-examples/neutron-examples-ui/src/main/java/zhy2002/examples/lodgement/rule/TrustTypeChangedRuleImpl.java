package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.BaseTrustNode;
import zhy2002.examples.lodgement.gen.node.TrustTypeNode;
import zhy2002.examples.lodgement.gen.rule.TrustTypeChangedRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class TrustTypeChangedRuleImpl extends TrustTypeChangedRule {
    @Inject
    public TrustTypeChangedRuleImpl(@Owner TrustTypeNode owner) {
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
                        NeutronEventSubjects.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private void onChange() {
        BaseTrustNode<?> personTrustNode = getTrustTypeNode().getParent();
        if (getTrustTypeNode().hasValue()) {
            personTrustNode.getTrustNameNode().setDisabled(false);
            personTrustNode.getTrustRegistrationDateNode().setDisabled(false);
        } else {
            personTrustNode.getTrustNameNode().setDisabled(true);
            personTrustNode.getTrustNameNode().setValue("");
            personTrustNode.getTrustRegistrationDateNode().setDisabled(true);
            personTrustNode.getTrustRegistrationDateNode().setValue("");
        }

    }
}
