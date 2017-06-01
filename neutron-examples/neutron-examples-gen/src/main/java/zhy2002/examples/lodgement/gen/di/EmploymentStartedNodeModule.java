package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EmploymentStartedNodeModule {

    private final EmploymentStartedNode owner;

    public EmploymentStartedNodeModule(EmploymentStartedNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EmploymentStartedNode provideEmploymentStartedNode() {
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
    RuleProvider<EmploymentStartedNode> provideRuleProvider(Provider<EmploymentStartedNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<EmploymentStartedNode>> provideInstanceProviderMap(
        Provider<EmployedNodeChildProvider.EmploymentStartedNodeRuleProvider> employmentStartedNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmploymentStartedNode>> result = new HashMap<>();
        result.put("employmentStartedNode", employmentStartedNodeRuleProvider.get());
        return result;
    }
}