package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardClearingFlagNodeFactory implements ChildNodeFactory<CreditCardClearingFlagNode, CreditCardNode> {

    @Override
    public CreditCardClearingFlagNode create(CreditCardNode parent, String name) {
        return new CreditCardClearingFlagNode(parent, name);
    }
}
