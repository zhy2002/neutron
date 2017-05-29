package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.cba.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@LoanClearingFlagNodeScope
public class CbaLoanClearingFlagNodeRuleProvider extends LoanClearingFlagNodeRuleProvider {

    @Inject
    public CbaLoanClearingFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanClearingFlagNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<BooleanEnableSiblingRule> booleanEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        BooleanEnableSiblingRule booleanEnableSiblingRule = booleanEnableSiblingRuleProvider.get();
        booleanEnableSiblingRule.setSiblingName("loanBreakCostNode");
        createdRules.add(booleanEnableSiblingRule);
    }

}
