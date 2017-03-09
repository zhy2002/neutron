package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;


public class EmployedNodeRuleProvider implements RuleProvider<EmployedNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public EmployedNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmployedNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<DoNotLoadEndedDateForCurrentRecordRule> doNotLoadEndedDateForCurrentRecordRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(doNotLoadEndedDateForCurrentRecordRuleProvider.get());
    }

}
