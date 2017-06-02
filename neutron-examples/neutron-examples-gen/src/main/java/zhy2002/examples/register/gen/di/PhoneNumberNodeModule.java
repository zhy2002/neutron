package zhy2002.examples.register.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class PhoneNumberNodeModule {

    private final PhoneNumberNode owner;

    public PhoneNumberNodeModule(PhoneNumberNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PhoneNumberNode providePhoneNumberNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner PhoneInfoFieldNode providePhoneInfoFieldNode() {
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

    @Provides @ComponentScope PhoneInfoNode providePhoneInfoNode() {
        return owner.getParent();
    }

    @Provides @Named("PhoneNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PhoneNumberNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PhoneNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PhoneNumberNode> provideTypeRuleProvider(PhoneNumberNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PhoneNumberNode>> provideRuleProviders(
        @Named("PhoneNumberNodeRuleProvider")  Map<String, Provider<RuleProvider<PhoneNumberNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}