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

    @Provides @CompanyAbrnNodeScope @Owner CompanyAbrnNode provideCompanyAbrnNode() {
        return owner;
    }

    @Provides @CompanyAbrnNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyAbrnNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyAbrnNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyAbrnNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanyAbrnNodeScope
    Map<String, RuleProvider<CompanyAbrnNode>> provideInstanceProviders(
        Provider<CompanyGeneralNodeChildProvider.CompanyAbrnNodeRuleProvider> companyAbrnNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyAbrnNode>> result = new HashMap<>();
        result.put("companyAbrnNode", companyAbrnNodeRuleProvider.get());
        return result;
    }
}