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

    @Provides @LenderNodeScope @Owner LenderNode provideLenderNode() {
        return owner;
    }

    @Provides @LenderNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @LenderNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LenderNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LenderNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @LenderNodeScope
    Map<String, RuleProvider<LenderNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.LenderNodeRuleProvider> lenderNodeRuleProvider
    ) {
        Map<String, RuleProvider<LenderNode>> result = new HashMap<>();
        result.put("lenderNode", lenderNodeRuleProvider.get());
        return result;
    }
}