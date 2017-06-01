package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class FinancialPositionNodeModule {

    private final FinancialPositionNode owner;

    public FinancialPositionNodeModule(FinancialPositionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner FinancialPositionNode provideFinancialPositionNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<FinancialPositionNode> provideRuleProvider(Provider<FinancialPositionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<FinancialPositionNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.FinancialPositionNodeRuleProvider> financialPositionNodeRuleProvider
    ) {
        Map<String, RuleProvider<FinancialPositionNode>> result = new HashMap<>();
        result.put("financialPositionNode", financialPositionNodeRuleProvider.get());
        return result;
    }
}