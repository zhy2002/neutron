package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonTrustNodeChildFactory {
    PersonTrustTypeNode createPersonTrustTypeNode();
    PersonTrustNameNode createPersonTrustNameNode();
    PersonTrustRegistrationDateNode createPersonTrustRegistrationDateNode();
    PersonTrustCountryNode createPersonTrustCountryNode();
    PersonTrustAddressNode createPersonTrustAddressNode();
    PersonTrustSettlorNotRequiredReasonNode createPersonTrustSettlorNotRequiredReasonNode();
    PersonTrustIndustryNode createPersonTrustIndustryNode();
}

@Singleton
public class PersonTrustNodeChildProvider {
    @Inject
    MembersInjector<PersonTrustTypeNode> personTrustTypeNodeInjector;
    @Inject
    MembersInjector<PersonTrustNameNode> personTrustNameNodeInjector;
    @Inject
    MembersInjector<PersonTrustRegistrationDateNode> personTrustRegistrationDateNodeInjector;
    @Inject
    MembersInjector<PersonTrustCountryNode> personTrustCountryNodeInjector;
    @Inject
    MembersInjector<PersonTrustAddressNode> personTrustAddressNodeInjector;
    @Inject
    MembersInjector<PersonTrustSettlorNotRequiredReasonNode> personTrustSettlorNotRequiredReasonNodeInjector;
    @Inject
    MembersInjector<PersonTrustIndustryNode> personTrustIndustryNodeInjector;

    @Inject
    protected PersonTrustNodeChildProvider () {}

    protected MembersInjector<PersonTrustTypeNode> getPersonTrustTypeNodeInjector() {
        return this.personTrustTypeNodeInjector;
    }

    protected MembersInjector<PersonTrustNameNode> getPersonTrustNameNodeInjector() {
        return this.personTrustNameNodeInjector;
    }

    protected MembersInjector<PersonTrustRegistrationDateNode> getPersonTrustRegistrationDateNodeInjector() {
        return this.personTrustRegistrationDateNodeInjector;
    }

    protected MembersInjector<PersonTrustCountryNode> getPersonTrustCountryNodeInjector() {
        return this.personTrustCountryNodeInjector;
    }

    protected MembersInjector<PersonTrustAddressNode> getPersonTrustAddressNodeInjector() {
        return this.personTrustAddressNodeInjector;
    }

    protected MembersInjector<PersonTrustSettlorNotRequiredReasonNode> getPersonTrustSettlorNotRequiredReasonNodeInjector() {
        return this.personTrustSettlorNotRequiredReasonNodeInjector;
    }

    protected MembersInjector<PersonTrustIndustryNode> getPersonTrustIndustryNodeInjector() {
        return this.personTrustIndustryNodeInjector;
    }

    protected PersonTrustTypeNode newPersonTrustTypeNode(
        PersonTrustNode parent,
        String name
    ) {
        return new PersonTrustTypeNode(parent, name);
    }

    protected void configurePersonTrustTypeNode(PersonTrustTypeNode node) {
    }

    protected PersonTrustNameNode newPersonTrustNameNode(
        PersonTrustNode parent,
        String name
    ) {
        return new PersonTrustNameNode(parent, name);
    }

    protected void configurePersonTrustNameNode(PersonTrustNameNode node) {
    }

    protected PersonTrustRegistrationDateNode newPersonTrustRegistrationDateNode(
        PersonTrustNode parent,
        String name
    ) {
        return new PersonTrustRegistrationDateNode(parent, name);
    }

    protected void configurePersonTrustRegistrationDateNode(PersonTrustRegistrationDateNode node) {
    }

    protected PersonTrustCountryNode newPersonTrustCountryNode(
        PersonTrustNode parent,
        String name
    ) {
        return new PersonTrustCountryNode(parent, name);
    }

    protected void configurePersonTrustCountryNode(PersonTrustCountryNode node) {
    }

    protected PersonTrustAddressNode newPersonTrustAddressNode(
        PersonTrustNode parent,
        String name
    ) {
        return new PersonTrustAddressNode(parent, name);
    }

    protected void configurePersonTrustAddressNode(PersonTrustAddressNode node) {
    }

    protected PersonTrustSettlorNotRequiredReasonNode newPersonTrustSettlorNotRequiredReasonNode(
        PersonTrustNode parent,
        String name
    ) {
        return new PersonTrustSettlorNotRequiredReasonNode(parent, name);
    }

    protected void configurePersonTrustSettlorNotRequiredReasonNode(PersonTrustSettlorNotRequiredReasonNode node) {
    }

    protected PersonTrustIndustryNode newPersonTrustIndustryNode(
        PersonTrustNode parent,
        String name
    ) {
        return new PersonTrustIndustryNode(parent, name);
    }

    protected void configurePersonTrustIndustryNode(PersonTrustIndustryNode node) {
    }

    PersonTrustNodeChildFactory createFactory(PersonTrustNode parent) {
        return new PersonTrustNodeChildFactoryImpl(parent);
    }

    private class PersonTrustNodeChildFactoryImpl implements PersonTrustNodeChildFactory {

        private final PersonTrustNode parent;
        
        private PersonTrustNodeChildFactoryImpl(PersonTrustNode parent) {
            this.parent = parent;
        }

        @Override
        public PersonTrustTypeNode createPersonTrustTypeNode() {
            PersonTrustTypeNode node = newPersonTrustTypeNode(parent, "personTrustTypeNode");
            personTrustTypeNodeInjector.injectMembers(node);
            configurePersonTrustTypeNode(node);
            return node;
        }

        @Override
        public PersonTrustNameNode createPersonTrustNameNode() {
            PersonTrustNameNode node = newPersonTrustNameNode(parent, "personTrustNameNode");
            personTrustNameNodeInjector.injectMembers(node);
            configurePersonTrustNameNode(node);
            return node;
        }

        @Override
        public PersonTrustRegistrationDateNode createPersonTrustRegistrationDateNode() {
            PersonTrustRegistrationDateNode node = newPersonTrustRegistrationDateNode(parent, "personTrustRegistrationDateNode");
            personTrustRegistrationDateNodeInjector.injectMembers(node);
            configurePersonTrustRegistrationDateNode(node);
            return node;
        }

        @Override
        public PersonTrustCountryNode createPersonTrustCountryNode() {
            PersonTrustCountryNode node = newPersonTrustCountryNode(parent, "personTrustCountryNode");
            personTrustCountryNodeInjector.injectMembers(node);
            configurePersonTrustCountryNode(node);
            return node;
        }

        @Override
        public PersonTrustAddressNode createPersonTrustAddressNode() {
            PersonTrustAddressNode node = newPersonTrustAddressNode(parent, "personTrustAddressNode");
            personTrustAddressNodeInjector.injectMembers(node);
            configurePersonTrustAddressNode(node);
            return node;
        }

        @Override
        public PersonTrustSettlorNotRequiredReasonNode createPersonTrustSettlorNotRequiredReasonNode() {
            PersonTrustSettlorNotRequiredReasonNode node = newPersonTrustSettlorNotRequiredReasonNode(parent, "personTrustSettlorNotRequiredReasonNode");
            personTrustSettlorNotRequiredReasonNodeInjector.injectMembers(node);
            configurePersonTrustSettlorNotRequiredReasonNode(node);
            return node;
        }

        @Override
        public PersonTrustIndustryNode createPersonTrustIndustryNode() {
            PersonTrustIndustryNode node = newPersonTrustIndustryNode(parent, "personTrustIndustryNode");
            personTrustIndustryNodeInjector.injectMembers(node);
            configurePersonTrustIndustryNode(node);
            return node;
        }

    }
}
