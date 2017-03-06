package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PersonAddressNodeScope
@Subcomponent(modules = {PersonAddressNodeModule.class})
public interface PersonAddressNodeComponent {

    PersonAddressNodeRuleProvider getPersonAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonAddressNodeModule(PersonAddressNodeModule module);

        PersonAddressNodeComponent build();
    }
}
