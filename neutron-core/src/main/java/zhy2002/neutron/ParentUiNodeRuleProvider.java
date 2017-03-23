package zhy2002.neutron;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public class ParentUiNodeRuleProvider implements RuleProvider<ParentUiNode<?>> {

    @Inject
    public ParentUiNodeRuleProvider() {}

    @Inject
    UiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(ParentUiNode<?> node) {
        parentRuleProvider.initializeState(node);
    }

    @Inject
    Provider<ParentUiNode.MaintainDirtyDescendantCountRule> maintainDirtyDescendantCountRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        createdRules.add(maintainDirtyDescendantCountRuleProvider.get());
    }
}