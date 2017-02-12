package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class EmploymentEndedNodeRuleProvider implements RuleProvider<EmploymentEndedNode> {

    @Inject
    public EmploymentEndedNodeRuleProvider() {}

    @Inject
    MembersInjector<EmploymentEndedNoEarlierThanEmploymentStartedRule> employmentEndedNoEarlierThanEmploymentStartedRuleInjector;

    @Override
    public List<UiNodeRule<EmploymentEndedNode>> createRules(EmploymentEndedNode node) {
        List<UiNodeRule<EmploymentEndedNode>> rules = new ArrayList<>();
        rules.add(createEmploymentEndedNoEarlierThanEmploymentStartedRule(node));
        return rules;
    }

    private EmploymentEndedNoEarlierThanEmploymentStartedRule createEmploymentEndedNoEarlierThanEmploymentStartedRule(EmploymentEndedNode node) {
        EmploymentEndedNoEarlierThanEmploymentStartedRule rule = newEmploymentEndedNoEarlierThanEmploymentStartedRule(node);
        employmentEndedNoEarlierThanEmploymentStartedRuleInjector.injectMembers(rule);
        return rule;
    }


    protected EmploymentEndedNoEarlierThanEmploymentStartedRule newEmploymentEndedNoEarlierThanEmploymentStartedRule(EmploymentEndedNode node) {
        return new EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl(node);
    }
}
