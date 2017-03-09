package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@EmployerPhoneNodeScope
@Subcomponent(modules = {EmployerPhoneNodeModule.class})
public interface EmployerPhoneNodeComponent {

    EmployerPhoneNodeRuleProvider getEmployerPhoneNodeRuleProvider();
    Map<String, RuleProvider<EmployerPhoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmployerPhoneNodeModule(EmployerPhoneNodeModule module);

        EmployerPhoneNodeComponent build();
    }
}
