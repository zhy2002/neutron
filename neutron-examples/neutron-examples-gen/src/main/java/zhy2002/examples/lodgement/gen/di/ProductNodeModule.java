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

    @Provides @ComponentScope @Owner ProductNode provideProductNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductListNode provideProductListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductNode> provideRuleProvider(Provider<ProductNodeRuleProvider> provider) {
        return provider.get();
    }

}