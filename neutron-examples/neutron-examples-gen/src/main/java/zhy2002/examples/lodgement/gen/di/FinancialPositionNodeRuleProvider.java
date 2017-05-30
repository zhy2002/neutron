package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.FinancialPositionNode;
import zhy2002.examples.lodgement.gen.di.*;

@FinancialPositionNodeScope
public class FinancialPositionNodeRuleProvider implements RuleProvider<FinancialPositionNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public FinancialPositionNodeRuleProvider() {
    }

    @Override
    public void initializeState(FinancialPositionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
