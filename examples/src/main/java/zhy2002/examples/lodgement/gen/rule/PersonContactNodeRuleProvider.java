package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class PersonContactNodeRuleProvider implements RuleProvider<PersonContactNode> {

    @Inject
    public PersonContactNodeRuleProvider() {}

    @Inject
    MembersInjector<HomeOrWorkPhoneRequiredRule> homeOrWorkPhoneRequiredRuleInjector;

    @Override
    public List<UiNodeRule<PersonContactNode>> createRules(PersonContactNode node) {
        List<UiNodeRule<PersonContactNode>> rules = new ArrayList<>();
        rules.add(createHomeOrWorkPhoneRequiredRule(node));
        return rules;
    }

    private HomeOrWorkPhoneRequiredRule createHomeOrWorkPhoneRequiredRule(PersonContactNode node) {
        HomeOrWorkPhoneRequiredRule rule = newHomeOrWorkPhoneRequiredRule(node);
        homeOrWorkPhoneRequiredRuleInjector.injectMembers(rule);
        return rule;
    }


    protected HomeOrWorkPhoneRequiredRule newHomeOrWorkPhoneRequiredRule(PersonContactNode node) {
        return new HomeOrWorkPhoneRequiredRuleImpl(node);
    }
}
