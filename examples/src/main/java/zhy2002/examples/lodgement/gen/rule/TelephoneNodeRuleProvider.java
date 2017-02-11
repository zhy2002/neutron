package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class TelephoneNodeRuleProvider implements RuleProvider<TelephoneNode<?>> {

    @Inject
    public TelephoneNodeRuleProvider() {}

    @Inject
    MembersInjector<TelephoneCompleteRule> telephoneCompleteRuleInjector;

    @Override
    public List<UiNodeRule<TelephoneNode<?>>> createRules(TelephoneNode<?> node) {
        List<UiNodeRule<TelephoneNode<?>>> rules = new ArrayList<>();
        rules.add(createTelephoneCompleteRule(node));
        return rules;
    }

    private TelephoneCompleteRule createTelephoneCompleteRule(TelephoneNode<?> node) {
        TelephoneCompleteRule rule = newTelephoneCompleteRule(node);
        telephoneCompleteRuleInjector.injectMembers(rule);
        return rule;
    }


    protected TelephoneCompleteRule newTelephoneCompleteRule(TelephoneNode<?> node) {
        return new TelephoneCompleteRuleImpl(node);
    }
}
