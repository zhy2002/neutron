package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardAmountOwingNodeFactory implements ChildNodeFactory<CreditCardAmountOwingNode, CreditCardNode> {

    @Override
    public CreditCardAmountOwingNode create(CreditCardNode parent, String name) {
        return new CreditCardAmountOwingNode(parent, name);
    }
}
