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

    @Provides @DateUpdatedNodeScope @Owner DateUpdatedNode provideDateUpdatedNode() {
        return owner;
    }

    @Provides @DateUpdatedNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @DateUpdatedNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @DateUpdatedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @DateUpdatedNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @DateUpdatedNodeScope
    Map<String, RuleProvider<DateUpdatedNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.DateUpdatedNodeRuleProvider> dateUpdatedNodeRuleProvider
    ) {
        Map<String, RuleProvider<DateUpdatedNode>> result = new HashMap<>();
        result.put("dateUpdatedNode", dateUpdatedNodeRuleProvider.get());
        return result;
    }
}