package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EmploymentStatusNodeModule {

    private final EmploymentStatusNode owner;

    public EmploymentStatusNodeModule(EmploymentStatusNode owner) {
        this.owner = owner;
    }

    @Provides @EmploymentStatusNodeScope @Owner EmploymentStatusNode provideEmploymentStatusNode() {
        return owner;
    }

    @Provides @EmploymentStatusNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @EmploymentStatusNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EmploymentStatusNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EmploymentStatusNodeScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @EmploymentStatusNodeScope
    Map<String, RuleProvider<EmploymentStatusNode>> provideInstanceProviders(
        Provider<EmployedNodeChildProvider.EmploymentStatusNodeRuleProvider> employmentStatusNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmploymentStatusNode>> result = new HashMap<>();
        result.put("employmentStatusNode", employmentStatusNodeRuleProvider.get());
        return result;
    }
}