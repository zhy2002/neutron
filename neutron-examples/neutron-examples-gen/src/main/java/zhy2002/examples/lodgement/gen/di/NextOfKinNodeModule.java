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
public class NextOfKinNodeModule {

    private final NextOfKinNode owner;

    public NextOfKinNodeModule(NextOfKinNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner NextOfKinNode provideNextOfKinNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("NextOfKinNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<NextOfKinNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("NextOfKinNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<NextOfKinNode> provideTypeRuleProvider(NextOfKinNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<NextOfKinNode>> provideRuleProviders(
        @Named("NextOfKinNodeRuleProvider")  Map<String, Provider<RuleProvider<NextOfKinNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}