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

    @Provides @ComponentScope @Owner YearNode provideYearNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope MonthYearNode<?> provideMonthYearNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<YearNode> provideRuleProvider(Provider<YearNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<YearNode>> provideInstanceProviderMap(
        Provider<MonthYearNodeChildProvider.YearNodeRuleProvider> yearNodeRuleProvider
    ) {
        Map<String, RuleProvider<YearNode>> result = new HashMap<>();
        result.put("yearNode", yearNodeRuleProvider.get());
        return result;
    }
}