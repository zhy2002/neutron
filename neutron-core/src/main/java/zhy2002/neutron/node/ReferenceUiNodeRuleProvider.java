package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.NodeReferenceChangeRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public class ReferenceUiNodeRuleProvider implements RuleProvider<ReferenceUiNode<?>> {

    @Inject
    public ReferenceUiNodeRuleProvider() {
    }

    @Inject
    LeafUiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(ReferenceUiNode<?> node) {
        parentRuleProvider.initializeState(node);
    }

    @Inject
    Provider<NodeReferenceChangeRule> nodeReferenceChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        createdRules.add(nodeReferenceChangeRuleProvider.get());
    }
}
