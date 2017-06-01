package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {EmployerNameNodeModule.class})
public interface EmployerNameNodeComponent {

    List<RuleProvider<EmployerNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setEmployerNameNodeModule(EmployerNameNodeModule module);

        EmployerNameNodeComponent build();
    }

}
