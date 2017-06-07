package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OpenAppsNodeModule.class})
public interface OpenAppsNodeComponent {

    List<RuleProvider<OpenAppsNode>> provideRuleProviders();

    OpenAppNode createOpenAppNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setOpenAppsNodeModule(OpenAppsNodeModule module);

        OpenAppsNodeComponent build();
    }

}
