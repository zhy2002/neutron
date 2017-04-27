package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;

import javax.inject.Inject;
import java.util.List;


public class BooleanUiNodeRuleProvider implements RuleProvider<BooleanUiNode<?>> {

    @Inject
    public BooleanUiNodeRuleProvider() {
    }

    @Inject
    LeafUiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(BooleanUiNode<?> node) {
        parentRuleProvider.initializeState(node);
    }

//    @Inject
//    Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

//        createdRules.add(booleanFixedValueValidationRuleProvider.get());
    }
}
