package zhy2002.examples.register.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.PlanNode;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@ComponentScope
public class PlanNodeRuleProvider implements RuleProvider<PlanNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PlanNodeRuleProvider() {
    }

    @Override
    public void initializeState(PlanNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(RegisterNodeConstants.PLANS);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
