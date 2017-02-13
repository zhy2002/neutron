package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class PersonTrustTypeNodeRuleProvider implements RuleProvider<PersonTrustTypeNode> {

    @Inject
    public PersonTrustTypeNodeRuleProvider() {}

    @Inject
    MembersInjector<TrustTypeChangedRule> trustTypeChangedRuleInjector;

    @Override
    public List<UiNodeRule<PersonTrustTypeNode>> createRules(PersonTrustTypeNode node) {
        List<UiNodeRule<PersonTrustTypeNode>> rules = new ArrayList<>();
        rules.add(createTrustTypeChangedRule(node));
        return rules;
    }

    private TrustTypeChangedRule createTrustTypeChangedRule(PersonTrustTypeNode node) {
        TrustTypeChangedRule rule = newTrustTypeChangedRule(node);
        trustTypeChangedRuleInjector.injectMembers(rule);
        return rule;
    }


    protected TrustTypeChangedRule newTrustTypeChangedRule(PersonTrustTypeNode node) {
        return new TrustTypeChangedRuleImpl(node);
    }
}
