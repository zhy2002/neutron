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
public class MortgageTermRemainingPeriodNodeModule {

    private final MortgageTermRemainingPeriodNode owner;

    public MortgageTermRemainingPeriodNodeModule(MortgageTermRemainingPeriodNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageTermRemainingPeriodNode provideMortgageTermRemainingPeriodNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner MonthYearNode<?> provideMonthYearNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @Named("MortgageTermRemainingPeriodNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MortgageTermRemainingPeriodNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MortgageTermRemainingPeriodNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MortgageTermRemainingPeriodNode> provideTypeRuleProvider(MortgageTermRemainingPeriodNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MortgageTermRemainingPeriodNode>> provideRuleProviders(
        @Named("MortgageTermRemainingPeriodNodeRuleProvider")  Map<String, Provider<RuleProvider<MortgageTermRemainingPeriodNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}