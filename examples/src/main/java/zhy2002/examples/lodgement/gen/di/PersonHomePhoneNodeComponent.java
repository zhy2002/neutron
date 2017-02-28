package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonHomePhoneNodeScope
@Subcomponent(modules = {PersonHomePhoneNodeModule.class})
public interface PersonHomePhoneNodeComponent {

    PersonHomePhoneNodeRuleProvider getPersonHomePhoneNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonHomePhoneNodeModule(PersonHomePhoneNodeModule module);

        PersonHomePhoneNodeComponent build();
    }
}
