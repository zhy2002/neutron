package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ApplicationListNodeModule.class})
public interface ApplicationListNodeComponent {

    RuleProvider<ApplicationListNode> getApplicationListNodeRuleProvider();
    Map<String, RuleProvider<ApplicationListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicationListNodeModule(ApplicationListNodeModule module);

        ApplicationListNodeComponent build();
    }
}
