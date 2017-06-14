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
public class MortgageInterestOnlyRemainingPeriodNodeModule {

    private final MortgageInterestOnlyRemainingPeriodNode owner;

    public MortgageInterestOnlyRemainingPeriodNodeModule(MortgageInterestOnlyRemainingPeriodNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageInterestOnlyRemainingPeriodNode provideMortgageInterestOnlyRemainingPeriodNode() {
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

    @Provides @Named("MortgageInterestOnlyRemainingPeriodNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MortgageInterestOnlyRemainingPeriodNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MortgageInterestOnlyRemainingPeriodNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MortgageInterestOnlyRemainingPeriodNode> provideTypeRuleProvider(MortgageInterestOnlyRemainingPeriodNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MortgageInterestOnlyRemainingPeriodNode>> provideRuleProviders(
        @Named("MortgageInterestOnlyRemainingPeriodNodeRuleProvider")  Map<String, Provider<RuleProvider<MortgageInterestOnlyRemainingPeriodNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}