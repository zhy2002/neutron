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

    @Provides @ComponentScope @Owner ApplicationListNode provideApplicationListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope AppManagerNode provideAppManagerNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ApplicationListNode> provideRuleProvider(Provider<ApplicationListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ApplicationListNode>> provideInstanceProviderMap(
        Provider<AppManagerNodeChildProvider.ApplicationListNodeRuleProvider> applicationListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ApplicationListNode>> result = new HashMap<>();
        result.put("applicationListNode", applicationListNodeRuleProvider.get());
        return result;
    }
}