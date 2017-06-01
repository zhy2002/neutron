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
public class FeeTypeNodeModule {

    private final FeeTypeNode owner;

    public FeeTypeNodeModule(FeeTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner FeeTypeNode provideFeeTypeNode() {
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

    @Provides @ComponentScope ProductFeeNode provideProductFeeNode() {
        return owner.getParent();
    }

    @Provides @Named("FeeTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<FeeTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("FeeTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<FeeTypeNode> provideTypeRuleProvider(FeeTypeNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("FeeTypeNodeRuleProvider") @IntoMap @StringKey("feeTypeNode")
        RuleProvider<FeeTypeNode> provideFeeTypeNodeChildRuleProvider(
            ProductFeeNodeChildProvider.FeeTypeNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<FeeTypeNode>> provideRuleProviders(
        @Named("FeeTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<FeeTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}