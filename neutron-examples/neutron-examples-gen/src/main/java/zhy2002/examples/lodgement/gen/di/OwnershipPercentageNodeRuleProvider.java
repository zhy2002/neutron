package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OwnershipPercentageNode;
import zhy2002.examples.lodgement.gen.di.*;

@OwnershipPercentageNodeScope
public class OwnershipPercentageNodeRuleProvider implements RuleProvider<OwnershipPercentageNode> {

    @Inject
    BasePercentageNodeRuleProvider parentRuleProvider;

    @Inject
    public OwnershipPercentageNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwnershipPercentageNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
