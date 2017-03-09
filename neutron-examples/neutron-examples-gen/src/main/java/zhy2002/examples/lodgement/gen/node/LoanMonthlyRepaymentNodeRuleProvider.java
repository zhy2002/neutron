package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanMonthlyRepaymentNodeScope
public class LoanMonthlyRepaymentNodeRuleProvider implements RuleProvider<LoanMonthlyRepaymentNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanMonthlyRepaymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanMonthlyRepaymentNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
