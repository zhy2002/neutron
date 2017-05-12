package zhy2002.neutron;

import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public class LeafUiNodeRuleProvider implements RuleProvider<LeafUiNode<?, ?>> {

    @Inject
    public LeafUiNodeRuleProvider() {
    }

    @Inject
    UiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(LeafUiNode<?, ?> node) {
        parentRuleProvider.initializeState(node);
    }

    @Inject
    Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    @Inject
    Provider<LeafUiNode.MaintainSelfDirtyRule> maintainSelfDirtyRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);
        createdRules.add(leafValueRequiredValidationRuleProvider.get());
        createdRules.add(maintainSelfDirtyRuleProvider.get());
    }
}
