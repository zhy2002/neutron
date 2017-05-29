package zhy2002.examples.lodgement.cba.di;

import zhy2002.examples.lodgement.cba.gen.di.CbaPropertySubTypeNodeRuleProvider;
import zhy2002.examples.lodgement.gen.di.PropertySubTypeNodeRuleProvider;
import zhy2002.examples.lodgement.gen.di.PropertySubTypeNodeScope;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.LatestUsedItemRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public @PropertySubTypeNodeScope
class PropertySubTypeNodeRuleProviderImpl extends CbaPropertySubTypeNodeRuleProvider {

    @Inject
    public PropertySubTypeNodeRuleProviderImpl() {
    }

    @Inject
    Provider<LatestUsedItemRule> latestUsedItemRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(latestUsedItemRuleProvider.get());
    }
}