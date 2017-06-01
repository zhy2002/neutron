package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageLoanTypeNodeModule {

    private final MortgageLoanTypeNode owner;

    public MortgageLoanTypeNodeModule(MortgageLoanTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageLoanTypeNode provideMortgageLoanTypeNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgageLoanTypeNode> provideRuleProvider(Provider<MortgageLoanTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageLoanTypeNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageLoanTypeNodeRuleProvider> mortgageLoanTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageLoanTypeNode>> result = new HashMap<>();
        result.put("mortgageLoanTypeNode", mortgageLoanTypeNodeRuleProvider.get());
        return result;
    }
}