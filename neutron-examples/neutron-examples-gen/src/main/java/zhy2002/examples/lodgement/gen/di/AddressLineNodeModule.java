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
public class AddressLineNodeModule {

    private final AddressLineNode owner;

    public AddressLineNodeModule(AddressLineNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AddressLineNode provideAddressLineNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope AddressNode<?> provideAddressNode() {
        return owner.getParent();
    }

    @Provides @Named("AddressLineNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AddressLineNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AddressLineNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AddressLineNode> provideTypeRuleProvider(AddressLineNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<AddressLineNode>> provideRuleProviders(
        @Named("AddressLineNodeRuleProvider")  Map<String, Provider<RuleProvider<AddressLineNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}