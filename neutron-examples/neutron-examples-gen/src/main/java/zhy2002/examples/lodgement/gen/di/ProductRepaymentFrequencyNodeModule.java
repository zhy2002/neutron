package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductRepaymentFrequencyNodeModule {

    private final ProductRepaymentFrequencyNode owner;

    public ProductRepaymentFrequencyNodeModule(ProductRepaymentFrequencyNode owner) {
        this.owner = owner;
    }

    @Provides @ProductRepaymentFrequencyNodeScope @Owner ProductRepaymentFrequencyNode provideProductRepaymentFrequencyNode() {
        return owner;
    }

    @Provides @ProductRepaymentFrequencyNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductRepaymentFrequencyNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductRepaymentFrequencyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductRepaymentFrequencyNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

}