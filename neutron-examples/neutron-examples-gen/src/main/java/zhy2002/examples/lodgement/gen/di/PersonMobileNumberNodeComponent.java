package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PersonMobileNumberNodeModule.class})
public interface PersonMobileNumberNodeComponent {

    List<RuleProvider<PersonMobileNumberNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPersonMobileNumberNodeModule(PersonMobileNumberNodeModule module);

        PersonMobileNumberNodeComponent build();
    }

}
