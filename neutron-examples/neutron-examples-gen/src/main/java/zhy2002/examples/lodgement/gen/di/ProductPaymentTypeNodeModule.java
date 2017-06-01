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

    @Provides @ComponentScope @Owner ProductPaymentTypeNode provideProductPaymentTypeNode() {
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

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductPaymentTypeNode> provideRuleProvider(Provider<ProductPaymentTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductPaymentTypeNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductPaymentTypeNodeRuleProvider> productPaymentTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductPaymentTypeNode>> result = new HashMap<>();
        result.put("productPaymentTypeNode", productPaymentTypeNodeRuleProvider.get());
        return result;
    }
}