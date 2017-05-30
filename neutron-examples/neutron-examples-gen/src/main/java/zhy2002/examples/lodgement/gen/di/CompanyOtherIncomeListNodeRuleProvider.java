package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyOtherIncomeListNode;
import zhy2002.examples.lodgement.gen.di.*;

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
