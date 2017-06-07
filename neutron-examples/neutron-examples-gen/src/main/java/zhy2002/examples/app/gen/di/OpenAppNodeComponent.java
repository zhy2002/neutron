package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OpenAppNodeModule.class})
public interface OpenAppNodeComponent {

    List<RuleProvider<OpenAppNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOpenAppNodeModule(OpenAppNodeModule module);

        OpenAppNodeComponent build();
    }

}
