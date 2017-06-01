package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {EmployerPhoneNodeModule.class})
public interface EmployerPhoneNodeComponent {


    RuleProvider<EmployerPhoneNode> getEmployerPhoneNodeRuleProvider();
    Map<String, RuleProvider<EmployerPhoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmployerPhoneNodeModule(EmployerPhoneNodeModule module);

        EmployerPhoneNodeComponent build();
    }

}
