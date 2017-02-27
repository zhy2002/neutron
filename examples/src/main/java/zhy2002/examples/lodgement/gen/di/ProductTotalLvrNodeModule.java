package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductTotalLvrNodeModule {

    private final ProductTotalLvrNode owner;

    public ProductTotalLvrNodeModule(ProductTotalLvrNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTotalLvrNodeScope @Owner ProductTotalLvrNode provideProductTotalLvrNode() {
        return owner;
    }

    @Provides @ProductTotalLvrNodeScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
        return owner;
    }

    @Provides @ProductTotalLvrNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductTotalLvrNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTotalLvrNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}