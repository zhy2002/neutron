package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.app.gen.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ApplicationListNodeScope
@Subcomponent(modules = {ApplicationListNodeModule.class})
public interface ApplicationListNodeComponent {

    ApplicationListNodeRuleProvider getApplicationListNodeRuleProvider();
    Map<String, RuleProvider<ApplicationListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicationListNodeModule(ApplicationListNodeModule module);

        ApplicationListNodeComponent build();
    }
}
