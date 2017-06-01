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
public class AccessTelephoneNodeModule {

    private final AccessTelephoneNode owner;

    public AccessTelephoneNodeModule(AccessTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessTelephoneNode provideAccessTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @Named("AccessTelephoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AccessTelephoneNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AccessTelephoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AccessTelephoneNode> provideTypeRuleProvider(AccessTelephoneNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("AccessTelephoneNodeRuleProvider") @IntoMap @StringKey("accessTelephoneNode")
        RuleProvider<AccessTelephoneNode> provideAccessTelephoneNodeChildRuleProvider(
            AccessNodeChildProvider.AccessTelephoneNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<AccessTelephoneNode>> provideRuleProviders(
        @Named("AccessTelephoneNodeRuleProvider")  Map<String, Provider<RuleProvider<AccessTelephoneNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}