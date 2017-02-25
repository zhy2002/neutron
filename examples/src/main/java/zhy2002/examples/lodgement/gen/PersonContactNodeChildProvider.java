package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonContactNodeChildFactory {
    ContactTelephoneNode createHomePhoneNode();
    ContactTelephoneNode createWorkPhoneNode();
    ContactTelephoneNode createFaxNumberNode();
    MobileNumberNode createMobileNumberNode();
    ContactEmailNode createContactEmailNode();
    ContactAddressNode createCurrentAddressNode();
    MovedToCurrentAddressNode createMovedToCurrentAddressNode();
    ContactAddressNode createPostalAddressNode();
    ContactAddressNode createPreviousAddressNode();
    MovedToPreviousAddressNode createMovedToPreviousAddressNode();
    MovedFromPreviousAddressNode createMovedFromPreviousAddressNode();
}

@Singleton
public class PersonContactNodeChildProvider {
    @Inject
    MembersInjector<MovedFromPreviousAddressNode> movedFromPreviousAddressNodeInjector;
    @Inject
    MembersInjector<ContactAddressNode> contactAddressNodeInjector;
    @Inject
    MembersInjector<ContactTelephoneNode> contactTelephoneNodeInjector;
    @Inject
    MembersInjector<ContactEmailNode> contactEmailNodeInjector;
    @Inject
    MembersInjector<MovedToPreviousAddressNode> movedToPreviousAddressNodeInjector;
    @Inject
    MembersInjector<MobileNumberNode> mobileNumberNodeInjector;
    @Inject
    MembersInjector<MovedToCurrentAddressNode> movedToCurrentAddressNodeInjector;

    @Inject
    protected PersonContactNodeChildProvider () {}

    protected MembersInjector<MovedFromPreviousAddressNode> getMovedFromPreviousAddressNodeInjector() {
        return this.movedFromPreviousAddressNodeInjector;
    }

    protected MembersInjector<ContactAddressNode> getContactAddressNodeInjector() {
        return this.contactAddressNodeInjector;
    }

    protected MembersInjector<ContactTelephoneNode> getContactTelephoneNodeInjector() {
        return this.contactTelephoneNodeInjector;
    }

    protected MembersInjector<ContactEmailNode> getContactEmailNodeInjector() {
        return this.contactEmailNodeInjector;
    }

    protected MembersInjector<MovedToPreviousAddressNode> getMovedToPreviousAddressNodeInjector() {
        return this.movedToPreviousAddressNodeInjector;
    }

    protected MembersInjector<MobileNumberNode> getMobileNumberNodeInjector() {
        return this.mobileNumberNodeInjector;
    }

    protected MembersInjector<MovedToCurrentAddressNode> getMovedToCurrentAddressNodeInjector() {
        return this.movedToCurrentAddressNodeInjector;
    }

    protected ContactTelephoneNode newHomePhoneNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactTelephoneNode(parent, name);
    }

    protected void configureHomePhoneNode(ContactTelephoneNode node) {
    }

    protected ContactTelephoneNode newWorkPhoneNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactTelephoneNode(parent, name);
    }

    protected void configureWorkPhoneNode(ContactTelephoneNode node) {
    }

    protected ContactTelephoneNode newFaxNumberNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactTelephoneNode(parent, name);
    }

    protected void configureFaxNumberNode(ContactTelephoneNode node) {
    }

    protected MobileNumberNode newMobileNumberNode(
        PersonContactNode parent,
        String name
    ) {
        return new MobileNumberNode(parent, name);
    }

    protected void configureMobileNumberNode(MobileNumberNode node) {
    }

    protected ContactEmailNode newContactEmailNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactEmailNode(parent, name);
    }

    protected void configureContactEmailNode(ContactEmailNode node) {
    }

    protected ContactAddressNode newCurrentAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactAddressNode(parent, name);
    }

    protected void configureCurrentAddressNode(ContactAddressNode node) {
    }

    protected MovedToCurrentAddressNode newMovedToCurrentAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedToCurrentAddressNode(parent, name);
    }

    protected void configureMovedToCurrentAddressNode(MovedToCurrentAddressNode node) {
    }

    protected ContactAddressNode newPostalAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactAddressNode(parent, name);
    }

    protected void configurePostalAddressNode(ContactAddressNode node) {
    }

    protected ContactAddressNode newPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactAddressNode(parent, name);
    }

    protected void configurePreviousAddressNode(ContactAddressNode node) {
    }

    protected MovedToPreviousAddressNode newMovedToPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedToPreviousAddressNode(parent, name);
    }

    protected void configureMovedToPreviousAddressNode(MovedToPreviousAddressNode node) {
    }

    protected MovedFromPreviousAddressNode newMovedFromPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedFromPreviousAddressNode(parent, name);
    }

    protected void configureMovedFromPreviousAddressNode(MovedFromPreviousAddressNode node) {
    }

    PersonContactNodeChildFactory createFactory(PersonContactNode parent) {
        return new PersonContactNodeChildFactoryImpl(parent);
    }

    private class PersonContactNodeChildFactoryImpl implements PersonContactNodeChildFactory {

        private final PersonContactNode parent;
        
        private PersonContactNodeChildFactoryImpl(PersonContactNode parent) {
            this.parent = parent;
        }

        @Override
        public ContactTelephoneNode createHomePhoneNode() {
            ContactTelephoneNode node = newHomePhoneNode(parent, "homePhoneNode");
            contactTelephoneNodeInjector.injectMembers(node);
            configureHomePhoneNode(node);
            return node;
        }

        @Override
        public ContactTelephoneNode createWorkPhoneNode() {
            ContactTelephoneNode node = newWorkPhoneNode(parent, "workPhoneNode");
            contactTelephoneNodeInjector.injectMembers(node);
            configureWorkPhoneNode(node);
            return node;
        }

        @Override
        public ContactTelephoneNode createFaxNumberNode() {
            ContactTelephoneNode node = newFaxNumberNode(parent, "faxNumberNode");
            contactTelephoneNodeInjector.injectMembers(node);
            configureFaxNumberNode(node);
            return node;
        }

        @Override
        public MobileNumberNode createMobileNumberNode() {
            MobileNumberNode node = newMobileNumberNode(parent, "mobileNumberNode");
            mobileNumberNodeInjector.injectMembers(node);
            configureMobileNumberNode(node);
            return node;
        }

        @Override
        public ContactEmailNode createContactEmailNode() {
            ContactEmailNode node = newContactEmailNode(parent, "contactEmailNode");
            contactEmailNodeInjector.injectMembers(node);
            configureContactEmailNode(node);
            return node;
        }

        @Override
        public ContactAddressNode createCurrentAddressNode() {
            ContactAddressNode node = newCurrentAddressNode(parent, "currentAddressNode");
            contactAddressNodeInjector.injectMembers(node);
            configureCurrentAddressNode(node);
            return node;
        }

        @Override
        public MovedToCurrentAddressNode createMovedToCurrentAddressNode() {
            MovedToCurrentAddressNode node = newMovedToCurrentAddressNode(parent, "movedToCurrentAddressNode");
            movedToCurrentAddressNodeInjector.injectMembers(node);
            configureMovedToCurrentAddressNode(node);
            return node;
        }

        @Override
        public ContactAddressNode createPostalAddressNode() {
            ContactAddressNode node = newPostalAddressNode(parent, "postalAddressNode");
            contactAddressNodeInjector.injectMembers(node);
            configurePostalAddressNode(node);
            return node;
        }

        @Override
        public ContactAddressNode createPreviousAddressNode() {
            ContactAddressNode node = newPreviousAddressNode(parent, "previousAddressNode");
            contactAddressNodeInjector.injectMembers(node);
            configurePreviousAddressNode(node);
            return node;
        }

        @Override
        public MovedToPreviousAddressNode createMovedToPreviousAddressNode() {
            MovedToPreviousAddressNode node = newMovedToPreviousAddressNode(parent, "movedToPreviousAddressNode");
            movedToPreviousAddressNodeInjector.injectMembers(node);
            configureMovedToPreviousAddressNode(node);
            return node;
        }

        @Override
        public MovedFromPreviousAddressNode createMovedFromPreviousAddressNode() {
            MovedFromPreviousAddressNode node = newMovedFromPreviousAddressNode(parent, "movedFromPreviousAddressNode");
            movedFromPreviousAddressNodeInjector.injectMembers(node);
            configureMovedFromPreviousAddressNode(node);
            return node;
        }

    }
}
