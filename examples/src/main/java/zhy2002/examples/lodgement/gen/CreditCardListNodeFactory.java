package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardListNodeFactory implements ChildNodeFactory<CreditCardListNode, LiabilitiesNode> {

    @Override
    public CreditCardListNode create(LiabilitiesNode parent, String name) {
        return new CreditCardListNode(parent, name);
    }
}
