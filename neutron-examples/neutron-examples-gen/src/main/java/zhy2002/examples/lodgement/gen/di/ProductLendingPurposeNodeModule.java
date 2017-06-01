package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductLendingPurposeNodeModule {

    private final ProductLendingPurposeNode owner;

    public ProductLendingPurposeNodeModule(ProductLendingPurposeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductLendingPurposeNode provideProductLendingPurposeNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductLendingPurposeNode> provideRuleProvider(Provider<ProductLendingPurposeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductLendingPurposeNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductLendingPurposeNodeRuleProvider> productLendingPurposeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductLendingPurposeNode>> result = new HashMap<>();
        result.put("productLendingPurposeNode", productLendingPurposeNodeRuleProvider.get());
        return result;
    }
}