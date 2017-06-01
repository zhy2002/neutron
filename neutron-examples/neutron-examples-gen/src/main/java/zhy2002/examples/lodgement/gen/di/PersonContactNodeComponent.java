package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PersonContactNodeModule.class})
public interface PersonContactNodeComponent {

    List<RuleProvider<PersonContactNode>> provideRuleProviders();

    PersonTelephoneNode createPersonTelephoneNode();
    PersonMobileNumberNode createPersonMobileNumberNode();
    PersonEmailNode createPersonEmailNode();
    PersonAddressNode createPersonAddressNode();
    MovedToCurrentAddressNode createMovedToCurrentAddressNode();
    MovedToPreviousAddressNode createMovedToPreviousAddressNode();
    MovedFromPreviousAddressNode createMovedFromPreviousAddressNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonContactNodeModule(PersonContactNodeModule module);

        PersonContactNodeComponent build();
    }

}
