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
public class ProductRewardsMembershipNodeModule {

    private final ProductRewardsMembershipNode owner;

    public ProductRewardsMembershipNodeModule(ProductRewardsMembershipNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductRewardsMembershipNode provideProductRewardsMembershipNode() {
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

    @Provides @Named("ProductRewardsMembershipNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductRewardsMembershipNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductRewardsMembershipNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductRewardsMembershipNode> provideTypeRuleProvider(ProductRewardsMembershipNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductRewardsMembershipNode>> provideRuleProviders(
        @Named("ProductRewardsMembershipNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductRewardsMembershipNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}