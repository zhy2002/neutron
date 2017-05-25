package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class ProductFeeNodeModule {

    private final ProductFeeNode owner;

    public ProductFeeNodeModule(ProductFeeNode owner) {
        this.owner = owner;
    }

    @Provides @ProductFeeNodeScope @Owner ProductFeeNode provideProductFeeNode() {
        return owner;
    }

    @Provides @ProductFeeNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductFeeNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductFeeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductFeeNodeScope ProductFeeListNode provideProductFeeListNode() {
        return owner.getParent();
    }

    @Provides @ProductFeeNodeScope
    RuleProvider<ProductFeeNode> provideRuleProvider(Provider<ProductFeeNodeRuleProvider> provider) {
        return provider.get();
    }

}