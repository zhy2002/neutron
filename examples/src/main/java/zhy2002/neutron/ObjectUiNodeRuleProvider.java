package zhy2002.neutron;


import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.rule.UpdateObjectHasValueRule;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;
import java.util.List;

@Singleton
public class ObjectUiNodeRuleProvider implements RuleProvider<ObjectUiNode<?>> {

    @Inject
    public ObjectUiNodeRuleProvider() {
    }

    @Override
    public List<UiNodeRule<ObjectUiNode<?>>> createRules(ObjectUiNode<?> node) {
        return Arrays.asList(
                new ObjectValueRequiredValidationRule(node),
                new UpdateObjectHasValueRule(node)
        );
    }
}
