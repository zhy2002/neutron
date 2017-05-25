package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ResponsibleTypeOfChangeNodeScope
@Subcomponent(modules = {ResponsibleTypeOfChangeNodeModule.class})
public interface ResponsibleTypeOfChangeNodeComponent {

    RuleProvider<ResponsibleTypeOfChangeNode> getResponsibleTypeOfChangeNodeRuleProvider();
    Map<String, RuleProvider<ResponsibleTypeOfChangeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleTypeOfChangeNodeModule(ResponsibleTypeOfChangeNodeModule module);

        ResponsibleTypeOfChangeNodeComponent build();
    }
}
