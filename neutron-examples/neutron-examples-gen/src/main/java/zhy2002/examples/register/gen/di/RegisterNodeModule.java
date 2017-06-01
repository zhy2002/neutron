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
public class RegisterNodeModule {

    private final RegisterNode owner;

    public RegisterNodeModule(RegisterNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RegisterNode provideRegisterNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner RootUiNode<?> provideRootUiNode() {
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

    @Provides @Named("RegisterNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RegisterNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RegisterNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RegisterNode> provideTypeRuleProvider(RegisterNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<RegisterNode>> provideRuleProviders(
        @Named("RegisterNodeRuleProvider")  Map<String, Provider<RuleProvider<RegisterNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}