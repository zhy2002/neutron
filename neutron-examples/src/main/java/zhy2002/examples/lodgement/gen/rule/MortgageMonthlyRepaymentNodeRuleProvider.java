package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MortgageMonthlyRepaymentNode;


@MortgageMonthlyRepaymentNodeScope
public class MortgageMonthlyRepaymentNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<MortgageMonthlyRepaymentNode> {

    @Inject
    public MortgageMonthlyRepaymentNodeRuleProvider() {}

    @Override
    public void initializeState(MortgageMonthlyRepaymentNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
