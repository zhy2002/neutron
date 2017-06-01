package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class LoanOwnershipListNodeModule {

    private final LoanOwnershipListNode owner;

    public LoanOwnershipListNodeModule(LoanOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanOwnershipListNode provideLoanOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @Named("LoanOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LoanOwnershipListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LoanOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LoanOwnershipListNode> provideTypeRuleProvider(LoanOwnershipListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("LoanOwnershipListNodeRuleProvider") @IntoMap @StringKey("ownershipListNode")
        RuleProvider<LoanOwnershipListNode> provideOwnershipListNodeChildRuleProvider(
            LoanNodeChildProvider.OwnershipListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<LoanOwnershipListNode>> provideRuleProviders(
        @Named("LoanOwnershipListNodeRuleProvider")  Map<String, Provider<RuleProvider<LoanOwnershipListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}