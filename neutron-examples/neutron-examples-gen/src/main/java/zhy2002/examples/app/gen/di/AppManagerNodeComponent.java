package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.app.gen.*;
import zhy2002.examples.app.gen.node.*;

@AppManagerNodeScope
@Subcomponent(modules = {AppManagerNodeModule.class})
public interface AppManagerNodeComponent {

    AppManagerNodeRuleProvider getAppManagerNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAppManagerNodeModule(AppManagerNodeModule module);

        AppManagerNodeComponent build();
    }
}
