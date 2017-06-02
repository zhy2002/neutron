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
public class YearNodeModule {

    private final YearNode owner;

    public YearNodeModule(YearNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner YearNode provideYearNode() {
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

    @Provides @ComponentScope MonthYearNode<?> provideMonthYearNode() {
        return owner.getParent();
    }

    @Provides @Named("YearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<YearNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("YearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<YearNode> provideTypeRuleProvider(YearNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<YearNode>> provideRuleProviders(
        @Named("YearNodeRuleProvider")  Map<String, Provider<RuleProvider<YearNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}