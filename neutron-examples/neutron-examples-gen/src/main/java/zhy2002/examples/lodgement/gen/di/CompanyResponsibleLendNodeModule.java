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

    @Provides @CompanyResponsibleLendNodeScope @Owner CompanyResponsibleLendNode provideCompanyResponsibleLendNode() {
        return owner;
    }

    @Provides @CompanyResponsibleLendNodeScope @Owner BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner;
    }

    @Provides @CompanyResponsibleLendNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyResponsibleLendNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyResponsibleLendNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyResponsibleLendNodeScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @CompanyResponsibleLendNodeScope
    Map<String, RuleProvider<CompanyResponsibleLendNode>> provideInstanceProviders(
        Provider<CompanyNodeChildProvider.CompanyResponsibleLendNodeRuleProvider> companyResponsibleLendNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyResponsibleLendNode>> result = new HashMap<>();
        result.put("companyResponsibleLendNode", companyResponsibleLendNodeRuleProvider.get());
        return result;
    }
}