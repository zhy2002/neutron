package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyEmailNodeModule {

    private final ThirdPartyEmailNode owner;

    public ThirdPartyEmailNodeModule(ThirdPartyEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyEmailNode provideThirdPartyEmailNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ThirdPartyEmailNode> provideRuleProvider(Provider<ThirdPartyEmailNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ThirdPartyEmailNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyEmailNodeRuleProvider> thirdPartyEmailNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyEmailNode>> result = new HashMap<>();
        result.put("thirdPartyEmailNode", thirdPartyEmailNodeRuleProvider.get());
        return result;
    }
}