package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyDobNodeModule {

    private final ThirdPartyDobNode owner;

    public ThirdPartyDobNodeModule(ThirdPartyDobNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyDobNodeScope @Owner ThirdPartyDobNode provideThirdPartyDobNode() {
        return owner;
    }

    @Provides @ThirdPartyDobNodeScope @Owner DobNode<?> provideDobNode() {
        return owner;
    }

    @Provides @ThirdPartyDobNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyDobNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyDobNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyDobNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyDobNodeScope
    RuleProvider<ThirdPartyDobNode> provideRuleProvider(Provider<ThirdPartyDobNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ThirdPartyDobNodeScope
    Map<String, RuleProvider<ThirdPartyDobNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyDobNodeRuleProvider> thirdPartyDobNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyDobNode>> result = new HashMap<>();
        result.put("thirdPartyDobNode", thirdPartyDobNodeRuleProvider.get());
        return result;
    }
}