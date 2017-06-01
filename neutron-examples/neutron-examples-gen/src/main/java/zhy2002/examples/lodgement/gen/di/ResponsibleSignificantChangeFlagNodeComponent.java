package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ResponsibleSignificantChangeFlagNodeModule.class})
public interface ResponsibleSignificantChangeFlagNodeComponent {


    RuleProvider<ResponsibleSignificantChangeFlagNode> getResponsibleSignificantChangeFlagNodeRuleProvider();
    Map<String, RuleProvider<ResponsibleSignificantChangeFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleSignificantChangeFlagNodeModule(ResponsibleSignificantChangeFlagNodeModule module);

        ResponsibleSignificantChangeFlagNodeComponent build();
    }

}
