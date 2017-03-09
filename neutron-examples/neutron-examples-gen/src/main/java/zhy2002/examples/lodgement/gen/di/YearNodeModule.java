package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class YearNodeModule {

    private final YearNode owner;

    public YearNodeModule(YearNode owner) {
        this.owner = owner;
    }

    @Provides @YearNodeScope @Owner YearNode provideYearNode() {
        return owner;
    }

    @Provides @YearNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @YearNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @YearNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @YearNodeScope MonthYearNode<?> provideMonthYearNode() {
        return owner.getParent();
    }

    @Provides @YearNodeScope
    Map<String, RuleProvider<YearNode>> provideInstanceProviders(
        Provider<MonthYearNodeChildProvider.YearNodeRuleProvider> yearNodeRuleProvider
    ) {
        Map<String, RuleProvider<YearNode>> result = new HashMap<>();
        result.put("yearNode", yearNodeRuleProvider.get());
        return result;
    }
}