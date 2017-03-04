package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductRewardsProgramNodeModule {

    private final ProductRewardsProgramNode owner;

    public ProductRewardsProgramNodeModule(ProductRewardsProgramNode owner) {
        this.owner = owner;
    }

    @Provides @ProductRewardsProgramNodeScope @Owner ProductRewardsProgramNode provideProductRewardsProgramNode() {
        return owner;
    }

    @Provides @ProductRewardsProgramNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductRewardsProgramNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductRewardsProgramNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductRewardsProgramNodeScope ProductCardHolderNode provideProductCardHolderNode() {
        return owner.getParent();
    }

}