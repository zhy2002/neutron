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

    @Provides @ComponentScope @Owner ThirdPartyFirstNameNode provideThirdPartyFirstNameNode() {
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
    RuleProvider<ThirdPartyFirstNameNode> provideRuleProvider(Provider<ThirdPartyFirstNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ThirdPartyFirstNameNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyFirstNameNodeRuleProvider> thirdPartyFirstNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyFirstNameNode>> result = new HashMap<>();
        result.put("thirdPartyFirstNameNode", thirdPartyFirstNameNodeRuleProvider.get());
        return result;
    }
}