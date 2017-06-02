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
public class BusinessTypeNodeModule {

    private final BusinessTypeNode owner;

    public BusinessTypeNodeModule(BusinessTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BusinessTypeNode provideBusinessTypeNode() {
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

    @Provides @ComponentScope SelfEmployedNode provideSelfEmployedNode() {
        return owner.getParent();
    }

    @Provides @Named("BusinessTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<BusinessTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("BusinessTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<BusinessTypeNode> provideTypeRuleProvider(BusinessTypeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<BusinessTypeNode>> provideRuleProviders(
        @Named("BusinessTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<BusinessTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}