package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {EmploymentStartedNodeModule.class})
public interface EmploymentStartedNodeComponent extends MonthYearNodeComponent {


    RuleProvider<EmploymentStartedNode> getEmploymentStartedNodeRuleProvider();
    Map<String, RuleProvider<EmploymentStartedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentStartedNodeModule(EmploymentStartedNodeModule module);

        EmploymentStartedNodeComponent build();
    }

}
