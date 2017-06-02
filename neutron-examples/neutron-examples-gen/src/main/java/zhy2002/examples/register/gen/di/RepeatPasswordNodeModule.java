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
public class RepeatPasswordNodeModule {

    private final RepeatPasswordNode owner;

    public RepeatPasswordNodeModule(RepeatPasswordNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RepeatPasswordNode provideRepeatPasswordNode() {
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

    @Provides @Named("RepeatPasswordNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RepeatPasswordNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RepeatPasswordNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RepeatPasswordNode> provideTypeRuleProvider(RepeatPasswordNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<RepeatPasswordNode>> provideRuleProviders(
        @Named("RepeatPasswordNodeRuleProvider")  Map<String, Provider<RuleProvider<RepeatPasswordNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}