package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class NextOfKinNodeModule {

    private final NextOfKinNode owner;

    public NextOfKinNodeModule(NextOfKinNode owner) {
        this.owner = owner;
    }

    @Provides @NextOfKinNodeScope @Owner NextOfKinNode provideNextOfKinNode() {
        return owner;
    }

    @Provides @NextOfKinNodeScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @NextOfKinNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @NextOfKinNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @NextOfKinNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @NextOfKinNodeScope
    RuleProvider<NextOfKinNode> provideRuleProvider(Provider<NextOfKinNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @NextOfKinNodeScope
    Map<String, RuleProvider<NextOfKinNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.NextOfKinNodeRuleProvider> nextOfKinNodeRuleProvider
    ) {
        Map<String, RuleProvider<NextOfKinNode>> result = new HashMap<>();
        result.put("nextOfKinNode", nextOfKinNodeRuleProvider.get());
        return result;
    }
}