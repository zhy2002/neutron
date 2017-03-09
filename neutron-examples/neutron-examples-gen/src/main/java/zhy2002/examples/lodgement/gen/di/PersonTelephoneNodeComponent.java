package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonTelephoneNodeScope
@Subcomponent(modules = {PersonTelephoneNodeModule.class})
public interface PersonTelephoneNodeComponent {

    PersonTelephoneNodeRuleProvider getPersonTelephoneNodeRuleProvider();
    Map<String, RuleProvider<PersonTelephoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTelephoneNodeModule(PersonTelephoneNodeModule module);

        PersonTelephoneNodeComponent build();
    }
}
