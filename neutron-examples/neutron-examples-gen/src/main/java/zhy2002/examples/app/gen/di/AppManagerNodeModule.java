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

    @Provides @AppManagerNodeScope @Owner AppManagerNode provideAppManagerNode() {
        return owner;
    }

    @Provides @AppManagerNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AppManagerNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AppManagerNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AppManagerNodeScope LodgementNode provideLodgementNode() {
        return owner.getParent();
    }

    @Provides @AppManagerNodeScope
    Map<String, RuleProvider<AppManagerNode>> provideInstanceProviders(
        Provider<LodgementNodeChildProvider.AppManagerNodeRuleProvider> appManagerNodeRuleProvider
    ) {
        Map<String, RuleProvider<AppManagerNode>> result = new HashMap<>();
        result.put("appManagerNode", appManagerNodeRuleProvider.get());
        return result;
    }
}