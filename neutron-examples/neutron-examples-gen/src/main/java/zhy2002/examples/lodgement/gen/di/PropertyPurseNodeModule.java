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
public class PropertyPurseNodeModule {

    private final PropertyPurseNode owner;

    public PropertyPurseNodeModule(PropertyPurseNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyPurseNode providePropertyPurseNode() {
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

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @Named("PropertyPurseNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PropertyPurseNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PropertyPurseNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PropertyPurseNode> provideTypeRuleProvider(PropertyPurseNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PropertyPurseNode>> provideRuleProviders(
        @Named("PropertyPurseNodeRuleProvider")  Map<String, Provider<RuleProvider<PropertyPurseNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}