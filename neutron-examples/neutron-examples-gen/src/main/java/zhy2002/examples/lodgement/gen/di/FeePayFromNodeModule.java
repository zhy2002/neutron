package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class FeePayFromNodeModule {

    private final FeePayFromNode owner;

    public FeePayFromNodeModule(FeePayFromNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner FeePayFromNode provideFeePayFromNode() {
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
    RuleProvider<FeePayFromNode> provideRuleProvider(Provider<FeePayFromNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<FeePayFromNode>> provideInstanceProviderMap(
        Provider<ProductFeeNodeChildProvider.FeePayFromNodeRuleProvider> feePayFromNodeRuleProvider
    ) {
        Map<String, RuleProvider<FeePayFromNode>> result = new HashMap<>();
        result.put("feePayFromNode", feePayFromNodeRuleProvider.get());
        return result;
    }
}