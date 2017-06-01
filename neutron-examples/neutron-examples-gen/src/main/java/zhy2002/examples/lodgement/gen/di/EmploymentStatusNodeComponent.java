package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {EmploymentStatusNodeModule.class})
public interface EmploymentStatusNodeComponent {

    List<RuleProvider<EmploymentStatusNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentStatusNodeModule(EmploymentStatusNodeModule module);

        EmploymentStatusNodeComponent build();
    }

}
