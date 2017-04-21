package zhy2002.neutron;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public class RootUiNodeRuleProvider implements RuleProvider<RootUiNode<?>> {

    @Inject
    public RootUiNodeRuleProvider() {
    }

    @Inject
    ObjectUiNodeRuleProvider objectUiNodeRuleProvider;

    @Inject
    Provider<RootUiNode.ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    @Override
    public void initializeState(RootUiNode<?> node) {
        objectUiNodeRuleProvider.initializeState(node);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        objectUiNodeRuleProvider.createRules(createdRules);

        createdRules.add(clearErrorsForDisabledNodeRuleProvider.get());
    }
}
