package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductNameNodeModule {

    private final ProductNameNode owner;

    public ProductNameNodeModule(ProductNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductNameNode provideProductNameNode() {
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
    RuleProvider<ProductNameNode> provideRuleProvider(Provider<ProductNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductNameNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductNameNodeRuleProvider> productNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductNameNode>> result = new HashMap<>();
        result.put("productNameNode", productNameNodeRuleProvider.get());
        return result;
    }
}