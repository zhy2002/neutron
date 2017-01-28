package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardLimitAmountFactory implements ChildNodeFactory<CreditCardLimitAmount, CreditCardNode> {

    @Override
    public CreditCardLimitAmount create(CreditCardNode parent, String name) {
        return new CreditCardLimitAmount(parent, name);
    }
}
