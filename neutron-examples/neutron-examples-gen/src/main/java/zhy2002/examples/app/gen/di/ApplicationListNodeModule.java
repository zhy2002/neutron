package zhy2002.examples.app.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ApplicationListNodeModule {

    private final ApplicationListNode owner;

    public ApplicationListNodeModule(ApplicationListNode owner) {
        this.owner = owner;
    }

    @Provides @ApplicationListNodeScope @Owner ApplicationListNode provideApplicationListNode() {
        return owner;
    }

    @Provides @ApplicationListNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ApplicationListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ApplicationListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ApplicationListNodeScope AppManagerNode provideAppManagerNode() {
        return owner.getParent();
    }

    @Provides @ApplicationListNodeScope
    RuleProvider<ApplicationListNode> provideRuleProvider(Provider<ApplicationListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ApplicationListNodeScope
    Map<String, RuleProvider<ApplicationListNode>> provideInstanceProviderMap(
        Provider<AppManagerNodeChildProvider.ApplicationListNodeRuleProvider> applicationListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ApplicationListNode>> result = new HashMap<>();
        result.put("applicationListNode", applicationListNodeRuleProvider.get());
        return result;
    }
}