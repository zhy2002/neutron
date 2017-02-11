package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class ReceiveOffersNodeRuleProvider implements RuleProvider<ReceiveOffersNode> {

    @Inject
    public ReceiveOffersNodeRuleProvider() {}

    @Inject
    MembersInjector<EmailIsRequiredWhenReceiveOffersRule> emailIsRequiredWhenReceiveOffersRuleInjector;

    @Override
    public List<UiNodeRule<ReceiveOffersNode>> createRules(ReceiveOffersNode node) {
        List<UiNodeRule<ReceiveOffersNode>> rules = new ArrayList<>();
        rules.add(createEmailIsRequiredWhenReceiveOffersRule(node));
        return rules;
    }

    private EmailIsRequiredWhenReceiveOffersRule createEmailIsRequiredWhenReceiveOffersRule(ReceiveOffersNode node) {
        EmailIsRequiredWhenReceiveOffersRule rule = newEmailIsRequiredWhenReceiveOffersRule(node);
        emailIsRequiredWhenReceiveOffersRuleInjector.injectMembers(rule);
        return rule;
    }


    protected EmailIsRequiredWhenReceiveOffersRule newEmailIsRequiredWhenReceiveOffersRule(ReceiveOffersNode node) {
        return new EmailIsRequiredWhenReceiveOffersRuleImpl(node);
    }
}
