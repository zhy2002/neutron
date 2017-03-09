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

    @Provides @LiabilitiesNodeScope @Owner LiabilitiesNode provideLiabilitiesNode() {
        return owner;
    }

    @Provides @LiabilitiesNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @LiabilitiesNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @LiabilitiesNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LiabilitiesNodeScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @LiabilitiesNodeScope
    Map<String, RuleProvider<LiabilitiesNode>> provideInstanceProviders(
        Provider<FinancialPositionNodeChildProvider.LiabilitiesNodeRuleProvider> liabilitiesNodeRuleProvider
    ) {
        Map<String, RuleProvider<LiabilitiesNode>> result = new HashMap<>();
        result.put("liabilitiesNode", liabilitiesNodeRuleProvider.get());
        return result;
    }
}