package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageLoanTermExpiryDateNodeModule {

    private final MortgageLoanTermExpiryDateNode owner;

    public MortgageLoanTermExpiryDateNodeModule(MortgageLoanTermExpiryDateNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope @Owner MortgageLoanTermExpiryDateNode provideMortgageLoanTermExpiryDateNode() {
        return owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope
    RuleProvider<MortgageLoanTermExpiryDateNode> provideRuleProvider(Provider<MortgageLoanTermExpiryDateNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope
    Map<String, RuleProvider<MortgageLoanTermExpiryDateNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageLoanTermExpiryDateNodeRuleProvider> mortgageLoanTermExpiryDateNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageLoanTermExpiryDateNode>> result = new HashMap<>();
        result.put("mortgageLoanTermExpiryDateNode", mortgageLoanTermExpiryDateNodeRuleProvider.get());
        return result;
    }
}