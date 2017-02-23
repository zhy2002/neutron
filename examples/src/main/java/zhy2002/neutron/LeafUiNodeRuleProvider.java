package zhy2002.neutron;

import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public abstract class LeafUiNodeRuleProvider extends UiNodeRuleProvider {

    @Inject
    Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);
        createdRules.add(leafValueRequiredValidationRuleProvider.get());
    }
}
