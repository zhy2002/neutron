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
public class ProductFeeNodeModule {

    private final ProductFeeNode owner;

    public ProductFeeNodeModule(ProductFeeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductFeeNode provideProductFeeNode() {
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

    @Provides @ComponentScope ProductFeeListNode provideProductFeeListNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductFeeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductFeeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductFeeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductFeeNode> provideTypeRuleProvider(ProductFeeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductFeeNode>> provideRuleProviders(
        @Named("ProductFeeNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductFeeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}