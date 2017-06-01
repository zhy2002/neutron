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
public class OtherIncomeDescriptionNodeModule {

    private final OtherIncomeDescriptionNode owner;

    public OtherIncomeDescriptionNodeModule(OtherIncomeDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomeDescriptionNode provideOtherIncomeDescriptionNode() {
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

    @Provides @ComponentScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherIncomeDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherIncomeDescriptionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherIncomeDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherIncomeDescriptionNode> provideTypeRuleProvider(OtherIncomeDescriptionNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("OtherIncomeDescriptionNodeRuleProvider") @IntoMap @StringKey("otherIncomeDescriptionNode")
        RuleProvider<OtherIncomeDescriptionNode> provideOtherIncomeDescriptionNodeChildRuleProvider(
            OtherIncomeNodeChildProvider.OtherIncomeDescriptionNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<OtherIncomeDescriptionNode>> provideRuleProviders(
        @Named("OtherIncomeDescriptionNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherIncomeDescriptionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}