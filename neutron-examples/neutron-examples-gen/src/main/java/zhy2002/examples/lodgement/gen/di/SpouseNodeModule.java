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

    @Provides @SpouseNodeScope @Owner SpouseNode provideSpouseNode() {
        return owner;
    }

    @Provides @SpouseNodeScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @SpouseNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SpouseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SpouseNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @SpouseNodeScope
    RuleProvider<SpouseNode> provideRuleProvider(Provider<SpouseNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SpouseNodeScope
    Map<String, RuleProvider<SpouseNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.SpouseNodeRuleProvider> spouseNodeRuleProvider
    ) {
        Map<String, RuleProvider<SpouseNode>> result = new HashMap<>();
        result.put("spouseNode", spouseNodeRuleProvider.get());
        return result;
    }
}