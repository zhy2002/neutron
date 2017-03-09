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

    @Provides @MonthNodeScope @Owner MonthNode provideMonthNode() {
        return owner;
    }

    @Provides @MonthNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MonthNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MonthNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MonthNodeScope MonthYearNode<?> provideMonthYearNode() {
        return owner.getParent();
    }

    @Provides @MonthNodeScope
    Map<String, RuleProvider<MonthNode>> provideInstanceProviders(
        Provider<MonthYearNodeChildProvider.MonthNodeRuleProvider> monthNodeRuleProvider
    ) {
        Map<String, RuleProvider<MonthNode>> result = new HashMap<>();
        result.put("monthNode", monthNodeRuleProvider.get());
        return result;
    }
}