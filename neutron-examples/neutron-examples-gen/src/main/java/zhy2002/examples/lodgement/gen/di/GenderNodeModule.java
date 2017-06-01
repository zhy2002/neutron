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

    @Provides @ComponentScope @Owner GenderNode provideGenderNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<GenderNode> provideRuleProvider(Provider<GenderNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<GenderNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.GenderNodeRuleProvider> genderNodeRuleProvider
    ) {
        Map<String, RuleProvider<GenderNode>> result = new HashMap<>();
        result.put("genderNode", genderNodeRuleProvider.get());
        return result;
    }
}