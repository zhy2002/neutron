package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CreditCardMonthlyRepaymentNode;
import zhy2002.examples.lodgement.gen.di.*;

@CreditCardMonthlyRepaymentNodeScope
public class CreditCardMonthlyRepaymentNodeRuleProvider implements RuleProvider<CreditCardMonthlyRepaymentNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public CreditCardMonthlyRepaymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardMonthlyRepaymentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
