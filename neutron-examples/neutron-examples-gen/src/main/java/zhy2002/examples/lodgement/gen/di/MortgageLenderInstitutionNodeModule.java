package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageLenderInstitutionNodeModule {

    private final MortgageLenderInstitutionNode owner;

    public MortgageLenderInstitutionNodeModule(MortgageLenderInstitutionNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope @Owner MortgageLenderInstitutionNode provideMortgageLenderInstitutionNode() {
        return owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageLenderInstitutionNodeScope
    RuleProvider<MortgageLenderInstitutionNode> provideRuleProvider(Provider<MortgageLenderInstitutionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @MortgageLenderInstitutionNodeScope
    Map<String, RuleProvider<MortgageLenderInstitutionNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageLenderInstitutionNodeRuleProvider> mortgageLenderInstitutionNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageLenderInstitutionNode>> result = new HashMap<>();
        result.put("mortgageLenderInstitutionNode", mortgageLenderInstitutionNodeRuleProvider.get());
        return result;
    }
}