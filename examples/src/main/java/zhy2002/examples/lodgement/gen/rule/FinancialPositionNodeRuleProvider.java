package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.FinancialPositionNode;


@FinancialPositionNodeScope
public class FinancialPositionNodeRuleProvider
    extends ObjectUiNodeRuleProvider<FinancialPositionNode> {

    @Inject
    public FinancialPositionNodeRuleProvider() {}

    @Override
    public void initializeState(FinancialPositionNode node) {
    }


    @Inject
    Provider<FinancialPositionChangedRule> financialPositionChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(financialPositionChangedRuleProvider.get());
    }

}
