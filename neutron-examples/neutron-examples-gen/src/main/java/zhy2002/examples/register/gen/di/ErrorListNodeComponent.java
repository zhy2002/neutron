package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ErrorListNodeScope
@Subcomponent(modules = {ErrorListNodeModule.class})
public interface ErrorListNodeComponent {

    ErrorListNodeRuleProvider getErrorListNodeRuleProvider();
    Map<String, RuleProvider<ErrorListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setErrorListNodeModule(ErrorListNodeModule module);

        ErrorListNodeComponent build();
    }
}
