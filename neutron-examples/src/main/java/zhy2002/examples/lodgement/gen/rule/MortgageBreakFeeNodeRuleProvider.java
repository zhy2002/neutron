package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MortgageBreakFeeNode;


@MortgageBreakFeeNodeScope
public class MortgageBreakFeeNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<MortgageBreakFeeNode> {

    @Inject
    public MortgageBreakFeeNodeRuleProvider() {}

    @Override
    public void initializeState(MortgageBreakFeeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
