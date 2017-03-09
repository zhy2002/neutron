package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyFirstNameNodeModule {

    private final ThirdPartyFirstNameNode owner;

    public ThirdPartyFirstNameNodeModule(ThirdPartyFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyFirstNameNodeScope @Owner ThirdPartyFirstNameNode provideThirdPartyFirstNameNode() {
        return owner;
    }

    @Provides @ThirdPartyFirstNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyFirstNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyFirstNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyFirstNameNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyFirstNameNodeScope
    Map<String, RuleProvider<ThirdPartyFirstNameNode>> provideInstanceProviders(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyFirstNameNodeRuleProvider> thirdPartyFirstNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyFirstNameNode>> result = new HashMap<>();
        result.put("thirdPartyFirstNameNode", thirdPartyFirstNameNodeRuleProvider.get());
        return result;
    }
}