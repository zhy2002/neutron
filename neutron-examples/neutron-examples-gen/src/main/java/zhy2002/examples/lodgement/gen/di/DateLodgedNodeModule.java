package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class DateLodgedNodeModule {

    private final DateLodgedNode owner;

    public DateLodgedNodeModule(DateLodgedNode owner) {
        this.owner = owner;
    }

    @Provides @DateLodgedNodeScope @Owner DateLodgedNode provideDateLodgedNode() {
        return owner;
    }

    @Provides @DateLodgedNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @DateLodgedNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @DateLodgedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @DateLodgedNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @DateLodgedNodeScope
    Map<String, RuleProvider<DateLodgedNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.DateLodgedNodeRuleProvider> dateLodgedNodeRuleProvider
    ) {
        Map<String, RuleProvider<DateLodgedNode>> result = new HashMap<>();
        result.put("dateLodgedNode", dateLodgedNodeRuleProvider.get());
        return result;
    }
}