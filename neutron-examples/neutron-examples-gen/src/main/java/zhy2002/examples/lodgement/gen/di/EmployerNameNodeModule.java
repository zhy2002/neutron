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

    @Provides @ComponentScope @Owner EmployerNameNode provideEmployerNameNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<EmployerNameNode> provideRuleProvider(Provider<EmployerNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<EmployerNameNode>> provideInstanceProviderMap(
        Provider<EmployedNodeChildProvider.EmployerNameNodeRuleProvider> employerNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmployerNameNode>> result = new HashMap<>();
        result.put("employerNameNode", employerNameNodeRuleProvider.get());
        return result;
    }
}