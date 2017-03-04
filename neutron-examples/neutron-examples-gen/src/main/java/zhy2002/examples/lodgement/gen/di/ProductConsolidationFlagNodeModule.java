package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductConsolidationFlagNodeModule {

    private final ProductConsolidationFlagNode owner;

    public ProductConsolidationFlagNodeModule(ProductConsolidationFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductConsolidationFlagNodeScope @Owner ProductConsolidationFlagNode provideProductConsolidationFlagNode() {
        return owner;
    }

    @Provides @ProductConsolidationFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductConsolidationFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductConsolidationFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductConsolidationFlagNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

}