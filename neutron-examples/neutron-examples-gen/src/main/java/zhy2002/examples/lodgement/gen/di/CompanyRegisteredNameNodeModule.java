package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyRegisteredNameNodeModule {

    private final CompanyRegisteredNameNode owner;

    public CompanyRegisteredNameNodeModule(CompanyRegisteredNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyRegisteredNameNode provideCompanyRegisteredNameNode() {
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
    RuleProvider<CompanyRegisteredNameNode> provideRuleProvider(Provider<CompanyRegisteredNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyRegisteredNameNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyRegisteredNameNodeRuleProvider> companyRegisteredNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyRegisteredNameNode>> result = new HashMap<>();
        result.put("companyRegisteredNameNode", companyRegisteredNameNodeRuleProvider.get());
        return result;
    }
}