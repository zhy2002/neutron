package zhy2002.examples.lodgement.di;


import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.PropertySubTypeNodeScope;
import zhy2002.examples.lodgement.gen.node.PropertySubTypeNodeRuleProvider;
import zhy2002.examples.lodgement.rule.LatestUsedItemRule;
import zhy2002.neutron.UiNodeRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

@Module
abstract class CbaProfileModule extends DefaultProfileModule {

    @Binds
    abstract PropertySubTypeNodeRuleProvider provideRealEstateNodeRuleProvider(PropertySubTypeNodeRuleProviderImpl impl);
}

@PropertySubTypeNodeScope
class PropertySubTypeNodeRuleProviderImpl extends PropertySubTypeNodeRuleProvider {

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
