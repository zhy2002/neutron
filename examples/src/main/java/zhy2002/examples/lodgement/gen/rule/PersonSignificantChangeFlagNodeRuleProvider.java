package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class PersonSignificantChangeFlagNodeRuleProvider implements RuleProvider<PersonSignificantChangeFlagNode> {

    @Inject
    public PersonSignificantChangeFlagNodeRuleProvider() {}

    @Inject
    MembersInjector<PersonSignificantChangeRule> personSignificantChangeRuleInjector;

    @Override
    public List<UiNodeRule<PersonSignificantChangeFlagNode>> createRules(PersonSignificantChangeFlagNode node) {
        List<UiNodeRule<PersonSignificantChangeFlagNode>> rules = new ArrayList<>();
        rules.add(createPersonSignificantChangeRule(node));
        return rules;
    }

    private PersonSignificantChangeRule createPersonSignificantChangeRule(PersonSignificantChangeFlagNode node) {
        PersonSignificantChangeRule rule = newPersonSignificantChangeRule(node);
        personSignificantChangeRuleInjector.injectMembers(rule);
        return rule;
    }


    protected PersonSignificantChangeRule newPersonSignificantChangeRule(PersonSignificantChangeFlagNode node) {
        return new PersonSignificantChangeRuleImpl(node);
    }
}
