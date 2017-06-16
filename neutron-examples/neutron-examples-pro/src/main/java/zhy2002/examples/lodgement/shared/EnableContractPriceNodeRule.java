package zhy2002.examples.lodgement.shared;


import zhy2002.examples.lodgement.gen.node.ApprovalInPrincipleFlagNode;
import zhy2002.examples.lodgement.gen.node.ContractPriceNode;
import zhy2002.examples.lodgement.gen.node.RealEstateNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;

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
