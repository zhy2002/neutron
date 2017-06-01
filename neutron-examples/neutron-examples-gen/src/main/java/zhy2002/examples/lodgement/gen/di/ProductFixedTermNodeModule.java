package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductFixedTermNodeModule {

    private final ProductFixedTermNode owner;

    public ProductFixedTermNodeModule(ProductFixedTermNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductFixedTermNode provideProductFixedTermNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductFixedTermNode> provideRuleProvider(Provider<ProductFixedTermNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductFixedTermNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductFixedTermNodeRuleProvider> productFixedTermNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductFixedTermNode>> result = new HashMap<>();
        result.put("productFixedTermNode", productFixedTermNodeRuleProvider.get());
        return result;
    }
}