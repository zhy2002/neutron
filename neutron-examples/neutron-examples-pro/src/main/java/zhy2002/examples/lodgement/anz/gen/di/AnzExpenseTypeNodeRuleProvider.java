package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ExpenseTypeNodeScope
public class AnzExpenseTypeNodeRuleProvider extends ExpenseTypeNodeRuleProvider {

    @Inject
    public AnzExpenseTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ExpenseTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.EXPENSE_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
