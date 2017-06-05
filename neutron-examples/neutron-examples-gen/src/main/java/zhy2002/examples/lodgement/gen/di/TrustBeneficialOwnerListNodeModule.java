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
public class TrustBeneficialOwnerListNodeModule {

    private final TrustBeneficialOwnerListNode owner;

    public TrustBeneficialOwnerListNodeModule(TrustBeneficialOwnerListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustBeneficialOwnerListNode provideTrustBeneficialOwnerListNode() {
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

    @Provides @Named("TrustBeneficialOwnerListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TrustBeneficialOwnerListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TrustBeneficialOwnerListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TrustBeneficialOwnerListNode> provideTypeRuleProvider(TrustBeneficialOwnerListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<TrustBeneficialOwnerListNode>> provideRuleProviders(
        @Named("TrustBeneficialOwnerListNodeRuleProvider")  Map<String, Provider<RuleProvider<TrustBeneficialOwnerListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}