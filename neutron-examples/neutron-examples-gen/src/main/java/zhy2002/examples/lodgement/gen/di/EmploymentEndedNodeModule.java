package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EmploymentEndedNodeModule {

    private final EmploymentEndedNode owner;

    public EmploymentEndedNodeModule(EmploymentEndedNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EmploymentEndedNode provideEmploymentEndedNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
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

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<EmploymentEndedNode> provideRuleProvider(Provider<EmploymentEndedNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<EmploymentEndedNode>> provideInstanceProviderMap(
        Provider<EmployedNodeChildProvider.EmploymentEndedNodeRuleProvider> employmentEndedNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmploymentEndedNode>> result = new HashMap<>();
        result.put("employmentEndedNode", employmentEndedNodeRuleProvider.get());
        return result;
    }
}