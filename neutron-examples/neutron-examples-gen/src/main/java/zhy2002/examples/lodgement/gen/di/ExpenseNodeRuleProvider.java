package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ExpenseNode;
import zhy2002.examples.lodgement.gen.di.*;

@ExpenseNodeScope
public class ExpenseNodeRuleProvider implements RuleProvider<ExpenseNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ExpenseNodeRuleProvider() {
    }

    @Override
    public void initializeState(ExpenseNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
