package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class StatusNodeModule {

    private final StatusNode owner;

    public StatusNodeModule(StatusNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner StatusNode provideStatusNode() {
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

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<StatusNode> provideRuleProvider(Provider<StatusNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<StatusNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.StatusNodeRuleProvider> statusNodeRuleProvider
    ) {
        Map<String, RuleProvider<StatusNode>> result = new HashMap<>();
        result.put("statusNode", statusNodeRuleProvider.get());
        return result;
    }
}