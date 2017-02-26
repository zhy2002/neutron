package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.PlanNode;


@PlanNodeScope
public class PlanNodeRuleProvider
    extends StringUiNodeRuleProvider<PlanNode> {

    @Inject
    public PlanNodeRuleProvider() {}

    @Override
    public void initializeState(PlanNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
