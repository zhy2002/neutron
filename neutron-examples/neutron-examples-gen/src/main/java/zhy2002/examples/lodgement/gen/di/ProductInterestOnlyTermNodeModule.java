package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductInterestOnlyTermNodeModule {

    private final ProductInterestOnlyTermNode owner;

    public ProductInterestOnlyTermNodeModule(ProductInterestOnlyTermNode owner) {
        this.owner = owner;
    }

    @Provides @ProductInterestOnlyTermNodeScope @Owner ProductInterestOnlyTermNode provideProductInterestOnlyTermNode() {
        return owner;
    }

    @Provides @ProductInterestOnlyTermNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductInterestOnlyTermNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductInterestOnlyTermNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductInterestOnlyTermNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

}