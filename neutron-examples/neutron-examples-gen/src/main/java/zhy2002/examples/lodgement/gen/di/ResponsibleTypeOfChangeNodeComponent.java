package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ResponsibleTypeOfChangeNodeModule.class})
public interface ResponsibleTypeOfChangeNodeComponent {

    List<RuleProvider<ResponsibleTypeOfChangeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleTypeOfChangeNodeModule(ResponsibleTypeOfChangeNodeModule module);

        ResponsibleTypeOfChangeNodeComponent build();
    }

}
