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
public class AdditionalNodeModule {

    private final AdditionalNode owner;

    public AdditionalNodeModule(AdditionalNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AdditionalNode provideAdditionalNode() {
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

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @Named("AdditionalNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AdditionalNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AdditionalNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AdditionalNode> provideTypeRuleProvider(AdditionalNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("AdditionalNodeRuleProvider") @IntoMap @StringKey("additionalNode")
        RuleProvider<AdditionalNode> provideAdditionalNodeChildRuleProvider(
            ApplicationNodeChildProvider.AdditionalNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<AdditionalNode>> provideRuleProviders(
        @Named("AdditionalNodeRuleProvider")  Map<String, Provider<RuleProvider<AdditionalNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}