package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@EmploymentStatusNodeScope
@Subcomponent(modules = {EmploymentStatusNodeModule.class})
public interface EmploymentStatusNodeComponent {

    EmploymentStatusNodeRuleProvider getEmploymentStatusNodeRuleProvider();
    Map<String, RuleProvider<EmploymentStatusNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentStatusNodeModule(EmploymentStatusNodeModule module);

        EmploymentStatusNodeComponent build();
    }
}
