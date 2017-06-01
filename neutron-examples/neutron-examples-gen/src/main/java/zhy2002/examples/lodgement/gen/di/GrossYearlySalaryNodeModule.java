package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class GrossYearlySalaryNodeModule {

    private final GrossYearlySalaryNode owner;

    public GrossYearlySalaryNodeModule(GrossYearlySalaryNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner GrossYearlySalaryNode provideGrossYearlySalaryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope PayeEmployedNode providePayeEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<GrossYearlySalaryNode> provideRuleProvider(Provider<GrossYearlySalaryNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<GrossYearlySalaryNode>> provideInstanceProviderMap(
        Provider<PayeEmployedNodeChildProvider.GrossYearlySalaryNodeRuleProvider> grossYearlySalaryNodeRuleProvider
    ) {
        Map<String, RuleProvider<GrossYearlySalaryNode>> result = new HashMap<>();
        result.put("grossYearlySalaryNode", grossYearlySalaryNodeRuleProvider.get());
        return result;
    }
}