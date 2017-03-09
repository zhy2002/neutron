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

    @Provides @MortgageInterestOnlyExpiryDateNodeScope @Owner MortgageInterestOnlyExpiryDateNode provideMortgageInterestOnlyExpiryDateNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope
    Map<String, RuleProvider<MortgageInterestOnlyExpiryDateNode>> provideInstanceProviders(
        Provider<ExistingMortgageNodeChildProvider.MortgageInterestOnlyExpiryDateNodeRuleProvider> mortgageInterestOnlyExpiryDateNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageInterestOnlyExpiryDateNode>> result = new HashMap<>();
        result.put("mortgageInterestOnlyExpiryDateNode", mortgageInterestOnlyExpiryDateNodeRuleProvider.get());
        return result;
    }
}