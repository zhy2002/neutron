package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class EmploymentTypeNodeRuleProvider implements RuleProvider<EmploymentTypeNode> {

    @Inject
    public EmploymentTypeNodeRuleProvider() {}

    @Inject
    MembersInjector<EmploymentTypeChangedRule> employmentTypeChangedRuleInjector;

    @Override
    public List<UiNodeRule<EmploymentTypeNode>> createRules(EmploymentTypeNode node) {
        List<UiNodeRule<EmploymentTypeNode>> rules = new ArrayList<>();
        rules.add(createEmploymentTypeChangedRule(node));
        return rules;
    }

    private EmploymentTypeChangedRule createEmploymentTypeChangedRule(EmploymentTypeNode node) {
        EmploymentTypeChangedRule rule = newEmploymentTypeChangedRule(node);
        employmentTypeChangedRuleInjector.injectMembers(rule);
        return rule;
    }


    protected EmploymentTypeChangedRule newEmploymentTypeChangedRule(EmploymentTypeNode node) {
        return new EmploymentTypeChangedRuleImpl(node);
    }
}
