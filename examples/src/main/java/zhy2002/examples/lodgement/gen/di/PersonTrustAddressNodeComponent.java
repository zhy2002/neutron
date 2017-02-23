package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTrustAddressNodeScope
@Subcomponent(modules = {PersonTrustAddressNodeModule.class})
public interface PersonTrustAddressNodeComponent {

    PersonTrustAddressNodeRuleProvider getPersonTrustAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustAddressNodeModule(PersonTrustAddressNodeModule module);

        PersonTrustAddressNodeComponent build();
    }
}
