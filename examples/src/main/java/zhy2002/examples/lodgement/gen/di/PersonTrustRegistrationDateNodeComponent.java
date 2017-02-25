package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTrustRegistrationDateNodeScope
@Subcomponent(modules = {PersonTrustRegistrationDateNodeModule.class})
public interface PersonTrustRegistrationDateNodeComponent {

    PersonTrustRegistrationDateNodeRuleProvider getPersonTrustRegistrationDateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustRegistrationDateNodeModule(PersonTrustRegistrationDateNodeModule module);

        PersonTrustRegistrationDateNodeComponent build();
    }
}
