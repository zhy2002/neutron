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

    @Provides @RealEstateListNodeScope @Owner RealEstateListNode provideRealEstateListNode() {
        return owner;
    }

    @Provides @RealEstateListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @RealEstateListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @RealEstateListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RealEstateListNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @RealEstateListNodeScope
    Map<String, RuleProvider<RealEstateListNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.RealEstateListNodeRuleProvider> realEstateListNodeRuleProvider
    ) {
        Map<String, RuleProvider<RealEstateListNode>> result = new HashMap<>();
        result.put("realEstateListNode", realEstateListNodeRuleProvider.get());
        return result;
    }
}