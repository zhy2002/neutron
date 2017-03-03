package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTrustNodeScope
@Subcomponent(modules = {PersonTrustNodeModule.class})
public interface PersonTrustNodeComponent {

    PersonTrustNodeRuleProvider getPersonTrustNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustNodeModule(PersonTrustNodeModule module);

        PersonTrustNodeComponent build();
    }
}
