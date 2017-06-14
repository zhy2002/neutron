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
public class OwnershipNodeModule {

    private final OwnershipNode owner;

    public OwnershipNodeModule(OwnershipNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OwnershipNode provideOwnershipNode() {
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

    @Provides @ComponentScope OwnershipListNode<?> provideOwnershipListNode() {
        return owner.getParent();
    }

    @Provides @Named("OwnershipNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OwnershipNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OwnershipNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OwnershipNode> provideTypeRuleProvider(OwnershipNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OwnershipNode>> provideRuleProviders(
        @Named("OwnershipNodeRuleProvider")  Map<String, Provider<RuleProvider<OwnershipNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}