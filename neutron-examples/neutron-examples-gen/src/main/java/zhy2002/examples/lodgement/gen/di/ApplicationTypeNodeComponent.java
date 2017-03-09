package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ApplicationTypeNodeScope
@Subcomponent(modules = {ApplicationTypeNodeModule.class})
public interface ApplicationTypeNodeComponent {

    ApplicationTypeNodeRuleProvider getApplicationTypeNodeRuleProvider();
    Map<String, RuleProvider<ApplicationTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicationTypeNodeModule(ApplicationTypeNodeModule module);

        ApplicationTypeNodeComponent build();
    }
}
