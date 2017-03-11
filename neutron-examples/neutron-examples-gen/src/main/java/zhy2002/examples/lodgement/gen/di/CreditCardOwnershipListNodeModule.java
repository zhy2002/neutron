package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditCardOwnershipListNodeModule {

    private final CreditCardOwnershipListNode owner;

    public CreditCardOwnershipListNodeModule(CreditCardOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardOwnershipListNodeScope @Owner CreditCardOwnershipListNode provideCreditCardOwnershipListNode() {
        return owner;
    }

    @Provides @CreditCardOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @CreditCardOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CreditCardOwnershipListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CreditCardOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardOwnershipListNodeScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @CreditCardOwnershipListNodeScope
    Map<String, RuleProvider<CreditCardOwnershipListNode>> provideInstanceProviders(
        Provider<CreditCardNodeChildProvider.OwnershipListNodeRuleProvider> ownershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardOwnershipListNode>> result = new HashMap<>();
        result.put("ownershipListNode", ownershipListNodeRuleProvider.get());
        return result;
    }
}