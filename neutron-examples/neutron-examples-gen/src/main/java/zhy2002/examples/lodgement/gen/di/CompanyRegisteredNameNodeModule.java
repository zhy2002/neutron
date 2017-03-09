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

    @Provides @CompanyRegisteredNameNodeScope @Owner CompanyRegisteredNameNode provideCompanyRegisteredNameNode() {
        return owner;
    }

    @Provides @CompanyRegisteredNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyRegisteredNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyRegisteredNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyRegisteredNameNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanyRegisteredNameNodeScope
    Map<String, RuleProvider<CompanyRegisteredNameNode>> provideInstanceProviders(
        Provider<CompanyGeneralNodeChildProvider.CompanyRegisteredNameNodeRuleProvider> companyRegisteredNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyRegisteredNameNode>> result = new HashMap<>();
        result.put("companyRegisteredNameNode", companyRegisteredNameNodeRuleProvider.get());
        return result;
    }
}