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

    @Provides @ComponentScope @Owner CompanyPrimaryApplicantFlagNode provideCompanyPrimaryApplicantFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyPrimaryApplicantFlagNode> provideRuleProvider(Provider<CompanyPrimaryApplicantFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyPrimaryApplicantFlagNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyPrimaryApplicantFlagNodeRuleProvider> companyPrimaryApplicantFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyPrimaryApplicantFlagNode>> result = new HashMap<>();
        result.put("companyPrimaryApplicantFlagNode", companyPrimaryApplicantFlagNodeRuleProvider.get());
        return result;
    }
}