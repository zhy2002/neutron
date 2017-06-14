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
public class TrustSettlorListNodeModule {

    private final TrustSettlorListNode owner;

    public TrustSettlorListNodeModule(TrustSettlorListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustSettlorListNode provideTrustSettlorListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @Named("TrustSettlorListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TrustSettlorListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TrustSettlorListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TrustSettlorListNode> provideTypeRuleProvider(TrustSettlorListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<TrustSettlorListNode>> provideRuleProviders(
        @Named("TrustSettlorListNodeRuleProvider")  Map<String, Provider<RuleProvider<TrustSettlorListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}