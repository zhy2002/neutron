package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class FeeDescriptionNodeModule {

    private final FeeDescriptionNode owner;

    public FeeDescriptionNodeModule(FeeDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @FeeDescriptionNodeScope @Owner FeeDescriptionNode provideFeeDescriptionNode() {
        return owner;
    }

    @Provides @FeeDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @FeeDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @FeeDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @FeeDescriptionNodeScope ProductFeeNode provideProductFeeNode() {
        return owner.getParent();
    }

    @Provides @FeeDescriptionNodeScope
    Map<String, RuleProvider<FeeDescriptionNode>> provideInstanceProviders(
        Provider<ProductFeeNodeChildProvider.FeeDescriptionNodeRuleProvider> feeDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<FeeDescriptionNode>> result = new HashMap<>();
        result.put("feeDescriptionNode", feeDescriptionNodeRuleProvider.get());
        return result;
    }
}