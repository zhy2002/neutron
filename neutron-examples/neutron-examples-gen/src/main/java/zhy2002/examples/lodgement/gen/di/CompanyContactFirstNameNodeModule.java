package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyContactFirstNameNodeModule {

    private final CompanyContactFirstNameNode owner;

    public CompanyContactFirstNameNodeModule(CompanyContactFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyContactFirstNameNode provideCompanyContactFirstNameNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyContactFirstNameNode> provideRuleProvider(Provider<CompanyContactFirstNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyContactFirstNameNode>> provideInstanceProviderMap(
        Provider<CompanyContactNodeChildProvider.CompanyContactFirstNameNodeRuleProvider> companyContactFirstNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyContactFirstNameNode>> result = new HashMap<>();
        result.put("companyContactFirstNameNode", companyContactFirstNameNodeRuleProvider.get());
        return result;
    }
}