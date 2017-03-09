package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyOtherIncomeListNodeScope
public class CompanyOtherIncomeListNodeRuleProvider implements RuleProvider<CompanyOtherIncomeListNode> {

    @Inject
    BaseOtherIncomeListNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyOtherIncomeListNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyOtherIncomeListNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}