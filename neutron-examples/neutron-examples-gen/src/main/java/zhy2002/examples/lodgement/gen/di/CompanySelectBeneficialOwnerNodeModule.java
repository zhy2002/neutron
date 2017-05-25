package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanySelectBeneficialOwnerNodeModule {

    private final CompanySelectBeneficialOwnerNode owner;

    public CompanySelectBeneficialOwnerNodeModule(CompanySelectBeneficialOwnerNode owner) {
        this.owner = owner;
    }

    @Provides @CompanySelectBeneficialOwnerNodeScope @Owner CompanySelectBeneficialOwnerNode provideCompanySelectBeneficialOwnerNode() {
        return owner;
    }

    @Provides @CompanySelectBeneficialOwnerNodeScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @CompanySelectBeneficialOwnerNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CompanySelectBeneficialOwnerNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanySelectBeneficialOwnerNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanySelectBeneficialOwnerNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanySelectBeneficialOwnerNodeScope
    RuleProvider<CompanySelectBeneficialOwnerNode> provideRuleProvider(Provider<CompanySelectBeneficialOwnerNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CompanySelectBeneficialOwnerNodeScope
    Map<String, RuleProvider<CompanySelectBeneficialOwnerNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanySelectBeneficialOwnerNodeRuleProvider> companySelectBeneficialOwnerNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanySelectBeneficialOwnerNode>> result = new HashMap<>();
        result.put("companySelectBeneficialOwnerNode", companySelectBeneficialOwnerNodeRuleProvider.get());
        return result;
    }
}