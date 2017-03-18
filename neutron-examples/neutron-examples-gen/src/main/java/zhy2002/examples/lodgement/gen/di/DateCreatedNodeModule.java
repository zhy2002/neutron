package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class DateCreatedNodeModule {

    private final DateCreatedNode owner;

    public DateCreatedNodeModule(DateCreatedNode owner) {
        this.owner = owner;
    }

    @Provides @DateCreatedNodeScope @Owner DateCreatedNode provideDateCreatedNode() {
        return owner;
    }

    @Provides @DateCreatedNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @DateCreatedNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @DateCreatedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @DateCreatedNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @DateCreatedNodeScope
    Map<String, RuleProvider<DateCreatedNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.DateCreatedNodeRuleProvider> dateCreatedNodeRuleProvider
    ) {
        Map<String, RuleProvider<DateCreatedNode>> result = new HashMap<>();
        result.put("dateCreatedNode", dateCreatedNodeRuleProvider.get());
        return result;
    }
}