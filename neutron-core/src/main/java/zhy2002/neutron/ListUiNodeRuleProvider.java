package zhy2002.neutron;


import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public class ListUiNodeRuleProvider implements RuleProvider<ListUiNode<?, ?>> {

    @Inject
    public ListUiNodeRuleProvider() {
    }

    @Inject
    ParentUiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(ListUiNode<?, ?> node) {
        parentRuleProvider.initializeState(node);
    }

    @Inject
    Provider<ListUiNode.MaintainSelfDirtyRule> maintainSelfDirtyRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        createdRules.add(maintainSelfDirtyRuleProvider.get());
    }
}
