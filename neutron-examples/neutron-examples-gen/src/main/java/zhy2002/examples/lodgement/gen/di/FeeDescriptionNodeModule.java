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

    @Provides @ComponentScope @Owner FeeDescriptionNode provideFeeDescriptionNode() {
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

    @Provides @ComponentScope ProductFeeNode provideProductFeeNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<FeeDescriptionNode> provideRuleProvider(Provider<FeeDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<FeeDescriptionNode>> provideInstanceProviderMap(
        Provider<ProductFeeNodeChildProvider.FeeDescriptionNodeRuleProvider> feeDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<FeeDescriptionNode>> result = new HashMap<>();
        result.put("feeDescriptionNode", feeDescriptionNodeRuleProvider.get());
        return result;
    }
}