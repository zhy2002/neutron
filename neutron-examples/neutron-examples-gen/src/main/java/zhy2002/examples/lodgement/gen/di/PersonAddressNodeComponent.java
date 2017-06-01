package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PersonAddressNodeModule.class})
public interface PersonAddressNodeComponent extends AddressNodeComponent {

    List<RuleProvider<PersonAddressNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPersonAddressNodeModule(PersonAddressNodeModule module);

        PersonAddressNodeComponent build();
    }

}
