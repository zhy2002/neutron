package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SpouseNodeModule {

    private final SpouseNode owner;

    public SpouseNodeModule(SpouseNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SpouseNode provideSpouseNode() {
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
    RuleProvider<SpouseNode> provideRuleProvider(Provider<SpouseNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SpouseNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.SpouseNodeRuleProvider> spouseNodeRuleProvider
    ) {
        Map<String, RuleProvider<SpouseNode>> result = new HashMap<>();
        result.put("spouseNode", spouseNodeRuleProvider.get());
        return result;
    }
}