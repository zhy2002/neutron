package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyMobileNumberNodeModule {

    private final CompanyMobileNumberNode owner;

    public CompanyMobileNumberNodeModule(CompanyMobileNumberNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyMobileNumberNode provideCompanyMobileNumberNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseMobileNumberNode<?> provideBaseMobileNumberNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyMobileNumberNode> provideRuleProvider(Provider<CompanyMobileNumberNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyMobileNumberNode>> provideInstanceProviderMap(
        Provider<CompanyContactNodeChildProvider.CompanyMobileNumberNodeRuleProvider> companyMobileNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyMobileNumberNode>> result = new HashMap<>();
        result.put("companyMobileNumberNode", companyMobileNumberNodeRuleProvider.get());
        return result;
    }
}