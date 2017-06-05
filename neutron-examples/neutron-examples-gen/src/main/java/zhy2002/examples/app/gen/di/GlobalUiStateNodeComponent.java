package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {GlobalUiStateNodeModule.class})
public interface GlobalUiStateNodeComponent {

    List<RuleProvider<GlobalUiStateNode>> provideRuleProviders();

    MenuNode createMenuNode();
    AppManagerNode createAppManagerNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setGlobalUiStateNodeModule(GlobalUiStateNodeModule module);

        GlobalUiStateNodeComponent build();
    }

}
