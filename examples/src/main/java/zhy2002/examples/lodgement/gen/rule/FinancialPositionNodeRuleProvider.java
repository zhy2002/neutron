package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class FinancialPositionNodeRuleProvider implements RuleProvider<FinancialPositionNode> {

    @Inject
    public FinancialPositionNodeRuleProvider() {}

    @Inject
    MembersInjector<FinancialPositionChangedRule> financialPositionChangedRuleInjector;

    @Override
    public List<UiNodeRule<FinancialPositionNode>> createRules(FinancialPositionNode node) {
        List<UiNodeRule<FinancialPositionNode>> rules = new ArrayList<>();
        rules.add(createFinancialPositionChangedRule(node));
        return rules;
    }

    private FinancialPositionChangedRule createFinancialPositionChangedRule(FinancialPositionNode node) {
        FinancialPositionChangedRule rule = newFinancialPositionChangedRule(node);
        financialPositionChangedRuleInjector.injectMembers(rule);
        return rule;
    }


    protected FinancialPositionChangedRule newFinancialPositionChangedRule(FinancialPositionNode node) {
        return new FinancialPositionChangedRuleImpl(node);
    }
}
