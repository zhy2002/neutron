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

    @Provides @EmploymentTypeNodeScope @Owner EmploymentTypeNode provideEmploymentTypeNode() {
        return owner;
    }

    @Provides @EmploymentTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @EmploymentTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EmploymentTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EmploymentTypeNodeScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @EmploymentTypeNodeScope
    Map<String, RuleProvider<EmploymentTypeNode>> provideInstanceProviders(
        Provider<EmploymentNodeChildProvider.EmploymentTypeNodeRuleProvider> employmentTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmploymentTypeNode>> result = new HashMap<>();
        result.put("employmentTypeNode", employmentTypeNodeRuleProvider.get());
        return result;
    }
}