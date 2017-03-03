package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ExpenseMonthlyRepaymentNode;


@ExpenseMonthlyRepaymentNodeScope
public class ExpenseMonthlyRepaymentNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<ExpenseMonthlyRepaymentNode> {

    @Inject
    public ExpenseMonthlyRepaymentNodeRuleProvider() {}

    @Override
    public void initializeState(ExpenseMonthlyRepaymentNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
