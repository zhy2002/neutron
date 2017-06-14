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
public class ApplicantReferenceNodeModule {

    private final ApplicantReferenceNode owner;

    public ApplicantReferenceNodeModule(ApplicantReferenceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ApplicantReferenceNode provideApplicantReferenceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope OwnershipNode provideOwnershipNode() {
        return owner.getParent();
    }

    @Provides @Named("ApplicantReferenceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ApplicantReferenceNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ApplicantReferenceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ApplicantReferenceNode> provideTypeRuleProvider(ApplicantReferenceNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ApplicantReferenceNode>> provideRuleProviders(
        @Named("ApplicantReferenceNodeRuleProvider")  Map<String, Provider<RuleProvider<ApplicantReferenceNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}