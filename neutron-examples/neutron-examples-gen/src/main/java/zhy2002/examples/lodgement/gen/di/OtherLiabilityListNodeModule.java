package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityListNodeModule {

    private final OtherLiabilityListNode owner;

    public OtherLiabilityListNodeModule(OtherLiabilityListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityListNode provideOtherLiabilityListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope LiabilitiesNode provideLiabilitiesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherLiabilityListNode> provideRuleProvider(Provider<OtherLiabilityListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherLiabilityListNode>> provideInstanceProviderMap(
        Provider<LiabilitiesNodeChildProvider.OtherLiabilityListNodeRuleProvider> otherLiabilityListNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityListNode>> result = new HashMap<>();
        result.put("otherLiabilityListNode", otherLiabilityListNodeRuleProvider.get());
        return result;
    }
}