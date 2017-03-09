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

    @Provides @CompanyApplicantTypeNodeScope @Owner CompanyApplicantTypeNode provideCompanyApplicantTypeNode() {
        return owner;
    }

    @Provides @CompanyApplicantTypeNodeScope @Owner BaseApplicantTypeNode<?> provideBaseApplicantTypeNode() {
        return owner;
    }

    @Provides @CompanyApplicantTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyApplicantTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyApplicantTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyApplicantTypeNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanyApplicantTypeNodeScope
    Map<String, RuleProvider<CompanyApplicantTypeNode>> provideInstanceProviders(
        Provider<CompanyGeneralNodeChildProvider.CompanyApplicantTypeNodeRuleProvider> companyApplicantTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyApplicantTypeNode>> result = new HashMap<>();
        result.put("companyApplicantTypeNode", companyApplicantTypeNodeRuleProvider.get());
        return result;
    }
}