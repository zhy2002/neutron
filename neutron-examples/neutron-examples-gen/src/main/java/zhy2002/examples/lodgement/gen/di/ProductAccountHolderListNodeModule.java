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

    @Provides @ComponentScope @Owner ProductAccountHolderListNode provideProductAccountHolderListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner SelectAccountHolderListNode<?> provideSelectAccountHolderListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductAccountHolderListNode> provideRuleProvider(Provider<ProductAccountHolderListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductAccountHolderListNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductAccountHolderListNodeRuleProvider> productAccountHolderListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductAccountHolderListNode>> result = new HashMap<>();
        result.put("productAccountHolderListNode", productAccountHolderListNodeRuleProvider.get());
        return result;
    }
}