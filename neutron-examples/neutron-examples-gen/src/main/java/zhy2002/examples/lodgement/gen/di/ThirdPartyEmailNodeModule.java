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

    @Provides @ThirdPartyEmailNodeScope @Owner ThirdPartyEmailNode provideThirdPartyEmailNode() {
        return owner;
    }

    @Provides @ThirdPartyEmailNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyEmailNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyEmailNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyEmailNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyEmailNodeScope
    RuleProvider<ThirdPartyEmailNode> provideRuleProvider(Provider<ThirdPartyEmailNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ThirdPartyEmailNodeScope
    Map<String, RuleProvider<ThirdPartyEmailNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyEmailNodeRuleProvider> thirdPartyEmailNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyEmailNode>> result = new HashMap<>();
        result.put("thirdPartyEmailNode", thirdPartyEmailNodeRuleProvider.get());
        return result;
    }
}