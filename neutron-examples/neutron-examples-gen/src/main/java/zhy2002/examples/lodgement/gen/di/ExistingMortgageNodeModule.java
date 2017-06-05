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
public class ExistingMortgageNodeModule {

    private final ExistingMortgageNode owner;

    public ExistingMortgageNodeModule(ExistingMortgageNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExistingMortgageNode provideExistingMortgageNode() {
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

    @Provides @ComponentScope ExistingMortgageListNode provideExistingMortgageListNode() {
        return owner.getParent();
    }

    @Provides @Named("ExistingMortgageNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ExistingMortgageNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ExistingMortgageNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ExistingMortgageNode> provideTypeRuleProvider(ExistingMortgageNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ExistingMortgageNode>> provideRuleProviders(
        @Named("ExistingMortgageNodeRuleProvider")  Map<String, Provider<RuleProvider<ExistingMortgageNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}