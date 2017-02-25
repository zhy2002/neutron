package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTrustCountryNodeScope
@Subcomponent(modules = {PersonTrustCountryNodeModule.class})
public interface PersonTrustCountryNodeComponent {

    PersonTrustCountryNodeRuleProvider getPersonTrustCountryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustCountryNodeModule(PersonTrustCountryNodeModule module);

        PersonTrustCountryNodeComponent build();
    }
}
