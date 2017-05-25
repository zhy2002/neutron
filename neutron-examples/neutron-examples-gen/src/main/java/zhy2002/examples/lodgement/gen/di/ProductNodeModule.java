package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class ProductNodeModule {

    private final ProductNode owner;

    public ProductNodeModule(ProductNode owner) {
        this.owner = owner;
    }

    @Provides @ProductNodeScope @Owner ProductNode provideProductNode() {
        return owner;
    }

    @Provides @ProductNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductNodeScope ProductListNode provideProductListNode() {
        return owner.getParent();
    }

    @Provides @ProductNodeScope
    RuleProvider<ProductNode> provideRuleProvider(Provider<ProductNodeRuleProvider> provider) {
        return provider.get();
    }

}