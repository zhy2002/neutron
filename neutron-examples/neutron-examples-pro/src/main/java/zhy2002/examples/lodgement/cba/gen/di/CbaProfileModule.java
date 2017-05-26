package zhy2002.examples.lodgement.cba.gen.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.ManifestModule;
import zhy2002.examples.lodgement.gen.di.PropertySubTypeNodeScope;
import zhy2002.examples.lodgement.gen.node.PropertySubTypeNodeRuleProvider;
import zhy2002.examples.lodgement.nab.node.LodgementValidationErrorListAdaptor;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.ValidationErrorListAdaptor;
import zhy2002.neutron.rule.LatestUsedItemRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


@Module(includes = {ManifestModule.class})
public abstract class CbaProfileModule {

    @Binds
    abstract PropertySubTypeNodeRuleProvider provideRealEstateNodeRuleProvider(PropertySubTypeNodeRuleProviderImpl impl);

    @Binds
    abstract ValidationErrorListAdaptor provideValidationErrorListAdaptor(LodgementValidationErrorListAdaptor impl);
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
