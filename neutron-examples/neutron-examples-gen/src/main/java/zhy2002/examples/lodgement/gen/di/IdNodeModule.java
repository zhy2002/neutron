package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class IdNodeModule {

    private final IdNode owner;

    public IdNodeModule(IdNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner IdNode provideIdNode() {
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

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<IdNode> provideRuleProvider(Provider<IdNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<IdNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.IdNodeRuleProvider> idNodeRuleProvider
    ) {
        Map<String, RuleProvider<IdNode>> result = new HashMap<>();
        result.put("idNode", idNodeRuleProvider.get());
        return result;
    }
}