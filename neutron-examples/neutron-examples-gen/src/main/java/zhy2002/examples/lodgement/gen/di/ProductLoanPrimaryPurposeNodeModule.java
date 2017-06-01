package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductLoanPrimaryPurposeNodeModule {

    private final ProductLoanPrimaryPurposeNode owner;

    public ProductLoanPrimaryPurposeNodeModule(ProductLoanPrimaryPurposeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductLoanPrimaryPurposeNode provideProductLoanPrimaryPurposeNode() {
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
    RuleProvider<ProductLoanPrimaryPurposeNode> provideRuleProvider(Provider<ProductLoanPrimaryPurposeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductLoanPrimaryPurposeNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductLoanPrimaryPurposeNodeRuleProvider> productLoanPrimaryPurposeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductLoanPrimaryPurposeNode>> result = new HashMap<>();
        result.put("productLoanPrimaryPurposeNode", productLoanPrimaryPurposeNodeRuleProvider.get());
        return result;
    }
}