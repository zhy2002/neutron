package zhy2002.neutron;


import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.rule.UpdateObjectHasValueRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public abstract class ObjectUiNodeRuleProvider extends UiNodeRuleProvider {

    @Inject
    Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;
    @Inject
    Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {

        super.createRules(createdRules);

        createdRules.add(objectValueRequiredValidationRuleProvider.get());
        createdRules.add(updateObjectHasValueRuleProvider.get());
    }
}
