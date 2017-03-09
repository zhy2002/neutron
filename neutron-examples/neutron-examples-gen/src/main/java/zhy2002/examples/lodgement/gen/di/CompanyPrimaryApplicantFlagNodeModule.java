package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyPrimaryApplicantFlagNodeModule {

    private final CompanyPrimaryApplicantFlagNode owner;

    public CompanyPrimaryApplicantFlagNodeModule(CompanyPrimaryApplicantFlagNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope @Owner CompanyPrimaryApplicantFlagNode provideCompanyPrimaryApplicantFlagNode() {
        return owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope
    Map<String, RuleProvider<CompanyPrimaryApplicantFlagNode>> provideInstanceProviders(
        Provider<CompanyGeneralNodeChildProvider.CompanyPrimaryApplicantFlagNodeRuleProvider> companyPrimaryApplicantFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyPrimaryApplicantFlagNode>> result = new HashMap<>();
        result.put("companyPrimaryApplicantFlagNode", companyPrimaryApplicantFlagNodeRuleProvider.get());
        return result;
    }
}