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

    @Provides @ComponentScope @Owner CountryNode provideCountryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCountryNode<?> provideBaseCountryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope AddressNode<?> provideAddressNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CountryNode> provideRuleProvider(Provider<CountryNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CountryNode>> provideInstanceProviderMap(
        Provider<AddressNodeChildProvider.CountryNodeRuleProvider> countryNodeRuleProvider
    ) {
        Map<String, RuleProvider<CountryNode>> result = new HashMap<>();
        result.put("countryNode", countryNodeRuleProvider.get());
        return result;
    }
}