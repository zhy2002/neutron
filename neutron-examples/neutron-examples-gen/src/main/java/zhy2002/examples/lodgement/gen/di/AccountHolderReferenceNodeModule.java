package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccountHolderReferenceNodeModule {

    private final AccountHolderReferenceNode owner;

    public AccountHolderReferenceNodeModule(AccountHolderReferenceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccountHolderReferenceNode provideAccountHolderReferenceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope SelectAccountHolderNode provideSelectAccountHolderNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AccountHolderReferenceNode> provideRuleProvider(Provider<AccountHolderReferenceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AccountHolderReferenceNode>> provideInstanceProviderMap(
        Provider<SelectAccountHolderNodeChildProvider.AccountHolderReferenceNodeRuleProvider> accountHolderReferenceNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccountHolderReferenceNode>> result = new HashMap<>();
        result.put("accountHolderReferenceNode", accountHolderReferenceNodeRuleProvider.get());
        return result;
    }
}