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
public class TrustNameNodeModule {

    private final TrustNameNode owner;

    public TrustNameNodeModule(TrustNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustNameNode provideTrustNameNode() {
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

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @Named("TrustNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TrustNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TrustNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TrustNameNode> provideTypeRuleProvider(TrustNameNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("TrustNameNodeRuleProvider") @IntoMap @StringKey("trustNameNode")
        RuleProvider<TrustNameNode> provideTrustNameNodeChildRuleProvider(
            BaseTrustNodeChildProvider.TrustNameNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<TrustNameNode>> provideRuleProviders(
        @Named("TrustNameNodeRuleProvider")  Map<String, Provider<RuleProvider<TrustNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}