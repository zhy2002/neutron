package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class BaseOtherIncomeListNodeRuleProvider implements RuleProvider<BaseOtherIncomeListNode<?>> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseOtherIncomeListNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseOtherIncomeListNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setNodeLabel("Other Incomes");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
