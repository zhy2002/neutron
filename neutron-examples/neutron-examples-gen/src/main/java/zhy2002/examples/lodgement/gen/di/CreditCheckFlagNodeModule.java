package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditCheckFlagNodeModule {

    private final CreditCheckFlagNode owner;

    public CreditCheckFlagNodeModule(CreditCheckFlagNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCheckFlagNodeScope @Owner CreditCheckFlagNode provideCreditCheckFlagNode() {
        return owner;
    }

    @Provides @CreditCheckFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @CreditCheckFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCheckFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCheckFlagNodeScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @CreditCheckFlagNodeScope
    Map<String, RuleProvider<CreditCheckFlagNode>> provideInstanceProviders(
        Provider<BasePrivacyNodeChildProvider.CreditCheckFlagNodeRuleProvider> creditCheckFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCheckFlagNode>> result = new HashMap<>();
        result.put("creditCheckFlagNode", creditCheckFlagNodeRuleProvider.get());
        return result;
    }
}