package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ResponsibleMitigationMethodNodeModule.class})
public interface ResponsibleMitigationMethodNodeComponent {

    RuleProvider<ResponsibleMitigationMethodNode> getResponsibleMitigationMethodNodeRuleProvider();
    Map<String, RuleProvider<ResponsibleMitigationMethodNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleMitigationMethodNodeModule(ResponsibleMitigationMethodNodeModule module);

        ResponsibleMitigationMethodNodeComponent build();
    }
}
