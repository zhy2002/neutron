package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class MovedFromPreviousAddressNodeRuleProvider implements RuleProvider<MovedFromPreviousAddressNode> {

    @Inject
    public MovedFromPreviousAddressNodeRuleProvider() {}

    @Inject
    MembersInjector<FromPreviousNoEarlierThanToPreviousRule> fromPreviousNoEarlierThanToPreviousRuleInjector;

    @Override
    public List<UiNodeRule<MovedFromPreviousAddressNode>> createRules(MovedFromPreviousAddressNode node) {
        List<UiNodeRule<MovedFromPreviousAddressNode>> rules = new ArrayList<>();
        rules.add(createFromPreviousNoEarlierThanToPreviousRule(node));
        return rules;
    }

    private FromPreviousNoEarlierThanToPreviousRule createFromPreviousNoEarlierThanToPreviousRule(MovedFromPreviousAddressNode node) {
        FromPreviousNoEarlierThanToPreviousRule rule = newFromPreviousNoEarlierThanToPreviousRule(node);
        fromPreviousNoEarlierThanToPreviousRuleInjector.injectMembers(rule);
        return rule;
    }


    protected FromPreviousNoEarlierThanToPreviousRule newFromPreviousNoEarlierThanToPreviousRule(MovedFromPreviousAddressNode node) {
        return new FromPreviousNoEarlierThanToPreviousRuleImpl(node);
    }
}
