package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductDescriptionNodeModule {

    private final ProductDescriptionNode owner;

    public ProductDescriptionNodeModule(ProductDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductDescriptionNode provideProductDescriptionNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ProductNode provideProductNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductDescriptionNode> provideRuleProvider(Provider<ProductDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductDescriptionNode>> provideInstanceProviderMap(
        Provider<ProductNodeChildProvider.ProductDescriptionNodeRuleProvider> productDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductDescriptionNode>> result = new HashMap<>();
        result.put("productDescriptionNode", productDescriptionNodeRuleProvider.get());
        return result;
    }
}