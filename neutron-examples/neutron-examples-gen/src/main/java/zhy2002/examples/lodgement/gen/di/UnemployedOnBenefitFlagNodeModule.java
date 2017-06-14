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
public class UnemployedOnBenefitFlagNodeModule {

    private final UnemployedOnBenefitFlagNode owner;

    public UnemployedOnBenefitFlagNodeModule(UnemployedOnBenefitFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UnemployedOnBenefitFlagNode provideUnemployedOnBenefitFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
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

    @Provides @ComponentScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @Named("UnemployedOnBenefitFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<UnemployedOnBenefitFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("UnemployedOnBenefitFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<UnemployedOnBenefitFlagNode> provideTypeRuleProvider(UnemployedOnBenefitFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<UnemployedOnBenefitFlagNode>> provideRuleProviders(
        @Named("UnemployedOnBenefitFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<UnemployedOnBenefitFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}