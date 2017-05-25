package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@EmployerNameNodeScope
@Subcomponent(modules = {EmployerNameNodeModule.class})
public interface EmployerNameNodeComponent {

    RuleProvider<EmployerNameNode> getEmployerNameNodeRuleProvider();
    Map<String, RuleProvider<EmployerNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmployerNameNodeModule(EmployerNameNodeModule module);

        EmployerNameNodeComponent build();
    }
}
