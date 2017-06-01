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
public class TrustBeneficiaryClassNodeModule {

    private final TrustBeneficiaryClassNode owner;

    public TrustBeneficiaryClassNodeModule(TrustBeneficiaryClassNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustBeneficiaryClassNode provideTrustBeneficiaryClassNode() {
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

    @Provides @ComponentScope TrustBeneficiaryClassListNode provideTrustBeneficiaryClassListNode() {
        return owner.getParent();
    }

    @Provides @Named("TrustBeneficiaryClassNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TrustBeneficiaryClassNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TrustBeneficiaryClassNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TrustBeneficiaryClassNode> provideTypeRuleProvider(TrustBeneficiaryClassNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<TrustBeneficiaryClassNode>> provideRuleProviders(
        @Named("TrustBeneficiaryClassNodeRuleProvider")  Map<String, Provider<RuleProvider<TrustBeneficiaryClassNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}