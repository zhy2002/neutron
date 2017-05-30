package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.TotalExpenseNode;
import zhy2002.examples.lodgement.gen.di.*;

@TotalExpenseNodeScope
public class TotalExpenseNodeRuleProvider implements RuleProvider<TotalExpenseNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public TotalExpenseNodeRuleProvider() {
    }

    @Override
    public void initializeState(TotalExpenseNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
