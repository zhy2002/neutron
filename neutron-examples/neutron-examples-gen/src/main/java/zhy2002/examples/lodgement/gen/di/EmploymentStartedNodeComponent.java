package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@EmploymentStartedNodeScope
@Subcomponent(modules = {EmploymentStartedNodeModule.class})
public interface EmploymentStartedNodeComponent {

    RuleProvider<EmploymentStartedNode> getEmploymentStartedNodeRuleProvider();
    Map<String, RuleProvider<EmploymentStartedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentStartedNodeModule(EmploymentStartedNodeModule module);

        EmploymentStartedNodeComponent build();
    }
}
