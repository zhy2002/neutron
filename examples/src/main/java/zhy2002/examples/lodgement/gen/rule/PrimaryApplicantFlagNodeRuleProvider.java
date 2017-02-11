package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class PrimaryApplicantFlagNodeRuleProvider implements RuleProvider<PrimaryApplicantFlagNode> {

    @Inject
    public PrimaryApplicantFlagNodeRuleProvider() {}

    @Inject
    MembersInjector<AtLeastOnePrimaryApplicantRule> atLeastOnePrimaryApplicantRuleInjector;
    @Inject
    MembersInjector<AtMostOnePrimaryApplicantRule> atMostOnePrimaryApplicantRuleInjector;

    @Override
    public List<UiNodeRule<PrimaryApplicantFlagNode>> createRules(PrimaryApplicantFlagNode node) {
        List<UiNodeRule<PrimaryApplicantFlagNode>> rules = new ArrayList<>();
        rules.add(createAtLeastOnePrimaryApplicantRule(node));
        rules.add(createAtMostOnePrimaryApplicantRule(node));
        return rules;
    }

    private AtLeastOnePrimaryApplicantRule createAtLeastOnePrimaryApplicantRule(PrimaryApplicantFlagNode node) {
        AtLeastOnePrimaryApplicantRule rule = newAtLeastOnePrimaryApplicantRule(node);
        atLeastOnePrimaryApplicantRuleInjector.injectMembers(rule);
        return rule;
    }

    private AtMostOnePrimaryApplicantRule createAtMostOnePrimaryApplicantRule(PrimaryApplicantFlagNode node) {
        AtMostOnePrimaryApplicantRule rule = newAtMostOnePrimaryApplicantRule(node);
        atMostOnePrimaryApplicantRuleInjector.injectMembers(rule);
        return rule;
    }


    protected AtLeastOnePrimaryApplicantRule newAtLeastOnePrimaryApplicantRule(PrimaryApplicantFlagNode node) {
        return new AtLeastOnePrimaryApplicantRuleImpl(node);
    }
    protected AtMostOnePrimaryApplicantRule newAtMostOnePrimaryApplicantRule(PrimaryApplicantFlagNode node) {
        return new AtMostOnePrimaryApplicantRuleImpl(node);
    }
}
