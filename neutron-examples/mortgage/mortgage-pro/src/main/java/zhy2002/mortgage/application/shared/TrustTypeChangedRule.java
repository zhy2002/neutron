package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.BaseTrustNode;
import zhy2002.mortgage.application.gen.node.TrustTypeNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.RefreshEventBinding;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.config.NeutronConstants;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class TrustTypeChangedRule extends UiNodeRule<TrustTypeNode> {
    @Inject
    public TrustTypeChangedRule(@Owner TrustTypeNode owner) {
        super(owner);
    }

    protected TrustTypeNode getTrustTypeNode() {
        return getOwner();
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
                    if (node == getOwner())
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
