package zhy2002.neutron;


import javax.inject.Inject;
import java.util.List;

public class ListUiNodeRuleProvider implements RuleProvider<ListUiNode<?, ?>> {

    @Inject
    public ListUiNodeRuleProvider() {
    }

    @Inject
    UiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(ListUiNode<?, ?> node) {
        parentRuleProvider.initializeState(node);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);
    }
}
