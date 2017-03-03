package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MovedFromPreviousAddressNode;


@MovedFromPreviousAddressNodeScope
public class MovedFromPreviousAddressNodeRuleProvider
    extends MonthYearNodeRuleProvider<MovedFromPreviousAddressNode> {

    @Inject
    public MovedFromPreviousAddressNodeRuleProvider() {}

    @Override
    public void initializeState(MovedFromPreviousAddressNode node) {
    }


    @Inject
    Provider<FromPreviousNoEarlierThanToPreviousRule> fromPreviousNoEarlierThanToPreviousRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(fromPreviousNoEarlierThanToPreviousRuleProvider.get());
    }

}
