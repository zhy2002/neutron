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

    @Provides @ComponentScope @Owner CompanySelectBeneficialOwnerNode provideCompanySelectBeneficialOwnerNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
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

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanySelectBeneficialOwnerNode> provideRuleProvider(Provider<CompanySelectBeneficialOwnerNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanySelectBeneficialOwnerNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanySelectBeneficialOwnerNodeRuleProvider> companySelectBeneficialOwnerNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanySelectBeneficialOwnerNode>> result = new HashMap<>();
        result.put("companySelectBeneficialOwnerNode", companySelectBeneficialOwnerNodeRuleProvider.get());
        return result;
    }
}