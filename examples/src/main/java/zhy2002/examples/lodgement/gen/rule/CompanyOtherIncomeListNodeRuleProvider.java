package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyOtherIncomeListNode;


@CompanyOtherIncomeListNodeScope
public class CompanyOtherIncomeListNodeRuleProvider
    extends ObjectUiNodeRuleProvider<CompanyOtherIncomeListNode> {

    @Inject
    public CompanyOtherIncomeListNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyOtherIncomeListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
