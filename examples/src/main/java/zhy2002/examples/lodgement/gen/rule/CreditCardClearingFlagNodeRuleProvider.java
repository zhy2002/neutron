package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class CreditCardClearingFlagNodeRuleProvider implements RuleProvider<CreditCardClearingFlagNode> {

    @Inject
    public CreditCardClearingFlagNodeRuleProvider() {}

    @Inject
    MembersInjector<CreditCardClearingFlagChangedRule> creditCardClearingFlagChangedRuleInjector;

    @Override
    public List<UiNodeRule<CreditCardClearingFlagNode>> createRules(CreditCardClearingFlagNode node) {
        List<UiNodeRule<CreditCardClearingFlagNode>> rules = new ArrayList<>();
        rules.add(createCreditCardClearingFlagChangedRule(node));
        return rules;
    }

    private CreditCardClearingFlagChangedRule createCreditCardClearingFlagChangedRule(CreditCardClearingFlagNode node) {
        CreditCardClearingFlagChangedRule rule = newCreditCardClearingFlagChangedRule(node);
        creditCardClearingFlagChangedRuleInjector.injectMembers(rule);
        return rule;
    }


    protected CreditCardClearingFlagChangedRule newCreditCardClearingFlagChangedRule(CreditCardClearingFlagNode node) {
        return new CreditCardClearingFlagChangedRuleImpl(node);
    }
}
