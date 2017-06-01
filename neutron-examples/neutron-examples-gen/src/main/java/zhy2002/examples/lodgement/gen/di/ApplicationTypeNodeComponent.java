package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ApplicationTypeNodeModule.class})
public interface ApplicationTypeNodeComponent {

    List<RuleProvider<ApplicationTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setApplicationTypeNodeModule(ApplicationTypeNodeModule module);

        ApplicationTypeNodeComponent build();
    }

}
