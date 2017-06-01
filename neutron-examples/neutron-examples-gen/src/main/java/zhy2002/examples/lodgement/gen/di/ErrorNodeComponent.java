package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ErrorNodeModule.class})
public interface ErrorNodeComponent {

    List<RuleProvider<ErrorNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setErrorNodeModule(ErrorNodeModule module);

        ErrorNodeComponent build();
    }

}
