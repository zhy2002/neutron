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

    @Provides @GrossYearlySalaryNodeScope @Owner GrossYearlySalaryNode provideGrossYearlySalaryNode() {
        return owner;
    }

    @Provides @GrossYearlySalaryNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @GrossYearlySalaryNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @GrossYearlySalaryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @GrossYearlySalaryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @GrossYearlySalaryNodeScope PayeEmployedNode providePayeEmployedNode() {
        return owner.getParent();
    }

    @Provides @GrossYearlySalaryNodeScope
    Map<String, RuleProvider<GrossYearlySalaryNode>> provideInstanceProviders(
        Provider<PayeEmployedNodeChildProvider.GrossYearlySalaryNodeRuleProvider> grossYearlySalaryNodeRuleProvider
    ) {
        Map<String, RuleProvider<GrossYearlySalaryNode>> result = new HashMap<>();
        result.put("grossYearlySalaryNode", grossYearlySalaryNodeRuleProvider.get());
        return result;
    }
}