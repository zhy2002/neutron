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

    @Provides @FinancialPositionNodeScope @Owner FinancialPositionNode provideFinancialPositionNode() {
        return owner;
    }

    @Provides @FinancialPositionNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @FinancialPositionNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @FinancialPositionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @FinancialPositionNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @FinancialPositionNodeScope
    RuleProvider<FinancialPositionNode> provideRuleProvider(Provider<FinancialPositionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @FinancialPositionNodeScope
    Map<String, RuleProvider<FinancialPositionNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.FinancialPositionNodeRuleProvider> financialPositionNodeRuleProvider
    ) {
        Map<String, RuleProvider<FinancialPositionNode>> result = new HashMap<>();
        result.put("financialPositionNode", financialPositionNodeRuleProvider.get());
        return result;
    }
}