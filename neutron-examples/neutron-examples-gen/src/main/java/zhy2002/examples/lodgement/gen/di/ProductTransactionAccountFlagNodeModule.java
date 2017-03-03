package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductTransactionAccountFlagNodeModule {

    private final ProductTransactionAccountFlagNode owner;

    public ProductTransactionAccountFlagNodeModule(ProductTransactionAccountFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope @Owner ProductTransactionAccountFlagNode provideProductTransactionAccountFlagNode() {
        return owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}