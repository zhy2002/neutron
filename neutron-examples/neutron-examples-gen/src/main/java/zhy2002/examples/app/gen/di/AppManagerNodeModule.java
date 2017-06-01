package zhy2002.examples.app.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AppManagerNodeModule {

    private final AppManagerNode owner;

    public AppManagerNodeModule(AppManagerNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AppManagerNode provideAppManagerNode() {
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

    @Provides @ComponentScope LodgementNode provideLodgementNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AppManagerNode> provideRuleProvider(Provider<AppManagerNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AppManagerNode>> provideInstanceProviderMap(
        Provider<LodgementNodeChildProvider.AppManagerNodeRuleProvider> appManagerNodeRuleProvider
    ) {
        Map<String, RuleProvider<AppManagerNode>> result = new HashMap<>();
        result.put("appManagerNode", appManagerNodeRuleProvider.get());
        return result;
    }
}