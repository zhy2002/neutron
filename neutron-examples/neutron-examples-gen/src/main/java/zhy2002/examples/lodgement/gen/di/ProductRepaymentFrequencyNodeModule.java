package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductRepaymentFrequencyNodeModule {

    private final ProductRepaymentFrequencyNode owner;

    public ProductRepaymentFrequencyNodeModule(ProductRepaymentFrequencyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductRepaymentFrequencyNode provideProductRepaymentFrequencyNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductRepaymentFrequencyNode> provideRuleProvider(Provider<ProductRepaymentFrequencyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductRepaymentFrequencyNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductRepaymentFrequencyNodeRuleProvider> productRepaymentFrequencyNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductRepaymentFrequencyNode>> result = new HashMap<>();
        result.put("productRepaymentFrequencyNode", productRepaymentFrequencyNodeRuleProvider.get());
        return result;
    }
}