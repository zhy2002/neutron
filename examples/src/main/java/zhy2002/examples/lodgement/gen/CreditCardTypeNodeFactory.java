package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardTypeNodeFactory implements ChildNodeFactory<CreditCardTypeNode, CreditCardNode> {

    @Override
    public CreditCardTypeNode create(CreditCardNode parent, String name) {
        return new CreditCardTypeNode(parent, name);
    }
}
