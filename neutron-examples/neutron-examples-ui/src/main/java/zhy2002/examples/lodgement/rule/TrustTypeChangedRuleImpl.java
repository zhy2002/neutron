package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.BaseTrustNode;
import zhy2002.examples.lodgement.gen.node.TrustTypeNode;
import zhy2002.examples.lodgement.gen.rule.TrustTypeChangedRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronConstants;

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
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private void onChange() {
        BaseTrustNode<?> personTrustNode = getTrustTypeNode().getParent();
        final boolean disabled = !getTrustTypeNode().hasValue();
        Arrays.stream(personTrustNode.getChildren()).forEach(
                node -> {
                    if (node == personTrustNode)
                        return;

                    if (disabled) {
                        node.resetValue();
                        node.setDisabled(true);
                    } else {
                        node.setDisabled(false);
                    }
                }
        );
    }
}
