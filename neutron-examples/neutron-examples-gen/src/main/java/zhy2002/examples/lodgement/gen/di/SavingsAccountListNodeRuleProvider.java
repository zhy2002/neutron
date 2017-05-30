package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SavingsAccountListNode;
import zhy2002.examples.lodgement.gen.di.*;

@SavingsAccountListNodeScope
public class SavingsAccountListNodeRuleProvider implements RuleProvider<SavingsAccountListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SavingsAccountListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsAccountListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
