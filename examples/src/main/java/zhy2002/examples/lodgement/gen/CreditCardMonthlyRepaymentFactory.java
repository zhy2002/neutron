package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCardMonthlyRepaymentFactory implements ChildNodeFactory<CreditCardMonthlyRepayment, CreditCardNode> {

    @Override
    public CreditCardMonthlyRepayment create(CreditCardNode parent, String name) {
        return new CreditCardMonthlyRepayment(parent, name);
    }
}
