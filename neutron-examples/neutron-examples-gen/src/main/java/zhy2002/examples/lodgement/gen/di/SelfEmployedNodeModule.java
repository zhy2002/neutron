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
public class SelfEmployedNodeModule {

    private final SelfEmployedNode owner;

    public SelfEmployedNodeModule(SelfEmployedNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelfEmployedNode provideSelfEmployedNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmployedNode provideEmployedNode() {
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

    @Provides @ComponentScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @Named("SelfEmployedNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SelfEmployedNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SelfEmployedNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SelfEmployedNode> provideTypeRuleProvider(SelfEmployedNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SelfEmployedNode>> provideRuleProviders(
        @Named("SelfEmployedNodeRuleProvider")  Map<String, Provider<RuleProvider<SelfEmployedNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}