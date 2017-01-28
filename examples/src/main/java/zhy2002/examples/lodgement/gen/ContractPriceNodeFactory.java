package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContractPriceNodeFactory implements ChildNodeFactory<ContractPriceNode, PropertyNode> {

    @Override
    public ContractPriceNode create(PropertyNode parent, String name) {
        return new ContractPriceNode(parent, name);
    }
}
