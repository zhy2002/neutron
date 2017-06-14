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
public class EmployerPhoneNodeModule {

    private final EmployerPhoneNode owner;

    public EmployerPhoneNodeModule(EmployerPhoneNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EmployerPhoneNode provideEmployerPhoneNode() {
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

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @Named("EmployerPhoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<EmployerPhoneNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("EmployerPhoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<EmployerPhoneNode> provideTypeRuleProvider(EmployerPhoneNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<EmployerPhoneNode>> provideRuleProviders(
        @Named("EmployerPhoneNodeRuleProvider")  Map<String, Provider<RuleProvider<EmployerPhoneNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}