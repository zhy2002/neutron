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

    @Provides @ComponentScope @Owner EmploymentStatusNode provideEmploymentStatusNode() {
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

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<EmploymentStatusNode> provideRuleProvider(Provider<EmploymentStatusNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<EmploymentStatusNode>> provideInstanceProviderMap(
        Provider<EmployedNodeChildProvider.EmploymentStatusNodeRuleProvider> employmentStatusNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmploymentStatusNode>> result = new HashMap<>();
        result.put("employmentStatusNode", employmentStatusNodeRuleProvider.get());
        return result;
    }
}