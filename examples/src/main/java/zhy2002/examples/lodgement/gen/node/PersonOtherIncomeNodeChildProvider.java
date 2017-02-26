package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonOtherIncomeNodeChildFactory {
    PersonAddBackTypeNode createPersonAddBackTypeNode();
    PersonOtherIncomeAmountNode createPersonOtherIncomeAmountNode();
    PersonOtherIncomeDescriptionNode createPersonOtherIncomeDescriptionNode();
    PersonOtherIncomePreviousYearNode createPersonOtherIncomePreviousYearNode();
    PersonOtherIncomeTypeNode createPersonOtherIncomeTypeNode();
}

@Singleton
public class PersonOtherIncomeNodeChildProvider {
    @Inject
    MembersInjector<PersonOtherIncomeTypeNode> personOtherIncomeTypeNodeInjector;
    @Inject
    MembersInjector<PersonOtherIncomeDescriptionNode> personOtherIncomeDescriptionNodeInjector;
    @Inject
    MembersInjector<PersonOtherIncomePreviousYearNode> personOtherIncomePreviousYearNodeInjector;
    @Inject
    MembersInjector<PersonAddBackTypeNode> personAddBackTypeNodeInjector;
    @Inject
    MembersInjector<PersonOtherIncomeAmountNode> personOtherIncomeAmountNodeInjector;

    @Inject
    protected PersonOtherIncomeNodeChildProvider () {}

    protected MembersInjector<PersonOtherIncomeTypeNode> getPersonOtherIncomeTypeNodeInjector() {
        return this.personOtherIncomeTypeNodeInjector;
    }

    protected MembersInjector<PersonOtherIncomeDescriptionNode> getPersonOtherIncomeDescriptionNodeInjector() {
        return this.personOtherIncomeDescriptionNodeInjector;
    }

    protected MembersInjector<PersonOtherIncomePreviousYearNode> getPersonOtherIncomePreviousYearNodeInjector() {
        return this.personOtherIncomePreviousYearNodeInjector;
    }

    protected MembersInjector<PersonAddBackTypeNode> getPersonAddBackTypeNodeInjector() {
        return this.personAddBackTypeNodeInjector;
    }

    protected MembersInjector<PersonOtherIncomeAmountNode> getPersonOtherIncomeAmountNodeInjector() {
        return this.personOtherIncomeAmountNodeInjector;
    }

    protected PersonAddBackTypeNode newPersonAddBackTypeNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonAddBackTypeNode(parent, name);
    }

    protected void configurePersonAddBackTypeNode(PersonAddBackTypeNode node) {
    }

    protected PersonOtherIncomeAmountNode newPersonOtherIncomeAmountNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonOtherIncomeAmountNode(parent, name);
    }

    protected void configurePersonOtherIncomeAmountNode(PersonOtherIncomeAmountNode node) {
    }

    protected PersonOtherIncomeDescriptionNode newPersonOtherIncomeDescriptionNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonOtherIncomeDescriptionNode(parent, name);
    }

    protected void configurePersonOtherIncomeDescriptionNode(PersonOtherIncomeDescriptionNode node) {
    }

    protected PersonOtherIncomePreviousYearNode newPersonOtherIncomePreviousYearNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonOtherIncomePreviousYearNode(parent, name);
    }

    protected void configurePersonOtherIncomePreviousYearNode(PersonOtherIncomePreviousYearNode node) {
    }

    protected PersonOtherIncomeTypeNode newPersonOtherIncomeTypeNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonOtherIncomeTypeNode(parent, name);
    }

    protected void configurePersonOtherIncomeTypeNode(PersonOtherIncomeTypeNode node) {
    }

    PersonOtherIncomeNodeChildFactory createFactory(PersonOtherIncomeNode parent) {
        return new PersonOtherIncomeNodeChildFactoryImpl(parent);
    }

    private class PersonOtherIncomeNodeChildFactoryImpl implements PersonOtherIncomeNodeChildFactory {

        private final PersonOtherIncomeNode parent;
        
        private PersonOtherIncomeNodeChildFactoryImpl(PersonOtherIncomeNode parent) {
            this.parent = parent;
        }

        @Override
        public PersonAddBackTypeNode createPersonAddBackTypeNode() {
            PersonAddBackTypeNode node = newPersonAddBackTypeNode(parent, "personAddBackTypeNode");
            personAddBackTypeNodeInjector.injectMembers(node);
            configurePersonAddBackTypeNode(node);
            return node;
        }

        @Override
        public PersonOtherIncomeAmountNode createPersonOtherIncomeAmountNode() {
            PersonOtherIncomeAmountNode node = newPersonOtherIncomeAmountNode(parent, "personOtherIncomeAmountNode");
            personOtherIncomeAmountNodeInjector.injectMembers(node);
            configurePersonOtherIncomeAmountNode(node);
            return node;
        }

        @Override
        public PersonOtherIncomeDescriptionNode createPersonOtherIncomeDescriptionNode() {
            PersonOtherIncomeDescriptionNode node = newPersonOtherIncomeDescriptionNode(parent, "personOtherIncomeDescriptionNode");
            personOtherIncomeDescriptionNodeInjector.injectMembers(node);
            configurePersonOtherIncomeDescriptionNode(node);
            return node;
        }

        @Override
        public PersonOtherIncomePreviousYearNode createPersonOtherIncomePreviousYearNode() {
            PersonOtherIncomePreviousYearNode node = newPersonOtherIncomePreviousYearNode(parent, "personOtherIncomePreviousYearNode");
            personOtherIncomePreviousYearNodeInjector.injectMembers(node);
            configurePersonOtherIncomePreviousYearNode(node);
            return node;
        }

        @Override
        public PersonOtherIncomeTypeNode createPersonOtherIncomeTypeNode() {
            PersonOtherIncomeTypeNode node = newPersonOtherIncomeTypeNode(parent, "personOtherIncomeTypeNode");
            personOtherIncomeTypeNodeInjector.injectMembers(node);
            configurePersonOtherIncomeTypeNode(node);
            return node;
        }

    }
}
