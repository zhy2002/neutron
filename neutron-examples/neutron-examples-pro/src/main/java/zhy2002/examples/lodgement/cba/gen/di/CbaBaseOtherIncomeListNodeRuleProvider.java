package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class CbaBaseOtherIncomeListNodeRuleProvider extends BaseOtherIncomeListNodeRuleProvider {

    @Inject
    public CbaBaseOtherIncomeListNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseOtherIncomeListNode<?> node) {
        super.initializeState(node);

        node.setNodeLabel("Other Incomes");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
