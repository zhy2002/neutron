package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ErrorListNodeModule.class})
public interface ErrorListNodeComponent {

    List<RuleProvider<ErrorListNode>> provideRuleProviders();

    ErrorNode createErrorNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setErrorListNodeModule(ErrorListNodeModule module);

        ErrorListNodeComponent build();
    }

}
