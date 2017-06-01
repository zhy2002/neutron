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

    @Provides @ComponentScope @Owner NextOfKinNode provideNextOfKinNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<NextOfKinNode> provideRuleProvider(Provider<NextOfKinNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<NextOfKinNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.NextOfKinNodeRuleProvider> nextOfKinNodeRuleProvider
    ) {
        Map<String, RuleProvider<NextOfKinNode>> result = new HashMap<>();
        result.put("nextOfKinNode", nextOfKinNodeRuleProvider.get());
        return result;
    }
}