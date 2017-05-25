package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyTelephoneNodeModule {

    private final CompanyTelephoneNode owner;

    public CompanyTelephoneNodeModule(CompanyTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyTelephoneNodeScope @Owner CompanyTelephoneNode provideCompanyTelephoneNode() {
        return owner;
    }

    @Provides @CompanyTelephoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @CompanyTelephoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyTelephoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyTelephoneNodeScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @CompanyTelephoneNodeScope
    RuleProvider<CompanyTelephoneNode> provideRuleProvider(Provider<CompanyTelephoneNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CompanyTelephoneNodeScope
    Map<String, RuleProvider<CompanyTelephoneNode>> provideInstanceProviderMap(
        Provider<CompanyContactNodeChildProvider.WorkPhoneNodeRuleProvider> workPhoneNodeRuleProvider
        ,Provider<CompanyContactNodeChildProvider.FaxNumberNodeRuleProvider> faxNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyTelephoneNode>> result = new HashMap<>();
        result.put("workPhoneNode", workPhoneNodeRuleProvider.get());
        result.put("faxNumberNode", faxNumberNodeRuleProvider.get());
        return result;
    }
}