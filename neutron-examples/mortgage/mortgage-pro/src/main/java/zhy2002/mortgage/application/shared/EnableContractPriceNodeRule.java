package zhy2002.mortgage.application.shared;


import zhy2002.mortgage.application.gen.node.ApprovalInPrincipleFlagNode;
import zhy2002.mortgage.application.gen.node.ContractPriceNode;
import zhy2002.mortgage.application.gen.node.RealEstateNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class EnableContractPriceNodeRule extends UiNodeRule<RealEstateNode> {

    @Inject
    protected EnableContractPriceNodeRule(@Owner RealEstateNode owner) {
        super(owner);
    }

    @Override
    protected void onLoad() {
        update();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(
                        e -> e.getOrigin() instanceof ApprovalInPrincipleFlagNode,
                        e -> update()
                )
        );
    }

    private void update() {
        ContractPriceNode contractPriceNode = getOwner().getPropertyNode().getContractPriceNode();
        ApprovalInPrincipleFlagNode approvalInPrincipleFlagNode = getOwner().getUsageNode().getApprovalInPrincipleFlagNode();
        if (Boolean.FALSE.equals(approvalInPrincipleFlagNode.getValue())) {
            contractPriceNode.setDisabled(false);
        } else {
            contractPriceNode.resetValue();
            contractPriceNode.setDisabled(true);
        }
    }
}
