package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ErrorListNodeModule {

    private final ErrorListNode owner;

    public ErrorListNodeModule(ErrorListNode owner) {
        this.owner = owner;
    }

    @Provides @ErrorListNodeScope @Owner ErrorListNode provideErrorListNode() {
        return owner;
    }

    @Provides @ErrorListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ErrorListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ErrorListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ErrorListNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ErrorListNodeScope
    Map<String, RuleProvider<ErrorListNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.ErrorListNodeRuleProvider> errorListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ErrorListNode>> result = new HashMap<>();
        result.put("errorListNode", errorListNodeRuleProvider.get());
        return result;
    }
}