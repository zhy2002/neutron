package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ExpenseMonthlyRepaymentNode;
import zhy2002.examples.lodgement.gen.di.*;

@ExpenseMonthlyRepaymentNodeScope
public class ExpenseMonthlyRepaymentNodeRuleProvider implements RuleProvider<ExpenseMonthlyRepaymentNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public ExpenseMonthlyRepaymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(ExpenseMonthlyRepaymentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}