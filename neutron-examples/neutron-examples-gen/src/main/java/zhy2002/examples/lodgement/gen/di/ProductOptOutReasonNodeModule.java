package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductOptOutReasonNodeModule {

    private final ProductOptOutReasonNode owner;

    public ProductOptOutReasonNodeModule(ProductOptOutReasonNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductOptOutReasonNode provideProductOptOutReasonNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductOptOutReasonNode> provideRuleProvider(Provider<ProductOptOutReasonNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductOptOutReasonNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductOptOutReasonNodeRuleProvider> productOptOutReasonNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductOptOutReasonNode>> result = new HashMap<>();
        result.put("productOptOutReasonNode", productOptOutReasonNodeRuleProvider.get());
        return result;
    }
}