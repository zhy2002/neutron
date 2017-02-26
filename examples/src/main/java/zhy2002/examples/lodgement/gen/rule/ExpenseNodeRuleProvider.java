package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ExpenseNode;


@ExpenseNodeScope
public class ExpenseNodeRuleProvider
    extends ObjectUiNodeRuleProvider<ExpenseNode> {

    @Inject
    public ExpenseNodeRuleProvider() {}

    @Override
    public void initializeState(ExpenseNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
