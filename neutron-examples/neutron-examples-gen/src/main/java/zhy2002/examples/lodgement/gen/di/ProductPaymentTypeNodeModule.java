package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductPaymentTypeNodeModule {

    private final ProductPaymentTypeNode owner;

    public ProductPaymentTypeNodeModule(ProductPaymentTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ProductPaymentTypeNodeScope @Owner ProductPaymentTypeNode provideProductPaymentTypeNode() {
        return owner;
    }

    @Provides @ProductPaymentTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductPaymentTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductPaymentTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductPaymentTypeNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ProductPaymentTypeNodeScope
    Map<String, RuleProvider<ProductPaymentTypeNode>> provideInstanceProviders(
        Provider<ProductDescriptionNodeChildProvider.ProductPaymentTypeNodeRuleProvider> productPaymentTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductPaymentTypeNode>> result = new HashMap<>();
        result.put("productPaymentTypeNode", productPaymentTypeNodeRuleProvider.get());
        return result;
    }
}