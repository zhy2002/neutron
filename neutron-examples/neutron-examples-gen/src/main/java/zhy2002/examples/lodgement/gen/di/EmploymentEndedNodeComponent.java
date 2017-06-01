package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {EmploymentEndedNodeModule.class})
public interface EmploymentEndedNodeComponent extends MonthYearNodeComponent {

    List<RuleProvider<EmploymentEndedNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentEndedNodeModule(EmploymentEndedNodeModule module);

        EmploymentEndedNodeComponent build();
    }

}
