package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class UnemployedOnBenefitFlagNodeFactory implements ChildNodeFactory<UnemployedOnBenefitFlagNode, UnemployedNode> {

    @Override
    public UnemployedOnBenefitFlagNode create(UnemployedNode parent, String name) {
        return new UnemployedOnBenefitFlagNode(parent, name);
    }
}
