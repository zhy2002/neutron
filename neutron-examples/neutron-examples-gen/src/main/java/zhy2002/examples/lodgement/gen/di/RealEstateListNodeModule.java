package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class RealEstateListNodeModule {

    private final RealEstateListNode owner;

    public RealEstateListNodeModule(RealEstateListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RealEstateListNode provideRealEstateListNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<RealEstateListNode> provideRuleProvider(Provider<RealEstateListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<RealEstateListNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.RealEstateListNodeRuleProvider> realEstateListNodeRuleProvider
    ) {
        Map<String, RuleProvider<RealEstateListNode>> result = new HashMap<>();
        result.put("realEstateListNode", realEstateListNodeRuleProvider.get());
        return result;
    }
}