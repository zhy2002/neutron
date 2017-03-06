package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MovedFromPreviousAddressNodeScope
public class MovedFromPreviousAddressNodeRuleProvider implements RuleProvider<MovedFromPreviousAddressNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public MovedFromPreviousAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(MovedFromPreviousAddressNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<FromPreviousNoEarlierThanToPreviousRule> fromPreviousNoEarlierThanToPreviousRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
            createdRules.add(fromPreviousNoEarlierThanToPreviousRuleProvider.get());
    }

}
