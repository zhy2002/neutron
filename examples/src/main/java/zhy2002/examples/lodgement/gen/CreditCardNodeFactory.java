package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardNodeFactory implements ChildNodeFactory<CreditCardNode, CreditCardListNode> {

    @Override
    public CreditCardNode create(CreditCardListNode parent, String name) {
        return new CreditCardNode(parent, name);
    }
}
