package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTelephoneNodeScope
@Subcomponent(modules = {PersonTelephoneNodeModule.class})
public interface PersonTelephoneNodeComponent {

    PersonTelephoneNodeRuleProvider getPersonTelephoneNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTelephoneNodeModule(PersonTelephoneNodeModule module);

        PersonTelephoneNodeComponent build();
    }
}
