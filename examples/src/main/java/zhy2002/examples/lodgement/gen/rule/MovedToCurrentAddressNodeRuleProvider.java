package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class MovedToCurrentAddressNodeRuleProvider implements RuleProvider<MovedToCurrentAddressNode> {

    @Inject
    public MovedToCurrentAddressNodeRuleProvider() {}

    @Inject
    MembersInjector<ToCurrentNoEarlierThanToPreviousRule> toCurrentNoEarlierThanToPreviousRuleInjector;
    @Inject
    MembersInjector<ToCurrentNoEarlierThanFromPreviousRule> toCurrentNoEarlierThanFromPreviousRuleInjector;

    @Override
    public List<UiNodeRule<MovedToCurrentAddressNode>> createRules(MovedToCurrentAddressNode node) {
        List<UiNodeRule<MovedToCurrentAddressNode>> rules = new ArrayList<>();
        rules.add(createToCurrentNoEarlierThanToPreviousRule(node));
        rules.add(createToCurrentNoEarlierThanFromPreviousRule(node));
        return rules;
    }

    private ToCurrentNoEarlierThanToPreviousRule createToCurrentNoEarlierThanToPreviousRule(MovedToCurrentAddressNode node) {
        ToCurrentNoEarlierThanToPreviousRule rule = newToCurrentNoEarlierThanToPreviousRule(node);
        toCurrentNoEarlierThanToPreviousRuleInjector.injectMembers(rule);
        return rule;
    }

    private ToCurrentNoEarlierThanFromPreviousRule createToCurrentNoEarlierThanFromPreviousRule(MovedToCurrentAddressNode node) {
        ToCurrentNoEarlierThanFromPreviousRule rule = newToCurrentNoEarlierThanFromPreviousRule(node);
        toCurrentNoEarlierThanFromPreviousRuleInjector.injectMembers(rule);
        return rule;
    }


    protected ToCurrentNoEarlierThanToPreviousRule newToCurrentNoEarlierThanToPreviousRule(MovedToCurrentAddressNode node) {
        return new ToCurrentNoEarlierThanToPreviousRuleImpl(node);
    }
    protected ToCurrentNoEarlierThanFromPreviousRule newToCurrentNoEarlierThanFromPreviousRule(MovedToCurrentAddressNode node) {
        return new ToCurrentNoEarlierThanFromPreviousRuleImpl(node);
    }
}
