package zhy2002.neutron;


import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public class ObjectUiNodeRuleProvider implements RuleProvider<ObjectUiNode<?>> {

    @Inject
    public ObjectUiNodeRuleProvider() {
    }

    @Inject
    ParentUiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(ObjectUiNode<?> node) {
        parentRuleProvider.initializeState(node);
    }

    @Inject
    Provider<ObjectUiNode.UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {

        parentRuleProvider.createRules(createdRules);

        createdRules.add(updateObjectHasValueRuleProvider.get());
    }
}
