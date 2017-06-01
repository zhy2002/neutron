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
public class TrustBeneficiaryClassListNodeModule {

    private final TrustBeneficiaryClassListNode owner;

    public TrustBeneficiaryClassListNodeModule(TrustBeneficiaryClassListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustBeneficiaryClassListNode provideTrustBeneficiaryClassListNode() {
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

    @Provides @Named("TrustBeneficiaryClassListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TrustBeneficiaryClassListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TrustBeneficiaryClassListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TrustBeneficiaryClassListNode> provideTypeRuleProvider(TrustBeneficiaryClassListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("TrustBeneficiaryClassListNodeRuleProvider") @IntoMap @StringKey("trustBeneficiaryClassListNode")
        RuleProvider<TrustBeneficiaryClassListNode> provideTrustBeneficiaryClassListNodeChildRuleProvider(
            BaseTrustNodeChildProvider.TrustBeneficiaryClassListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<TrustBeneficiaryClassListNode>> provideRuleProviders(
        @Named("TrustBeneficiaryClassListNodeRuleProvider")  Map<String, Provider<RuleProvider<TrustBeneficiaryClassListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}