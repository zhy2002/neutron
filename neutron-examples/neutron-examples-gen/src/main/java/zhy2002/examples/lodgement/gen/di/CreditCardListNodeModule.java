package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditCardListNodeModule {

    private final CreditCardListNode owner;

    public CreditCardListNodeModule(CreditCardListNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardListNodeScope @Owner CreditCardListNode provideCreditCardListNode() {
        return owner;
    }

    @Provides @CreditCardListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CreditCardListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CreditCardListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardListNodeScope LiabilitiesNode provideLiabilitiesNode() {
        return owner.getParent();
    }

    @Provides @CreditCardListNodeScope
    Map<String, RuleProvider<CreditCardListNode>> provideInstanceProviders(
        Provider<LiabilitiesNodeChildProvider.CreditCardListNodeRuleProvider> creditCardListNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardListNode>> result = new HashMap<>();
        result.put("creditCardListNode", creditCardListNodeRuleProvider.get());
        return result;
    }
}