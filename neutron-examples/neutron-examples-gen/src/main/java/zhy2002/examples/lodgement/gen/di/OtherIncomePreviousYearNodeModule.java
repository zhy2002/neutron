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
public class OtherIncomePreviousYearNodeModule {

    private final OtherIncomePreviousYearNode owner;

    public OtherIncomePreviousYearNodeModule(OtherIncomePreviousYearNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomePreviousYearNode provideOtherIncomePreviousYearNode() {
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

    @Provides @ComponentScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherIncomePreviousYearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherIncomePreviousYearNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherIncomePreviousYearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherIncomePreviousYearNode> provideTypeRuleProvider(OtherIncomePreviousYearNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherIncomePreviousYearNode>> provideRuleProviders(
        @Named("OtherIncomePreviousYearNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherIncomePreviousYearNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}