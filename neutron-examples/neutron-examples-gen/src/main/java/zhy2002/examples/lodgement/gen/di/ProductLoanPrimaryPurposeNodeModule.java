package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductLoanPrimaryPurposeNodeModule {

    private final ProductLoanPrimaryPurposeNode owner;

    public ProductLoanPrimaryPurposeNodeModule(ProductLoanPrimaryPurposeNode owner) {
        this.owner = owner;
    }

    @Provides @ProductLoanPrimaryPurposeNodeScope @Owner ProductLoanPrimaryPurposeNode provideProductLoanPrimaryPurposeNode() {
        return owner;
    }

    @Provides @ProductLoanPrimaryPurposeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductLoanPrimaryPurposeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductLoanPrimaryPurposeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}