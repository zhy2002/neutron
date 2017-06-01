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
public class LoanClearingFlagNodeModule {

    private final LoanClearingFlagNode owner;

    public LoanClearingFlagNodeModule(LoanClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanClearingFlagNode provideLoanClearingFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @Named("LoanClearingFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LoanClearingFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LoanClearingFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LoanClearingFlagNode> provideTypeRuleProvider(LoanClearingFlagNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("LoanClearingFlagNodeRuleProvider") @IntoMap @StringKey("loanClearingFlagNode")
        RuleProvider<LoanClearingFlagNode> provideLoanClearingFlagNodeChildRuleProvider(
            LoanNodeChildProvider.LoanClearingFlagNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<LoanClearingFlagNode>> provideRuleProviders(
        @Named("LoanClearingFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<LoanClearingFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}