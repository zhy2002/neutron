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
public class AddressRefListNodeModule {

    private final AddressRefListNode owner;

    public AddressRefListNodeModule(AddressRefListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AddressRefListNode provideAddressRefListNode() {
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

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @Named("AddressRefListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AddressRefListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AddressRefListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AddressRefListNode> provideTypeRuleProvider(AddressRefListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<AddressRefListNode>> provideRuleProviders(
        @Named("AddressRefListNodeRuleProvider")  Map<String, Provider<RuleProvider<AddressRefListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}