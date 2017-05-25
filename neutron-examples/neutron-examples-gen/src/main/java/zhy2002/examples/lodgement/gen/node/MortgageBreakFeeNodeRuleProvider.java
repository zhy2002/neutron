package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@MortgageBreakFeeNodeScope
public class MortgageBreakFeeNodeRuleProvider implements RuleProvider<MortgageBreakFeeNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageBreakFeeNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageBreakFeeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
