package zhy2002.examples.register.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class PropertyStateNodeModule {

    private final PropertyStateNode owner;

    public PropertyStateNodeModule(PropertyStateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyStateNode providePropertyStateNode() {
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

    @Provides @ComponentScope PropertyDetailsNode providePropertyDetailsNode() {
        return owner.getParent();
    }

    @Provides @Named("PropertyStateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PropertyStateNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PropertyStateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PropertyStateNode> provideTypeRuleProvider(PropertyStateNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PropertyStateNode>> provideRuleProviders(
        @Named("PropertyStateNodeRuleProvider")  Map<String, Provider<RuleProvider<PropertyStateNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}