package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ExpenseListNode;


@ExpenseListNodeScope
public class ExpenseListNodeRuleProvider
    extends ListUiNodeRuleProvider<ExpenseListNode> {

    @Inject
    public ExpenseListNodeRuleProvider() {}

    @Override
    public void initializeState(ExpenseListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
