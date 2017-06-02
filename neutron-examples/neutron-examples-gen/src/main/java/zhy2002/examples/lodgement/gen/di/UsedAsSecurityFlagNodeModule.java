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
public class UsedAsSecurityFlagNodeModule {

    private final UsedAsSecurityFlagNode owner;

    public UsedAsSecurityFlagNodeModule(UsedAsSecurityFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UsedAsSecurityFlagNode provideUsedAsSecurityFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @Named("UsedAsSecurityFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<UsedAsSecurityFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("UsedAsSecurityFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<UsedAsSecurityFlagNode> provideTypeRuleProvider(UsedAsSecurityFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<UsedAsSecurityFlagNode>> provideRuleProviders(
        @Named("UsedAsSecurityFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<UsedAsSecurityFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}