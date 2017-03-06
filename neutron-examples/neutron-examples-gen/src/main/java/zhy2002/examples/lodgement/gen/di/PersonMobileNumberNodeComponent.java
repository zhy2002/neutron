package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PersonMobileNumberNodeScope
@Subcomponent(modules = {PersonMobileNumberNodeModule.class})
public interface PersonMobileNumberNodeComponent {

    PersonMobileNumberNodeRuleProvider getPersonMobileNumberNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonMobileNumberNodeModule(PersonMobileNumberNodeModule module);

        PersonMobileNumberNodeComponent build();
    }
}
