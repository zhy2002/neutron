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
    MembersInjector<ContactTelephoneNode> contactTelephoneNodeInjector;
    @Inject
    MembersInjector<MobileNumberNode> mobileNumberNodeInjector;
    @Inject
    MembersInjector<ContactAddressNode> contactAddressNodeInjector;
    @Inject
    MembersInjector<MovedToCurrentAddressNode> movedToCurrentAddressNodeInjector;
    @Inject
    MembersInjector<MovedToPreviousAddressNode> movedToPreviousAddressNodeInjector;
    @Inject
    MembersInjector<MovedFromPreviousAddressNode> movedFromPreviousAddressNodeInjector;
    @Inject
    MembersInjector<ContactEmailNode> contactEmailNodeInjector;

    @Inject
    protected PersonContactNodeChildProvider () {}

    protected MembersInjector<ContactTelephoneNode> getContactTelephoneNodeInjector() {
        return this.contactTelephoneNodeInjector;
    }

    protected MembersInjector<MobileNumberNode> getMobileNumberNodeInjector() {
        return this.mobileNumberNodeInjector;
    }

    protected MembersInjector<ContactAddressNode> getContactAddressNodeInjector() {
        return this.contactAddressNodeInjector;
    }

    protected MembersInjector<MovedToCurrentAddressNode> getMovedToCurrentAddressNodeInjector() {
        return this.movedToCurrentAddressNodeInjector;
    }

    protected MembersInjector<MovedToPreviousAddressNode> getMovedToPreviousAddressNodeInjector() {
        return this.movedToPreviousAddressNodeInjector;
    }

    protected MembersInjector<MovedFromPreviousAddressNode> getMovedFromPreviousAddressNodeInjector() {
        return this.movedFromPreviousAddressNodeInjector;
    }

    protected MembersInjector<ContactEmailNode> getContactEmailNodeInjector() {
        return this.contactEmailNodeInjector;
    }

    protected ContactTelephoneNode newHomePhoneNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactTelephoneNode(parent, name);
    }

    protected ContactTelephoneNode newWorkPhoneNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactTelephoneNode(parent, name);
    }

    protected ContactTelephoneNode newFaxNumberNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactTelephoneNode(parent, name);
    }

    protected MobileNumberNode newMobileNumberNode(
        PersonContactNode parent,
        String name
    ) {
        return new MobileNumberNode(parent, name);
    }

    protected ContactEmailNode newContactEmailNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactEmailNode(parent, name);
    }

    protected ContactAddressNode newCurrentAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactAddressNode(parent, name);
    }

    protected MovedToCurrentAddressNode newMovedToCurrentAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedToCurrentAddressNode(parent, name);
    }

    protected ContactAddressNode newPostalAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactAddressNode(parent, name);
    }

    protected ContactAddressNode newPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new ContactAddressNode(parent, name);
    }

    protected MovedToPreviousAddressNode newMovedToPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedToPreviousAddressNode(parent, name);
    }

    protected MovedFromPreviousAddressNode newMovedFromPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedFromPreviousAddressNode(parent, name);
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
            return node;
        }

        @Override
        public ContactTelephoneNode createWorkPhoneNode() {
            ContactTelephoneNode node = newWorkPhoneNode(parent, "workPhoneNode");
            contactTelephoneNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ContactTelephoneNode createFaxNumberNode() {
            ContactTelephoneNode node = newFaxNumberNode(parent, "faxNumberNode");
            contactTelephoneNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public MobileNumberNode createMobileNumberNode() {
            MobileNumberNode node = newMobileNumberNode(parent, "mobileNumberNode");
            mobileNumberNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ContactEmailNode createContactEmailNode() {
            ContactEmailNode node = newContactEmailNode(parent, "contactEmailNode");
            contactEmailNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ContactAddressNode createCurrentAddressNode() {
            ContactAddressNode node = newCurrentAddressNode(parent, "currentAddressNode");
            contactAddressNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public MovedToCurrentAddressNode createMovedToCurrentAddressNode() {
            MovedToCurrentAddressNode node = newMovedToCurrentAddressNode(parent, "movedToCurrentAddressNode");
            movedToCurrentAddressNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ContactAddressNode createPostalAddressNode() {
            ContactAddressNode node = newPostalAddressNode(parent, "postalAddressNode");
            contactAddressNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ContactAddressNode createPreviousAddressNode() {
            ContactAddressNode node = newPreviousAddressNode(parent, "previousAddressNode");
            contactAddressNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public MovedToPreviousAddressNode createMovedToPreviousAddressNode() {
            MovedToPreviousAddressNode node = newMovedToPreviousAddressNode(parent, "movedToPreviousAddressNode");
            movedToPreviousAddressNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public MovedFromPreviousAddressNode createMovedFromPreviousAddressNode() {
            MovedFromPreviousAddressNode node = newMovedFromPreviousAddressNode(parent, "movedFromPreviousAddressNode");
            movedFromPreviousAddressNodeInjector.injectMembers(node);
            return node;
        }

    }
}
