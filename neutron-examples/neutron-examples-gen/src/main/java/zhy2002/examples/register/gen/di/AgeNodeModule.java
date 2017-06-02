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
public class AgeNodeModule {

    private final AgeNode owner;

    public AgeNodeModule(AgeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AgeNode provideAgeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
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

    @Provides @Named("AgeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AgeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AgeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AgeNode> provideTypeRuleProvider(AgeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<AgeNode>> provideRuleProviders(
        @Named("AgeNodeRuleProvider")  Map<String, Provider<RuleProvider<AgeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}