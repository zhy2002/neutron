package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardBreakCostNodeFactory implements ChildNodeFactory<CreditCardBreakCostNode, CreditCardNode> {

    @Override
    public CreditCardBreakCostNode create(CreditCardNode parent, String name) {
        return new CreditCardBreakCostNode(parent, name);
    }
}
