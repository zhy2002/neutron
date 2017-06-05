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
public class PrimarySecurityFlagNodeModule {

    private final PrimarySecurityFlagNode owner;

    public PrimarySecurityFlagNodeModule(PrimarySecurityFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PrimarySecurityFlagNode providePrimarySecurityFlagNode() {
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

    @Provides @Named("PrimarySecurityFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PrimarySecurityFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PrimarySecurityFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PrimarySecurityFlagNode> provideTypeRuleProvider(PrimarySecurityFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PrimarySecurityFlagNode>> provideRuleProviders(
        @Named("PrimarySecurityFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<PrimarySecurityFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}