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
public class LiabilitiesNodeModule {

    private final LiabilitiesNode owner;

    public LiabilitiesNodeModule(LiabilitiesNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LiabilitiesNode provideLiabilitiesNode() {
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

    @Provides @ComponentScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @Named("LiabilitiesNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LiabilitiesNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LiabilitiesNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LiabilitiesNode> provideTypeRuleProvider(LiabilitiesNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<LiabilitiesNode>> provideRuleProviders(
        @Named("LiabilitiesNodeRuleProvider")  Map<String, Provider<RuleProvider<LiabilitiesNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}