package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryClassNode;
import zhy2002.neutron.NodeRemoveEvent;


public class TrustBeneficiaryClassNodeRemoveEvent extends NodeRemoveEvent<TrustBeneficiaryClassNode> {
    public TrustBeneficiaryClassNodeRemoveEvent(TrustBeneficiaryClassNode target) {
        super(target);
    }
}