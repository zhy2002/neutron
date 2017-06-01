package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PersonContactNodeModule.class})
public interface PersonContactNodeComponent {

    PersonTelephoneNode createHomePhoneNode();
    PersonTelephoneNode createWorkPhoneNode();
    PersonTelephoneNode createFaxNumberNode();
    PersonMobileNumberNode createPersonMobileNumberNode();
    PersonEmailNode createPersonEmailNode();
    PersonAddressNode createCurrentAddressNode();
    MovedToCurrentAddressNode createMovedToCurrentAddressNode();
    PersonAddressNode createPostalAddressNode();
    PersonAddressNode createPreviousAddressNode();
    MovedToPreviousAddressNode createMovedToPreviousAddressNode();
    MovedFromPreviousAddressNode createMovedFromPreviousAddressNode();

    RuleProvider<PersonContactNode> getPersonContactNodeRuleProvider();
    Map<String, RuleProvider<PersonContactNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonContactNodeModule(PersonContactNodeModule module);

        PersonContactNodeComponent build();
    }

}
