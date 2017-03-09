package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EmployerNameNodeModule {

    private final EmployerNameNode owner;

    public EmployerNameNodeModule(EmployerNameNode owner) {
        this.owner = owner;
    }

    @Provides @EmployerNameNodeScope @Owner EmployerNameNode provideEmployerNameNode() {
        return owner;
    }

    @Provides @EmployerNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @EmployerNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EmployerNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EmployerNameNodeScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @EmployerNameNodeScope
    Map<String, RuleProvider<EmployerNameNode>> provideInstanceProviders(
        Provider<EmployedNodeChildProvider.EmployerNameNodeRuleProvider> employerNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmployerNameNode>> result = new HashMap<>();
        result.put("employerNameNode", employerNameNodeRuleProvider.get());
        return result;
    }
}