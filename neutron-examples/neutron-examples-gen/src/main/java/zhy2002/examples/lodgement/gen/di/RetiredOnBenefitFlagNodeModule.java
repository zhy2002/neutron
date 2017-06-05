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
public class RetiredOnBenefitFlagNodeModule {

    private final RetiredOnBenefitFlagNode owner;

    public RetiredOnBenefitFlagNodeModule(RetiredOnBenefitFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RetiredOnBenefitFlagNode provideRetiredOnBenefitFlagNode() {
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

    @Provides @ComponentScope RetiredEmploymentNode provideRetiredEmploymentNode() {
        return owner.getParent();
    }

    @Provides @Named("RetiredOnBenefitFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RetiredOnBenefitFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RetiredOnBenefitFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RetiredOnBenefitFlagNode> provideTypeRuleProvider(RetiredOnBenefitFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<RetiredOnBenefitFlagNode>> provideRuleProviders(
        @Named("RetiredOnBenefitFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<RetiredOnBenefitFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}