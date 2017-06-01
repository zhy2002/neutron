package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MonthNodeModule {

    private final MonthNode owner;

    public MonthNodeModule(MonthNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MonthNode provideMonthNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope MonthYearNode<?> provideMonthYearNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MonthNode> provideRuleProvider(Provider<MonthNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MonthNode>> provideInstanceProviderMap(
        Provider<MonthYearNodeChildProvider.MonthNodeRuleProvider> monthNodeRuleProvider
    ) {
        Map<String, RuleProvider<MonthNode>> result = new HashMap<>();
        result.put("monthNode", monthNodeRuleProvider.get());
        return result;
    }
}