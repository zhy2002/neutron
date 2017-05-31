package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageInterestOnlyExpiryDateNodeModule {

    private final MortgageInterestOnlyExpiryDateNode owner;

    public MortgageInterestOnlyExpiryDateNodeModule(MortgageInterestOnlyExpiryDateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageInterestOnlyExpiryDateNode provideMortgageInterestOnlyExpiryDateNode() {
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
    RuleProvider<MortgageInterestOnlyExpiryDateNode> provideRuleProvider(Provider<MortgageInterestOnlyExpiryDateNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageInterestOnlyExpiryDateNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageInterestOnlyExpiryDateNodeRuleProvider> mortgageInterestOnlyExpiryDateNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageInterestOnlyExpiryDateNode>> result = new HashMap<>();
        result.put("mortgageInterestOnlyExpiryDateNode", mortgageInterestOnlyExpiryDateNodeRuleProvider.get());
        return result;
    }
}