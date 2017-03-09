package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditCardClearingFlagNodeModule {

    private final CreditCardClearingFlagNode owner;

    public CreditCardClearingFlagNodeModule(CreditCardClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardClearingFlagNodeScope @Owner CreditCardClearingFlagNode provideCreditCardClearingFlagNode() {
        return owner;
    }

    @Provides @CreditCardClearingFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @CreditCardClearingFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardClearingFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardClearingFlagNodeScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @CreditCardClearingFlagNodeScope
    Map<String, RuleProvider<CreditCardClearingFlagNode>> provideInstanceProviders(
        Provider<CreditCardNodeChildProvider.CreditCardClearingFlagNodeRuleProvider> creditCardClearingFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardClearingFlagNode>> result = new HashMap<>();
        result.put("creditCardClearingFlagNode", creditCardClearingFlagNodeRuleProvider.get());
        return result;
    }
}