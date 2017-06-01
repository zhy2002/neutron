package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LenderNodeModule {

    private final LenderNode owner;

    public LenderNodeModule(LenderNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LenderNode provideLenderNode() {
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
    RuleProvider<LenderNode> provideRuleProvider(Provider<LenderNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LenderNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.LenderNodeRuleProvider> lenderNodeRuleProvider
    ) {
        Map<String, RuleProvider<LenderNode>> result = new HashMap<>();
        result.put("lenderNode", lenderNodeRuleProvider.get());
        return result;
    }
}