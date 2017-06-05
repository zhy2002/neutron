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
public class ApprovalInPrincipleFlagNodeModule {

    private final ApprovalInPrincipleFlagNode owner;

    public ApprovalInPrincipleFlagNodeModule(ApprovalInPrincipleFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ApprovalInPrincipleFlagNode provideApprovalInPrincipleFlagNode() {
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

    @Provides @Named("ApprovalInPrincipleFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ApprovalInPrincipleFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ApprovalInPrincipleFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ApprovalInPrincipleFlagNode> provideTypeRuleProvider(ApprovalInPrincipleFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ApprovalInPrincipleFlagNode>> provideRuleProviders(
        @Named("ApprovalInPrincipleFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ApprovalInPrincipleFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}