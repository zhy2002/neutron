package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LastNameNodeModule.class})
public interface LastNameNodeComponent {

    List<RuleProvider<LastNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLastNameNodeModule(LastNameNodeModule module);

        LastNameNodeComponent build();
    }

}
