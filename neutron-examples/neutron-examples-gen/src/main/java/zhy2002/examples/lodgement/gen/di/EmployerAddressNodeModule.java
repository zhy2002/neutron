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
public class EmployerAddressNodeModule {

    private final EmployerAddressNode owner;

    public EmployerAddressNodeModule(EmployerAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EmployerAddressNode provideEmployerAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @Named("EmployerAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<EmployerAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("EmployerAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<EmployerAddressNode> provideTypeRuleProvider(EmployerAddressNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("EmployerAddressNodeRuleProvider") @IntoMap @StringKey("employerAddressNode")
        RuleProvider<EmployerAddressNode> provideEmployerAddressNodeChildRuleProvider(
            EmployedNodeChildProvider.EmployerAddressNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<EmployerAddressNode>> provideRuleProviders(
        @Named("EmployerAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<EmployerAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}