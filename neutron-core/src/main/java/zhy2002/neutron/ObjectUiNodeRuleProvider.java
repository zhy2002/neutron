package zhy2002.neutron;


import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.rule.UpdateObjectHasValueRule;

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
    Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;
    @Inject
    Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {

        parentRuleProvider.createRules(createdRules);

        createdRules.add(objectValueRequiredValidationRuleProvider.get());
        createdRules.add(updateObjectHasValueRuleProvider.get());
    }
}
