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
public class ProductRewardsProgramNodeModule {

    private final ProductRewardsProgramNode owner;

    public ProductRewardsProgramNodeModule(ProductRewardsProgramNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductRewardsProgramNode provideProductRewardsProgramNode() {
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

    @Provides @ComponentScope ProductCardHolderNode provideProductCardHolderNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductRewardsProgramNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductRewardsProgramNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductRewardsProgramNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductRewardsProgramNode> provideTypeRuleProvider(ProductRewardsProgramNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductRewardsProgramNode>> provideRuleProviders(
        @Named("ProductRewardsProgramNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductRewardsProgramNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}