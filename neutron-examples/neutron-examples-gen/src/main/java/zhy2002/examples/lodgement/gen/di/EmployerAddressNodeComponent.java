package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {EmployerAddressNodeModule.class})
public interface EmployerAddressNodeComponent {

    RuleProvider<EmployerAddressNode> getEmployerAddressNodeRuleProvider();
    Map<String, RuleProvider<EmployerAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmployerAddressNodeModule(EmployerAddressNodeModule module);

        EmployerAddressNodeComponent build();
    }
}
