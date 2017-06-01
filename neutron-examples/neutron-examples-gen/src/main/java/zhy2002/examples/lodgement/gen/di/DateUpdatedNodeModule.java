package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class DateUpdatedNodeModule {

    private final DateUpdatedNode owner;

    public DateUpdatedNodeModule(DateUpdatedNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner DateUpdatedNode provideDateUpdatedNode() {
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

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<DateUpdatedNode> provideRuleProvider(Provider<DateUpdatedNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<DateUpdatedNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.DateUpdatedNodeRuleProvider> dateUpdatedNodeRuleProvider
    ) {
        Map<String, RuleProvider<DateUpdatedNode>> result = new HashMap<>();
        result.put("dateUpdatedNode", dateUpdatedNodeRuleProvider.get());
        return result;
    }
}