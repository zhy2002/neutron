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
public class PayeEmployedNodeModule {

    private final PayeEmployedNode owner;

    public PayeEmployedNodeModule(PayeEmployedNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PayeEmployedNode providePayeEmployedNode() {
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

    @Provides @Named("PayeEmployedNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PayeEmployedNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PayeEmployedNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PayeEmployedNode> provideTypeRuleProvider(PayeEmployedNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PayeEmployedNode>> provideRuleProviders(
        @Named("PayeEmployedNodeRuleProvider")  Map<String, Provider<RuleProvider<PayeEmployedNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}