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

    @Provides @ThirdPartyTypeNodeScope @Owner ThirdPartyTypeNode provideThirdPartyTypeNode() {
        return owner;
    }

    @Provides @ThirdPartyTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyTypeNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyTypeNodeScope
    Map<String, RuleProvider<ThirdPartyTypeNode>> provideInstanceProviders(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyTypeNodeRuleProvider> thirdPartyTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyTypeNode>> result = new HashMap<>();
        result.put("thirdPartyTypeNode", thirdPartyTypeNodeRuleProvider.get());
        return result;
    }
}