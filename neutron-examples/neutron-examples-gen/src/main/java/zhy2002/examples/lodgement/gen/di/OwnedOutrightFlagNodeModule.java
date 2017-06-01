package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OwnedOutrightFlagNodeModule {

    private final OwnedOutrightFlagNode owner;

    public OwnedOutrightFlagNodeModule(OwnedOutrightFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OwnedOutrightFlagNode provideOwnedOutrightFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
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

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OwnedOutrightFlagNode> provideRuleProvider(Provider<OwnedOutrightFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OwnedOutrightFlagNode>> provideInstanceProviderMap(
        Provider<UsageNodeChildProvider.OwnedOutrightFlagNodeRuleProvider> ownedOutrightFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<OwnedOutrightFlagNode>> result = new HashMap<>();
        result.put("ownedOutrightFlagNode", ownedOutrightFlagNodeRuleProvider.get());
        return result;
    }
}