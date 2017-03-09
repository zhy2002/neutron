package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonAddressNodeScope
@Subcomponent(modules = {PersonAddressNodeModule.class})
public interface PersonAddressNodeComponent {

    PersonAddressNodeRuleProvider getPersonAddressNodeRuleProvider();
    Map<String, RuleProvider<PersonAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonAddressNodeModule(PersonAddressNodeModule module);

        PersonAddressNodeComponent build();
    }
}
