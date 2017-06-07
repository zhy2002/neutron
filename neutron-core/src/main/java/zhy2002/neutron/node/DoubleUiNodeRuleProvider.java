package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;

import javax.inject.Inject;
import java.util.List;


public class DoubleUiNodeRuleProvider implements RuleProvider<DoubleUiNode<?>> {

    @Inject
    public DoubleUiNodeRuleProvider() {
    }

    @Inject
    LeafUiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(DoubleUiNode<?> node) {
        parentRuleProvider.initializeState(node);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);
    }
}
