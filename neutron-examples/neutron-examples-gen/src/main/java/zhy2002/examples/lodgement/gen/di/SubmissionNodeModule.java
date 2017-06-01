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
public class SubmissionNodeModule {

    private final SubmissionNode owner;

    public SubmissionNodeModule(SubmissionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SubmissionNode provideSubmissionNode() {
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

    @Provides @Named("SubmissionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SubmissionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SubmissionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SubmissionNode> provideTypeRuleProvider(SubmissionNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("SubmissionNodeRuleProvider") @IntoMap @StringKey("submissionNode")
        RuleProvider<SubmissionNode> provideSubmissionNodeChildRuleProvider(
            ApplicationNodeChildProvider.SubmissionNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<SubmissionNode>> provideRuleProviders(
        @Named("SubmissionNodeRuleProvider")  Map<String, Provider<RuleProvider<SubmissionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}