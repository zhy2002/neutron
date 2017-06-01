package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {FirstNameNodeModule.class})
public interface FirstNameNodeComponent {

    List<RuleProvider<FirstNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setFirstNameNodeModule(FirstNameNodeModule module);

        FirstNameNodeComponent build();
    }

}
