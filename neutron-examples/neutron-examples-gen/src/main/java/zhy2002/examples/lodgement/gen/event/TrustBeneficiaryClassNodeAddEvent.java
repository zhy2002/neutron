package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryClassNode;
import zhy2002.neutron.NodeAddEvent;


public class TrustBeneficiaryClassNodeAddEvent extends NodeAddEvent<TrustBeneficiaryClassNode> {

    public TrustBeneficiaryClassNodeAddEvent(TrustBeneficiaryClassNode target) {
        super(target);
    }
}
