package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductTotalLoanTermNodeModule {

    private final ProductTotalLoanTermNode owner;

    public ProductTotalLoanTermNodeModule(ProductTotalLoanTermNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductTotalLoanTermNode provideProductTotalLoanTermNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductTotalLoanTermNode> provideRuleProvider(Provider<ProductTotalLoanTermNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductTotalLoanTermNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductTotalLoanTermNodeRuleProvider> productTotalLoanTermNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalLoanTermNode>> result = new HashMap<>();
        result.put("productTotalLoanTermNode", productTotalLoanTermNodeRuleProvider.get());
        return result;
    }
}