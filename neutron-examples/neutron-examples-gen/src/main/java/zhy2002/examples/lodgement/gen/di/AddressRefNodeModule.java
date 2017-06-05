package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class AddressRefNodeModule {

    private final AddressRefNode owner;

    public AddressRefNodeModule(AddressRefNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AddressRefNode provideAddressRefNode() {
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

    @Provides @ComponentScope AddressRefListNode provideAddressRefListNode() {
        return owner.getParent();
    }

    @Provides @Named("AddressRefNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AddressRefNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AddressRefNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AddressRefNode> provideTypeRuleProvider(AddressRefNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<AddressRefNode>> provideRuleProviders(
        @Named("AddressRefNodeRuleProvider")  Map<String, Provider<RuleProvider<AddressRefNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}