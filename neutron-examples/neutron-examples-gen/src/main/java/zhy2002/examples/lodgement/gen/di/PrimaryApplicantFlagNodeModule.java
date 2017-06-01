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
public class PrimaryApplicantFlagNodeModule {

    private final PrimaryApplicantFlagNode owner;

    public PrimaryApplicantFlagNodeModule(PrimaryApplicantFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PrimaryApplicantFlagNode providePrimaryApplicantFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
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

    @Provides @Named("PrimaryApplicantFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PrimaryApplicantFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PrimaryApplicantFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PrimaryApplicantFlagNode> provideTypeRuleProvider(PrimaryApplicantFlagNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PrimaryApplicantFlagNodeRuleProvider") @IntoMap @StringKey("primaryApplicantFlagNode")
        RuleProvider<PrimaryApplicantFlagNode> providePrimaryApplicantFlagNodeChildRuleProvider(
            PersonGeneralNodeChildProvider.PrimaryApplicantFlagNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PrimaryApplicantFlagNode>> provideRuleProviders(
        @Named("PrimaryApplicantFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<PrimaryApplicantFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}