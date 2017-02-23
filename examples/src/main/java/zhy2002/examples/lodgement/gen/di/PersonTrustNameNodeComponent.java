package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTrustNameNodeScope
@Subcomponent(modules = {PersonTrustNameNodeModule.class})
public interface PersonTrustNameNodeComponent {

    PersonTrustNameNodeRuleProvider getPersonTrustNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustNameNodeModule(PersonTrustNameNodeModule module);

        PersonTrustNameNodeComponent build();
    }
}
