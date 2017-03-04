package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductOptOutReasonNodeModule {

    private final ProductOptOutReasonNode owner;

    public ProductOptOutReasonNodeModule(ProductOptOutReasonNode owner) {
        this.owner = owner;
    }

    @Provides @ProductOptOutReasonNodeScope @Owner ProductOptOutReasonNode provideProductOptOutReasonNode() {
        return owner;
    }

    @Provides @ProductOptOutReasonNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductOptOutReasonNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductOptOutReasonNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductOptOutReasonNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

}