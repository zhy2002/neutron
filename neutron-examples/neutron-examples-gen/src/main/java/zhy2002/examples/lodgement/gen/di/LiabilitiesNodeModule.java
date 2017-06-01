package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LiabilitiesNodeModule {

    private final LiabilitiesNode owner;

    public LiabilitiesNodeModule(LiabilitiesNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LiabilitiesNode provideLiabilitiesNode() {
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

    @Provides @ComponentScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LiabilitiesNode> provideRuleProvider(Provider<LiabilitiesNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LiabilitiesNode>> provideInstanceProviderMap(
        Provider<FinancialPositionNodeChildProvider.LiabilitiesNodeRuleProvider> liabilitiesNodeRuleProvider
    ) {
        Map<String, RuleProvider<LiabilitiesNode>> result = new HashMap<>();
        result.put("liabilitiesNode", liabilitiesNodeRuleProvider.get());
        return result;
    }
}