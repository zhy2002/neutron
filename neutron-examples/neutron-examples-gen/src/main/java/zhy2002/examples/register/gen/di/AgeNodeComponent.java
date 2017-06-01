package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {AgeNodeModule.class})
public interface AgeNodeComponent {

    List<RuleProvider<AgeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setAgeNodeModule(AgeNodeModule module);

        AgeNodeComponent build();
    }

}
