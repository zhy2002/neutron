package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@ExpenseMonthlyRepaymentNodeScope
public class ExpenseMonthlyRepaymentNodeRuleProvider implements RuleProvider<ExpenseMonthlyRepaymentNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

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
