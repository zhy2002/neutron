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

    @Provides @FeePayFromNodeScope @Owner FeePayFromNode provideFeePayFromNode() {
        return owner;
    }

    @Provides @FeePayFromNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @FeePayFromNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @FeePayFromNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @FeePayFromNodeScope ProductFeeNode provideProductFeeNode() {
        return owner.getParent();
    }

    @Provides @FeePayFromNodeScope
    Map<String, RuleProvider<FeePayFromNode>> provideInstanceProviders(
        Provider<ProductFeeNodeChildProvider.FeePayFromNodeRuleProvider> feePayFromNodeRuleProvider
    ) {
        Map<String, RuleProvider<FeePayFromNode>> result = new HashMap<>();
        result.put("feePayFromNode", feePayFromNodeRuleProvider.get());
        return result;
    }
}