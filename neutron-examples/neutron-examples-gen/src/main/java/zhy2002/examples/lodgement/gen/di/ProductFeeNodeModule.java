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

    @Provides @ComponentScope @Owner ProductFeeNode provideProductFeeNode() {
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

    @Provides @ComponentScope ProductFeeListNode provideProductFeeListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductFeeNode> provideRuleProvider(Provider<ProductFeeNodeRuleProvider> provider) {
        return provider.get();
    }

}