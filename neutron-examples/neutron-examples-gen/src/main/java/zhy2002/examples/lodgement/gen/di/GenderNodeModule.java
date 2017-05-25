package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class GenderNodeModule {

    private final GenderNode owner;

    public GenderNodeModule(GenderNode owner) {
        this.owner = owner;
    }

    @Provides @GenderNodeScope @Owner GenderNode provideGenderNode() {
        return owner;
    }

    @Provides @GenderNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @GenderNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @GenderNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @GenderNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @GenderNodeScope
    RuleProvider<GenderNode> provideRuleProvider(Provider<GenderNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @GenderNodeScope
    Map<String, RuleProvider<GenderNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.GenderNodeRuleProvider> genderNodeRuleProvider
    ) {
        Map<String, RuleProvider<GenderNode>> result = new HashMap<>();
        result.put("genderNode", genderNodeRuleProvider.get());
        return result;
    }
}