package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BaseOtherIncomeListNode;
import zhy2002.examples.lodgement.gen.di.*;


public class BaseOtherIncomeListNodeRuleProvider implements RuleProvider<BaseOtherIncomeListNode<?>> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseOtherIncomeListNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseOtherIncomeListNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
