package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyTypeNodeModule {

    private final ThirdPartyTypeNode owner;

    public ThirdPartyTypeNodeModule(ThirdPartyTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyTypeNode provideThirdPartyTypeNode() {
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

    @Provides @ComponentScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ThirdPartyTypeNode> provideRuleProvider(Provider<ThirdPartyTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ThirdPartyTypeNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyTypeNodeRuleProvider> thirdPartyTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyTypeNode>> result = new HashMap<>();
        result.put("thirdPartyTypeNode", thirdPartyTypeNodeRuleProvider.get());
        return result;
    }
}