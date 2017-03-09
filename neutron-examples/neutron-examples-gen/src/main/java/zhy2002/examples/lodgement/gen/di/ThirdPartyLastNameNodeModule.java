package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyLastNameNodeModule {

    private final ThirdPartyLastNameNode owner;

    public ThirdPartyLastNameNodeModule(ThirdPartyLastNameNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyLastNameNodeScope @Owner ThirdPartyLastNameNode provideThirdPartyLastNameNode() {
        return owner;
    }

    @Provides @ThirdPartyLastNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyLastNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyLastNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyLastNameNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyLastNameNodeScope
    Map<String, RuleProvider<ThirdPartyLastNameNode>> provideInstanceProviders(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyLastNameNodeRuleProvider> thirdPartyLastNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyLastNameNode>> result = new HashMap<>();
        result.put("thirdPartyLastNameNode", thirdPartyLastNameNodeRuleProvider.get());
        return result;
    }
}