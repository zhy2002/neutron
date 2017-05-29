package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@LoanLimitAmountNodeScope
public class BankCLoanLimitAmountNodeRuleProvider extends LoanLimitAmountNodeRuleProvider {

    @Inject
    public BankCLoanLimitAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanLimitAmountNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
