package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyResponsibleLendNodeModule {

    private final CompanyResponsibleLendNode owner;

    public CompanyResponsibleLendNodeModule(CompanyResponsibleLendNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyResponsibleLendNode provideCompanyResponsibleLendNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyResponsibleLendNode> provideRuleProvider(Provider<CompanyResponsibleLendNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyResponsibleLendNode>> provideInstanceProviderMap(
        Provider<CompanyNodeChildProvider.CompanyResponsibleLendNodeRuleProvider> companyResponsibleLendNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyResponsibleLendNode>> result = new HashMap<>();
        result.put("companyResponsibleLendNode", companyResponsibleLendNodeRuleProvider.get());
        return result;
    }
}