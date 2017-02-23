package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.BooleanFixedValueValidationRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public abstract class BooleanUiNodeRuleProvider extends LeafUiNodeRuleProvider {

    @Inject
    Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(booleanFixedValueValidationRuleProvider.get());
    }
}
