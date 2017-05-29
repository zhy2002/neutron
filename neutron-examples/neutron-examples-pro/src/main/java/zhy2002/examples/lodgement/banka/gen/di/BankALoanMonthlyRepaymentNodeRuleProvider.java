package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@LoanMonthlyRepaymentNodeScope
public class BankALoanMonthlyRepaymentNodeRuleProvider extends LoanMonthlyRepaymentNodeRuleProvider {

    @Inject
    public BankALoanMonthlyRepaymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanMonthlyRepaymentNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}