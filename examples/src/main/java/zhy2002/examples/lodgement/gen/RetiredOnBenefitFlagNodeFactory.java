package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class RetiredOnBenefitFlagNodeFactory implements ChildNodeFactory<RetiredOnBenefitFlagNode, RetiredEmploymentNode> {

    @Override
    public RetiredOnBenefitFlagNode create(RetiredEmploymentNode parent, String name) {
        return new RetiredOnBenefitFlagNode(parent, name);
    }
}
