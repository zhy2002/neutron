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

    @Provides @IdNodeScope @Owner IdNode provideIdNode() {
        return owner;
    }

    @Provides @IdNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @IdNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @IdNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @IdNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @IdNodeScope
    Map<String, RuleProvider<IdNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.IdNodeRuleProvider> idNodeRuleProvider
    ) {
        Map<String, RuleProvider<IdNode>> result = new HashMap<>();
        result.put("idNode", idNodeRuleProvider.get());
        return result;
    }
}