package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductExpressConsentFlagNodeModule {

    private final ProductExpressConsentFlagNode owner;

    public ProductExpressConsentFlagNodeModule(ProductExpressConsentFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope @Owner ProductExpressConsentFlagNode provideProductExpressConsentFlagNode() {
        return owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

}