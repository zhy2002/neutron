package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class BeingPurchasedFlagNodeFactory implements ChildNodeFactory<BeingPurchasedFlagNode, UsageNode> {

    @Override
    public BeingPurchasedFlagNode create(UsageNode parent, String name) {
        return new BeingPurchasedFlagNode(parent, name);
    }
}
