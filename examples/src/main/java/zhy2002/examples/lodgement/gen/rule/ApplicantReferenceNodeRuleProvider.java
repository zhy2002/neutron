package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class ApplicantReferenceNodeRuleProvider implements RuleProvider<ApplicantReferenceNode> {

    @Inject
    public ApplicantReferenceNodeRuleProvider() {}

    @Inject
    MembersInjector<RemoveOwnershipNodeRule> removeOwnershipNodeRuleInjector;

    @Override
    public List<UiNodeRule<ApplicantReferenceNode>> createRules(ApplicantReferenceNode node) {
        List<UiNodeRule<ApplicantReferenceNode>> rules = new ArrayList<>();
        rules.add(createRemoveOwnershipNodeRule(node));
        return rules;
    }

    private RemoveOwnershipNodeRule createRemoveOwnershipNodeRule(ApplicantReferenceNode node) {
        RemoveOwnershipNodeRule rule = newRemoveOwnershipNodeRule(node);
        removeOwnershipNodeRuleInjector.injectMembers(rule);
        return rule;
    }


    protected RemoveOwnershipNodeRule newRemoveOwnershipNodeRule(ApplicantReferenceNode node) {
        return new RemoveOwnershipNodeRuleImpl(node);
    }
}
