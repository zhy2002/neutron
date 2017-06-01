package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class RetiredSinceNodeModule {

    private final RetiredSinceNode owner;

    public RetiredSinceNodeModule(RetiredSinceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RetiredSinceNode provideRetiredSinceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
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

    @Provides @ComponentScope RetiredEmploymentNode provideRetiredEmploymentNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<RetiredSinceNode> provideRuleProvider(Provider<RetiredSinceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<RetiredSinceNode>> provideInstanceProviderMap(
        Provider<RetiredEmploymentNodeChildProvider.RetiredSinceNodeRuleProvider> retiredSinceNodeRuleProvider
    ) {
        Map<String, RuleProvider<RetiredSinceNode>> result = new HashMap<>();
        result.put("retiredSinceNode", retiredSinceNodeRuleProvider.get());
        return result;
    }
}