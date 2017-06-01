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

    @Provides @ComponentScope @Owner DateLodgedNode provideDateLodgedNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
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
    RuleProvider<DateLodgedNode> provideRuleProvider(Provider<DateLodgedNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<DateLodgedNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.DateLodgedNodeRuleProvider> dateLodgedNodeRuleProvider
    ) {
        Map<String, RuleProvider<DateLodgedNode>> result = new HashMap<>();
        result.put("dateLodgedNode", dateLodgedNodeRuleProvider.get());
        return result;
    }
}