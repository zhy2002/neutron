package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LoanBreakCostNode;
import zhy2002.examples.lodgement.gen.di.*;

@LoanBreakCostNodeScope
public class LoanBreakCostNodeRuleProvider implements RuleProvider<LoanBreakCostNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanBreakCostNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanBreakCostNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
