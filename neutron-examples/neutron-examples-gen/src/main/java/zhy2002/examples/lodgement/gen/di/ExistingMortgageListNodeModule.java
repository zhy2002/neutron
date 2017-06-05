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
public class ExistingMortgageListNodeModule {

    private final ExistingMortgageListNode owner;

    public ExistingMortgageListNodeModule(ExistingMortgageListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExistingMortgageListNode provideExistingMortgageListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @Named("ExistingMortgageListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ExistingMortgageListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ExistingMortgageListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ExistingMortgageListNode> provideTypeRuleProvider(ExistingMortgageListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ExistingMortgageListNode>> provideRuleProviders(
        @Named("ExistingMortgageListNodeRuleProvider")  Map<String, Provider<RuleProvider<ExistingMortgageListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}