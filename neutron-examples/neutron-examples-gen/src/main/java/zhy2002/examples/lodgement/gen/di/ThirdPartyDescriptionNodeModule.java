package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyDescriptionNodeModule {

    private final ThirdPartyDescriptionNode owner;

    public ThirdPartyDescriptionNodeModule(ThirdPartyDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyDescriptionNode provideThirdPartyDescriptionNode() {
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
    RuleProvider<ThirdPartyDescriptionNode> provideRuleProvider(Provider<ThirdPartyDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ThirdPartyDescriptionNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyDescriptionNodeRuleProvider> thirdPartyDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyDescriptionNode>> result = new HashMap<>();
        result.put("thirdPartyDescriptionNode", thirdPartyDescriptionNodeRuleProvider.get());
        return result;
    }
}