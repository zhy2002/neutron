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
public class OwnershipPercentageNodeModule {

    private final OwnershipPercentageNode owner;

    public OwnershipPercentageNodeModule(OwnershipPercentageNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OwnershipPercentageNode provideOwnershipPercentageNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope OwnershipNode provideOwnershipNode() {
        return owner.getParent();
    }

    @Provides @Named("OwnershipPercentageNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OwnershipPercentageNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OwnershipPercentageNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OwnershipPercentageNode> provideTypeRuleProvider(OwnershipPercentageNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OwnershipPercentageNode>> provideRuleProviders(
        @Named("OwnershipPercentageNodeRuleProvider")  Map<String, Provider<RuleProvider<OwnershipPercentageNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}