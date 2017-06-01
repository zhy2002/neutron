package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyAddressNodeModule {

    private final CompanyAddressNode owner;

    public CompanyAddressNodeModule(CompanyAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyAddressNode provideCompanyAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyAddressNode> provideRuleProvider(Provider<CompanyAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyAddressNode>> provideInstanceProviderMap(
        Provider<CompanyContactNodeChildProvider.RegisteredAddressNodeRuleProvider> registeredAddressNodeRuleProvider
        ,Provider<CompanyContactNodeChildProvider.PostalAddressNodeRuleProvider> postalAddressNodeRuleProvider
        ,Provider<CompanyContactNodeChildProvider.TradingAddressNodeRuleProvider> tradingAddressNodeRuleProvider
        ,Provider<CompanyContactNodeChildProvider.PrincipalPlaceAddressNodeRuleProvider> principalPlaceAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyAddressNode>> result = new HashMap<>();
        result.put("registeredAddressNode", registeredAddressNodeRuleProvider.get());
        result.put("postalAddressNode", postalAddressNodeRuleProvider.get());
        result.put("tradingAddressNode", tradingAddressNodeRuleProvider.get());
        result.put("principalPlaceAddressNode", principalPlaceAddressNodeRuleProvider.get());
        return result;
    }
}