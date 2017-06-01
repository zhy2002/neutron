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

    @Provides @ComponentScope @Owner CreditCardClearingFlagNode provideCreditCardClearingFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CreditCardClearingFlagNode> provideRuleProvider(Provider<CreditCardClearingFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CreditCardClearingFlagNode>> provideInstanceProviderMap(
        Provider<CreditCardNodeChildProvider.CreditCardClearingFlagNodeRuleProvider> creditCardClearingFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardClearingFlagNode>> result = new HashMap<>();
        result.put("creditCardClearingFlagNode", creditCardClearingFlagNodeRuleProvider.get());
        return result;
    }
}