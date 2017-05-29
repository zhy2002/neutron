package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ProductPaymentTypeNodeScope
public class BankBProductPaymentTypeNodeRuleProvider extends ProductPaymentTypeNodeRuleProvider {

    @Inject
    public BankBProductPaymentTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductPaymentTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.PAYMENT_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
