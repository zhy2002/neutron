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
public class OtherIncomeTypeNodeModule {

    private final OtherIncomeTypeNode owner;

    public OtherIncomeTypeNodeModule(OtherIncomeTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomeTypeNode provideOtherIncomeTypeNode() {
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

    @Provides @Named("OtherIncomeTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherIncomeTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherIncomeTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherIncomeTypeNode> provideTypeRuleProvider(OtherIncomeTypeNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("OtherIncomeTypeNodeRuleProvider") @IntoMap @StringKey("otherIncomeTypeNode")
        RuleProvider<OtherIncomeTypeNode> provideOtherIncomeTypeNodeChildRuleProvider(
            OtherIncomeNodeChildProvider.OtherIncomeTypeNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<OtherIncomeTypeNode>> provideRuleProviders(
        @Named("OtherIncomeTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherIncomeTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}