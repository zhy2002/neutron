package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonContactNodeChildScope
public class PersonContactNodeChildModule {

    private final PersonContactNode parent;

    public PersonContactNodeChildModule(PersonContactNode parent) {
        this.parent = parent;
    }


    @Provides
    @PersonContactNodeChildScope
    @Named("homePhoneNode")
    ContactTelephoneNode provideHomePhoneNode(
        MembersInjector<ContactTelephoneNode> injector
    ) {
        ContactTelephoneNode node = new ContactTelephoneNode(parent, "homePhoneNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("workPhoneNode")
    ContactTelephoneNode provideWorkPhoneNode(
        MembersInjector<ContactTelephoneNode> injector
    ) {
        ContactTelephoneNode node = new ContactTelephoneNode(parent, "workPhoneNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("faxNumberNode")
    ContactTelephoneNode provideFaxNumberNode(
        MembersInjector<ContactTelephoneNode> injector
    ) {
        ContactTelephoneNode node = new ContactTelephoneNode(parent, "faxNumberNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("mobileNumberNode")
    MobileNumberNode provideMobileNumberNode(
        MembersInjector<MobileNumberNode> injector
    ) {
        MobileNumberNode node = new MobileNumberNode(parent, "mobileNumberNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("contactEmailNode")
    ContactEmailNode provideContactEmailNode(
        MembersInjector<ContactEmailNode> injector
    ) {
        ContactEmailNode node = new ContactEmailNode(parent, "contactEmailNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("currentAddressNode")
    ContactAddressNode provideCurrentAddressNode(
        MembersInjector<ContactAddressNode> injector
    ) {
        ContactAddressNode node = new ContactAddressNode(parent, "currentAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("movedToCurrentAddressNode")
    MovedToCurrentAddressNode provideMovedToCurrentAddressNode(
        MembersInjector<MovedToCurrentAddressNode> injector
    ) {
        MovedToCurrentAddressNode node = new MovedToCurrentAddressNode(parent, "movedToCurrentAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("postalAddressNode")
    ContactAddressNode providePostalAddressNode(
        MembersInjector<ContactAddressNode> injector
    ) {
        ContactAddressNode node = new ContactAddressNode(parent, "postalAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("previousAddressNode")
    ContactAddressNode providePreviousAddressNode(
        MembersInjector<ContactAddressNode> injector
    ) {
        ContactAddressNode node = new ContactAddressNode(parent, "previousAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("movedToPreviousAddressNode")
    MovedToPreviousAddressNode provideMovedToPreviousAddressNode(
        MembersInjector<MovedToPreviousAddressNode> injector
    ) {
        MovedToPreviousAddressNode node = new MovedToPreviousAddressNode(parent, "movedToPreviousAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonContactNodeChildScope
    @Named("movedFromPreviousAddressNode")
    MovedFromPreviousAddressNode provideMovedFromPreviousAddressNode(
        MembersInjector<MovedFromPreviousAddressNode> injector
    ) {
        MovedFromPreviousAddressNode node = new MovedFromPreviousAddressNode(parent, "movedFromPreviousAddressNode");

        injector.injectMembers(node);
        return node;
    }

}