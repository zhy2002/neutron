package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTrustTypeNodeScope
@Subcomponent(modules = {PersonTrustTypeNodeModule.class})
public interface PersonTrustTypeNodeComponent {

    PersonTrustTypeNodeRuleProvider getPersonTrustTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustTypeNodeModule(PersonTrustTypeNodeModule module);

        PersonTrustTypeNodeComponent build();
    }
}
