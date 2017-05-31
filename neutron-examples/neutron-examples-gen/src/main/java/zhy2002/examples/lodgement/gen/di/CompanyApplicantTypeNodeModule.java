package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyApplicantTypeNodeModule {

    private final CompanyApplicantTypeNode owner;

    public CompanyApplicantTypeNodeModule(CompanyApplicantTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyApplicantTypeNode provideCompanyApplicantTypeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseApplicantTypeNode<?> provideBaseApplicantTypeNode() {
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
    RuleProvider<CompanyApplicantTypeNode> provideRuleProvider(Provider<CompanyApplicantTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyApplicantTypeNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyApplicantTypeNodeRuleProvider> companyApplicantTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyApplicantTypeNode>> result = new HashMap<>();
        result.put("companyApplicantTypeNode", companyApplicantTypeNodeRuleProvider.get());
        return result;
    }
}