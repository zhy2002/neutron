package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditCardTypeNodeModule {

    private final CreditCardTypeNode owner;

    public CreditCardTypeNodeModule(CreditCardTypeNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardTypeNodeScope @Owner CreditCardTypeNode provideCreditCardTypeNode() {
        return owner;
    }

    @Provides @CreditCardTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CreditCardTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardTypeNodeScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @CreditCardTypeNodeScope
    RuleProvider<CreditCardTypeNode> provideRuleProvider(Provider<CreditCardTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CreditCardTypeNodeScope
    Map<String, RuleProvider<CreditCardTypeNode>> provideInstanceProviderMap(
        Provider<CreditCardNodeChildProvider.CreditCardTypeNodeRuleProvider> creditCardTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardTypeNode>> result = new HashMap<>();
        result.put("creditCardTypeNode", creditCardTypeNodeRuleProvider.get());
        return result;
    }
}