package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AppManagerNodeScope
@Subcomponent(modules = {AppManagerNodeModule.class})
public interface AppManagerNodeComponent {

    RuleProvider<AppManagerNode> getAppManagerNodeRuleProvider();
    Map<String, RuleProvider<AppManagerNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAppManagerNodeModule(AppManagerNodeModule module);

        AppManagerNodeComponent build();
    }
}
