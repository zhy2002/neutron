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

    @Provides @ComponentScope @Owner ErrorListNode provideErrorListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ErrorListNode> provideRuleProvider(Provider<ErrorListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ErrorListNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.ErrorListNodeRuleProvider> errorListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ErrorListNode>> result = new HashMap<>();
        result.put("errorListNode", errorListNodeRuleProvider.get());
        return result;
    }
}