package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.EstimatedMarketValueNode;
import zhy2002.examples.lodgement.gen.di.*;

@EstimatedMarketValueNodeScope
public class EstimatedMarketValueNodeRuleProvider implements RuleProvider<EstimatedMarketValueNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public EstimatedMarketValueNodeRuleProvider() {
    }

    @Override
    public void initializeState(EstimatedMarketValueNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
