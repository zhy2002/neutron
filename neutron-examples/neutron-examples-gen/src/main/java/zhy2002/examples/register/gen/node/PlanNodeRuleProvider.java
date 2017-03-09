package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@PlanNodeScope
public class PlanNodeRuleProvider implements RuleProvider<PlanNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PlanNodeRuleProvider() {
    }

    @Override
    public void initializeState(PlanNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(new ProductPlan[0]);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
