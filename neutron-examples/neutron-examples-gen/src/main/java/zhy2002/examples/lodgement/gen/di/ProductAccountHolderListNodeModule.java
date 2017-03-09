package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


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

    @Provides @ProductAccountHolderListNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ProductAccountHolderListNodeScope
    Map<String, RuleProvider<ProductAccountHolderListNode>> provideInstanceProviders(
        Provider<ProductDescriptionNodeChildProvider.ProductAccountHolderListNodeRuleProvider> productAccountHolderListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductAccountHolderListNode>> result = new HashMap<>();
        result.put("productAccountHolderListNode", productAccountHolderListNodeRuleProvider.get());
        return result;
    }
}