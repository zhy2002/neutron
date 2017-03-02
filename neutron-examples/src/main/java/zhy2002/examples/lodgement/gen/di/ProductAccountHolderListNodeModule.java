package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductAccountHolderListNodeModule {

    private final ProductAccountHolderListNode owner;

    public ProductAccountHolderListNodeModule(ProductAccountHolderListNode owner) {
        this.owner = owner;
    }

    @Provides @ProductAccountHolderListNodeScope @Owner ProductAccountHolderListNode provideProductAccountHolderListNode() {
        return owner;
    }

    @Provides @ProductAccountHolderListNodeScope @Owner SelectAccountHolderListNode<?> provideSelectAccountHolderListNode() {
        return owner;
    }

    @Provides @ProductAccountHolderListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ProductAccountHolderListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductAccountHolderListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}