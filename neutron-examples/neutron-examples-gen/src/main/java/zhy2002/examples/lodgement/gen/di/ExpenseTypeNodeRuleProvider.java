package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ExpenseTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ExpenseTypeNodeScope
public class ExpenseTypeNodeRuleProvider implements RuleProvider<ExpenseTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ExpenseTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ExpenseTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
