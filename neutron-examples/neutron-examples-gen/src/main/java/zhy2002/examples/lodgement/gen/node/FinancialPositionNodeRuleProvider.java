package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@FinancialPositionNodeScope
public class FinancialPositionNodeRuleProvider implements RuleProvider<FinancialPositionNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public FinancialPositionNodeRuleProvider() {
    }

    @Override
    public void initializeState(FinancialPositionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<FinancialPositionChangedRule> financialPositionChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(financialPositionChangedRuleProvider.get());
    }

}
