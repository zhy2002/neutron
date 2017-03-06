package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@MovedToCurrentAddressNodeScope
public class MovedToCurrentAddressNodeRuleProvider implements RuleProvider<MovedToCurrentAddressNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public MovedToCurrentAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(MovedToCurrentAddressNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
    }

    @Inject
    Provider<ToCurrentNoEarlierThanToPreviousRule> toCurrentNoEarlierThanToPreviousRuleProvider;
    @Inject
    Provider<ToCurrentNoEarlierThanFromPreviousRule> toCurrentNoEarlierThanFromPreviousRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
            createdRules.add(toCurrentNoEarlierThanToPreviousRuleProvider.get());
            createdRules.add(toCurrentNoEarlierThanFromPreviousRuleProvider.get());
    }

}
