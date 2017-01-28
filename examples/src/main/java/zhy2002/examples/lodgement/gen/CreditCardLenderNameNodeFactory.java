package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardLenderNameNodeFactory implements ChildNodeFactory<CreditCardLenderNameNode, CreditCardNode> {

    @Override
    public CreditCardLenderNameNode create(CreditCardNode parent, String name) {
        return new CreditCardLenderNameNode(parent, name);
    }
}
