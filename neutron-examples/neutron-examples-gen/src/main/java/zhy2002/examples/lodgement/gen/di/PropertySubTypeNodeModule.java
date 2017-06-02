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
public class PropertySubTypeNodeModule {

    private final PropertySubTypeNode owner;

    public PropertySubTypeNodeModule(PropertySubTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertySubTypeNode providePropertySubTypeNode() {
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

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @Named("PropertySubTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PropertySubTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PropertySubTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PropertySubTypeNode> provideTypeRuleProvider(PropertySubTypeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PropertySubTypeNode>> provideRuleProviders(
        @Named("PropertySubTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<PropertySubTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}