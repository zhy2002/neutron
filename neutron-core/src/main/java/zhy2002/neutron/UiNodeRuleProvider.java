package zhy2002.neutron;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public class UiNodeRuleProvider implements RuleProvider<UiNode<?>> {

    @Inject
    public UiNodeRuleProvider() {
    }

    @Override
    public void initializeState(UiNode<?> node) {
    }

    @Inject
    Provider<UiNode.ResetDirtyRule> resetDirtyRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        createdRules.add(resetDirtyRuleProvider.get());
    }
}
