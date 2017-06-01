package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {EmploymentTypeNodeModule.class})
public interface EmploymentTypeNodeComponent {

    List<RuleProvider<EmploymentTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentTypeNodeModule(EmploymentTypeNodeModule module);

        EmploymentTypeNodeComponent build();
    }

}
