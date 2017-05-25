package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyTitleNodeModule {

    private final ThirdPartyTitleNode owner;

    public ThirdPartyTitleNodeModule(ThirdPartyTitleNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyTitleNodeScope @Owner ThirdPartyTitleNode provideThirdPartyTitleNode() {
        return owner;
    }

    @Provides @ThirdPartyTitleNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyTitleNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyTitleNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyTitleNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyTitleNodeScope
    RuleProvider<ThirdPartyTitleNode> provideRuleProvider(Provider<ThirdPartyTitleNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ThirdPartyTitleNodeScope
    Map<String, RuleProvider<ThirdPartyTitleNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyTitleNodeRuleProvider> thirdPartyTitleNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyTitleNode>> result = new HashMap<>();
        result.put("thirdPartyTitleNode", thirdPartyTitleNodeRuleProvider.get());
        return result;
    }
}