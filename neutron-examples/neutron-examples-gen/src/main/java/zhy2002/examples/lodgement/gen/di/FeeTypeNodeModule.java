package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class FeeTypeNodeModule {

    private final FeeTypeNode owner;

    public FeeTypeNodeModule(FeeTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner FeeTypeNode provideFeeTypeNode() {
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

    @Provides @ComponentScope ProductFeeNode provideProductFeeNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<FeeTypeNode> provideRuleProvider(Provider<FeeTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<FeeTypeNode>> provideInstanceProviderMap(
        Provider<ProductFeeNodeChildProvider.FeeTypeNodeRuleProvider> feeTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<FeeTypeNode>> result = new HashMap<>();
        result.put("feeTypeNode", feeTypeNodeRuleProvider.get());
        return result;
    }
}