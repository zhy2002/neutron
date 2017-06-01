package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PersonEmailNodeModule.class})
public interface PersonEmailNodeComponent {

    List<RuleProvider<PersonEmailNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPersonEmailNodeModule(PersonEmailNodeModule module);

        PersonEmailNodeComponent build();
    }

}
