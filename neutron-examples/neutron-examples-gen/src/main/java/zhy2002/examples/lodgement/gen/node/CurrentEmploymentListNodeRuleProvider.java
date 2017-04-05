package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@CurrentEmploymentListNodeScope
public class CurrentEmploymentListNodeRuleProvider implements RuleProvider<CurrentEmploymentListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CurrentEmploymentListNodeRuleProvider() {
    }

    @Override
    public void initializeState(CurrentEmploymentListNode node) {
        parentRuleProvider.initializeState(node);

        node.setNodeLabel("Current Employment");
        node.setMinItemCount(1);
    }

    @Inject
    Provider<MinItemCountValidationRule> minItemCountValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        MinItemCountValidationRule minItemCountValidationRule = minItemCountValidationRuleProvider.get();
        createdRules.add(minItemCountValidationRule);
    }

}
