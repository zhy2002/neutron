package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MovedToPreviousAddressNodeScope
public class MovedToPreviousAddressNodeRuleProvider implements RuleProvider<MovedToPreviousAddressNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public MovedToPreviousAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(MovedToPreviousAddressNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
