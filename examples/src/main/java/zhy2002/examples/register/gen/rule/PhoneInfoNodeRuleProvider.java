package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class PhoneInfoNodeRuleProvider implements RuleProvider<PhoneInfoNode> {

    @Inject
    public PhoneInfoNodeRuleProvider() {}

    @Inject
    MembersInjector<PhoneInfoAllOrNothingRule> phoneInfoAllOrNothingRuleInjector;

    @Override
    public List<UiNodeRule<PhoneInfoNode>> createRules(PhoneInfoNode node) {
        List<UiNodeRule<PhoneInfoNode>> rules = new ArrayList<>();
        rules.add(createPhoneInfoAllOrNothingRule(node));
        return rules;
    }

    private PhoneInfoAllOrNothingRule createPhoneInfoAllOrNothingRule(PhoneInfoNode node) {
        PhoneInfoAllOrNothingRule rule = newPhoneInfoAllOrNothingRule(node);
        phoneInfoAllOrNothingRuleInjector.injectMembers(rule);
        return rule;
    }


    protected PhoneInfoAllOrNothingRule newPhoneInfoAllOrNothingRule(PhoneInfoNode node) {
        return new PhoneInfoAllOrNothingRuleImpl(node);
    }
}
