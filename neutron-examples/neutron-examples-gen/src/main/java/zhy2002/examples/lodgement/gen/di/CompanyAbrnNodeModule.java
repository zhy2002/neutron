package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyAbrnNodeModule {

    private final CompanyAbrnNode owner;

    public CompanyAbrnNodeModule(CompanyAbrnNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyAbrnNode provideCompanyAbrnNode() {
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

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyAbrnNode> provideRuleProvider(Provider<CompanyAbrnNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyAbrnNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyAbrnNodeRuleProvider> companyAbrnNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyAbrnNode>> result = new HashMap<>();
        result.put("companyAbrnNode", companyAbrnNodeRuleProvider.get());
        return result;
    }
}