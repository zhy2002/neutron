package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ErrorListNodeModule.class})
public interface ErrorListNodeComponent {

    ErrorNode createErrorNode();

    RuleProvider<ErrorListNode> getErrorListNodeRuleProvider();
    Map<String, RuleProvider<ErrorListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setErrorListNodeModule(ErrorListNodeModule module);

        ErrorListNodeComponent build();
    }

}
