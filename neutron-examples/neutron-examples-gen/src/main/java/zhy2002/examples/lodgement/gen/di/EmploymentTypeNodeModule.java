package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EmploymentTypeNodeModule {

    private final EmploymentTypeNode owner;

    public EmploymentTypeNodeModule(EmploymentTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EmploymentTypeNode provideEmploymentTypeNode() {
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

    @Provides @ComponentScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<EmploymentTypeNode> provideRuleProvider(Provider<EmploymentTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<EmploymentTypeNode>> provideInstanceProviderMap(
        Provider<EmploymentNodeChildProvider.EmploymentTypeNodeRuleProvider> employmentTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmploymentTypeNode>> result = new HashMap<>();
        result.put("employmentTypeNode", employmentTypeNodeRuleProvider.get());
        return result;
    }
}