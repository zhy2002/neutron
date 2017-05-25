package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CurrentEmploymentListNodeModule {

    private final CurrentEmploymentListNode owner;

    public CurrentEmploymentListNodeModule(CurrentEmploymentListNode owner) {
        this.owner = owner;
    }

    @Provides @CurrentEmploymentListNodeScope @Owner CurrentEmploymentListNode provideCurrentEmploymentListNode() {
        return owner;
    }

    @Provides @CurrentEmploymentListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CurrentEmploymentListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CurrentEmploymentListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CurrentEmploymentListNodeScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @CurrentEmploymentListNodeScope
    RuleProvider<CurrentEmploymentListNode> provideRuleProvider(Provider<CurrentEmploymentListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CurrentEmploymentListNodeScope
    Map<String, RuleProvider<CurrentEmploymentListNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.CurrentEmploymentListNodeRuleProvider> currentEmploymentListNodeRuleProvider
    ) {
        Map<String, RuleProvider<CurrentEmploymentListNode>> result = new HashMap<>();
        result.put("currentEmploymentListNode", currentEmploymentListNodeRuleProvider.get());
        return result;
    }
}