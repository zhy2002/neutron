package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductFixedTermNodeModule {

    private final ProductFixedTermNode owner;

    public ProductFixedTermNodeModule(ProductFixedTermNode owner) {
        this.owner = owner;
    }

    @Provides @ProductFixedTermNodeScope @Owner ProductFixedTermNode provideProductFixedTermNode() {
        return owner;
    }

    @Provides @ProductFixedTermNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductFixedTermNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductFixedTermNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}