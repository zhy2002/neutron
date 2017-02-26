package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.NodeReferenceChangeRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public abstract class ReferenceUiNodeRuleProvider<N extends ReferenceUiNode<?>> extends LeafUiNodeRuleProvider<N> {

    @Inject
    Provider<NodeReferenceChangeRule> nodeReferenceChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(nodeReferenceChangeRuleProvider.get());
    }
}
