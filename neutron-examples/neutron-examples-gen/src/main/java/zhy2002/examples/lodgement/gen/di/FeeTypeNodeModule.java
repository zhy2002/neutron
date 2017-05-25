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

    @Provides @FeeTypeNodeScope @Owner FeeTypeNode provideFeeTypeNode() {
        return owner;
    }

    @Provides @FeeTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @FeeTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @FeeTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @FeeTypeNodeScope ProductFeeNode provideProductFeeNode() {
        return owner.getParent();
    }

    @Provides @FeeTypeNodeScope
    RuleProvider<FeeTypeNode> provideRuleProvider(Provider<FeeTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @FeeTypeNodeScope
    Map<String, RuleProvider<FeeTypeNode>> provideInstanceProviderMap(
        Provider<ProductFeeNodeChildProvider.FeeTypeNodeRuleProvider> feeTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<FeeTypeNode>> result = new HashMap<>();
        result.put("feeTypeNode", feeTypeNodeRuleProvider.get());
        return result;
    }
}