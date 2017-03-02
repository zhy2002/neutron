package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditCardMonthlyRepaymentNode;


@CreditCardMonthlyRepaymentNodeScope
public class CreditCardMonthlyRepaymentNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<CreditCardMonthlyRepaymentNode> {

    @Inject
    public CreditCardMonthlyRepaymentNodeRuleProvider() {}

    @Override
    public void initializeState(CreditCardMonthlyRepaymentNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
