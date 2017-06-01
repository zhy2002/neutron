package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CountryCodeNodeModule {

    private final CountryCodeNode owner;

    public CountryCodeNodeModule(CountryCodeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CountryCodeNode provideCountryCodeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner PhoneInfoFieldNode providePhoneInfoFieldNode() {
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

    @Provides @ComponentScope PhoneInfoNode providePhoneInfoNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CountryCodeNode> provideRuleProvider(Provider<CountryCodeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CountryCodeNode>> provideInstanceProviderMap(
        Provider<PhoneInfoNodeChildProvider.CountryCodeNodeRuleProvider> countryCodeNodeRuleProvider
    ) {
        Map<String, RuleProvider<CountryCodeNode>> result = new HashMap<>();
        result.put("countryCodeNode", countryCodeNodeRuleProvider.get());
        return result;
    }
}