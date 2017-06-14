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
public class GrossYearlySalaryNodeModule {

    private final GrossYearlySalaryNode owner;

    public GrossYearlySalaryNodeModule(GrossYearlySalaryNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner GrossYearlySalaryNode provideGrossYearlySalaryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
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

    @Provides @ComponentScope PayeEmployedNode providePayeEmployedNode() {
        return owner.getParent();
    }

    @Provides @Named("GrossYearlySalaryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<GrossYearlySalaryNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("GrossYearlySalaryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<GrossYearlySalaryNode> provideTypeRuleProvider(GrossYearlySalaryNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<GrossYearlySalaryNode>> provideRuleProviders(
        @Named("GrossYearlySalaryNodeRuleProvider")  Map<String, Provider<RuleProvider<GrossYearlySalaryNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}