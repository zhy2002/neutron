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
public class PasswordNodeModule {

    private final PasswordNode owner;

    public PasswordNodeModule(PasswordNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PasswordNode providePasswordNode() {
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

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @Named("PasswordNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PasswordNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PasswordNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PasswordNode> provideTypeRuleProvider(PasswordNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PasswordNode>> provideRuleProviders(
        @Named("PasswordNodeRuleProvider")  Map<String, Provider<RuleProvider<PasswordNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}