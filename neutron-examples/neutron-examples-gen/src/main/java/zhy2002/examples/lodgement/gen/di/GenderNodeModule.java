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
public class GenderNodeModule {

    private final GenderNode owner;

    public GenderNodeModule(GenderNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner GenderNode provideGenderNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("GenderNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<GenderNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("GenderNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<GenderNode> provideTypeRuleProvider(GenderNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("GenderNodeRuleProvider") @IntoMap @StringKey("genderNode")
        RuleProvider<GenderNode> provideGenderNodeChildRuleProvider(
            PersonGeneralNodeChildProvider.GenderNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<GenderNode>> provideRuleProviders(
        @Named("GenderNodeRuleProvider")  Map<String, Provider<RuleProvider<GenderNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}