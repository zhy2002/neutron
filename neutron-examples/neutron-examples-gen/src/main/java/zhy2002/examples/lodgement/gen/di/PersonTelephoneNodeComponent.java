package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PersonTelephoneNodeModule.class})
public interface PersonTelephoneNodeComponent {

    RuleProvider<PersonTelephoneNode> getPersonTelephoneNodeRuleProvider();
    Map<String, RuleProvider<PersonTelephoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTelephoneNodeModule(PersonTelephoneNodeModule module);

        PersonTelephoneNodeComponent build();
    }
}
