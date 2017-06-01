package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {EmploymentEndedNodeModule.class})
public interface EmploymentEndedNodeComponent extends MonthYearNodeComponent {


    RuleProvider<EmploymentEndedNode> getEmploymentEndedNodeRuleProvider();
    Map<String, RuleProvider<EmploymentEndedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentEndedNodeModule(EmploymentEndedNodeModule module);

        EmploymentEndedNodeComponent build();
    }

}
