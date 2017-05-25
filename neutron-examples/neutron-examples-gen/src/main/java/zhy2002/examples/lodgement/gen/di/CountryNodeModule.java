package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CountryNodeModule {

    private final CountryNode owner;

    public CountryNodeModule(CountryNode owner) {
        this.owner = owner;
    }

    @Provides @CountryNodeScope @Owner CountryNode provideCountryNode() {
        return owner;
    }

    @Provides @CountryNodeScope @Owner BaseCountryNode<?> provideBaseCountryNode() {
        return owner;
    }

    @Provides @CountryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CountryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CountryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CountryNodeScope AddressNode<?> provideAddressNode() {
        return owner.getParent();
    }

    @Provides @CountryNodeScope
    RuleProvider<CountryNode> provideRuleProvider(Provider<CountryNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CountryNodeScope
    Map<String, RuleProvider<CountryNode>> provideInstanceProviderMap(
        Provider<AddressNodeChildProvider.CountryNodeRuleProvider> countryNodeRuleProvider
    ) {
        Map<String, RuleProvider<CountryNode>> result = new HashMap<>();
        result.put("countryNode", countryNodeRuleProvider.get());
        return result;
    }
}