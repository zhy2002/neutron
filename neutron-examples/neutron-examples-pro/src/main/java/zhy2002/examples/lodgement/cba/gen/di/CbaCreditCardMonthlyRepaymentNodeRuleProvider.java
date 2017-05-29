package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CreditCardMonthlyRepaymentNodeScope
public class CbaCreditCardMonthlyRepaymentNodeRuleProvider extends CreditCardMonthlyRepaymentNodeRuleProvider {

    @Inject
    public CbaCreditCardMonthlyRepaymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardMonthlyRepaymentNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
