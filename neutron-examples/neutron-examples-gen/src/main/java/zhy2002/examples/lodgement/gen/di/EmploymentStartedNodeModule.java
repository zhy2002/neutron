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

    @Provides @EmploymentStartedNodeScope @Owner EmploymentStartedNode provideEmploymentStartedNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @EmploymentStartedNodeScope
    Map<String, RuleProvider<EmploymentStartedNode>> provideInstanceProviders(
        Provider<EmployedNodeChildProvider.EmploymentStartedNodeRuleProvider> employmentStartedNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmploymentStartedNode>> result = new HashMap<>();
        result.put("employmentStartedNode", employmentStartedNodeRuleProvider.get());
        return result;
    }
}