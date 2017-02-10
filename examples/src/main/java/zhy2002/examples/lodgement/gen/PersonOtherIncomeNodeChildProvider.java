package zhy2002.examples.lodgement.gen;

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
    MembersInjector<PersonAddBackTypeNode> personAddBackTypeNodeInjector;
    @Inject
    MembersInjector<PersonOtherIncomeAmountNode> personOtherIncomeAmountNodeInjector;
    @Inject
    MembersInjector<PersonOtherIncomePreviousYearNode> personOtherIncomePreviousYearNodeInjector;
    @Inject
    MembersInjector<PersonOtherIncomeDescriptionNode> personOtherIncomeDescriptionNodeInjector;

    @Inject
    protected PersonOtherIncomeNodeChildProvider () {}

    protected MembersInjector<PersonOtherIncomeTypeNode> getPersonOtherIncomeTypeNodeInjector() {
        return this.personOtherIncomeTypeNodeInjector;
    }

    protected MembersInjector<PersonAddBackTypeNode> getPersonAddBackTypeNodeInjector() {
        return this.personAddBackTypeNodeInjector;
    }

    protected MembersInjector<PersonOtherIncomeAmountNode> getPersonOtherIncomeAmountNodeInjector() {
        return this.personOtherIncomeAmountNodeInjector;
    }

    protected MembersInjector<PersonOtherIncomePreviousYearNode> getPersonOtherIncomePreviousYearNodeInjector() {
        return this.personOtherIncomePreviousYearNodeInjector;
    }

    protected MembersInjector<PersonOtherIncomeDescriptionNode> getPersonOtherIncomeDescriptionNodeInjector() {
        return this.personOtherIncomeDescriptionNodeInjector;
    }

    protected PersonAddBackTypeNode newPersonAddBackTypeNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonAddBackTypeNode(parent, name);
    }

    protected PersonOtherIncomeAmountNode newPersonOtherIncomeAmountNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonOtherIncomeAmountNode(parent, name);
    }

    protected PersonOtherIncomeDescriptionNode newPersonOtherIncomeDescriptionNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonOtherIncomeDescriptionNode(parent, name);
    }

    protected PersonOtherIncomePreviousYearNode newPersonOtherIncomePreviousYearNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonOtherIncomePreviousYearNode(parent, name);
    }

    protected PersonOtherIncomeTypeNode newPersonOtherIncomeTypeNode(
        PersonOtherIncomeNode parent,
        String name
    ) {
        return new PersonOtherIncomeTypeNode(parent, name);
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
            return node;
        }

        @Override
        public PersonOtherIncomeAmountNode createPersonOtherIncomeAmountNode() {
            PersonOtherIncomeAmountNode node = newPersonOtherIncomeAmountNode(parent, "personOtherIncomeAmountNode");
            personOtherIncomeAmountNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public PersonOtherIncomeDescriptionNode createPersonOtherIncomeDescriptionNode() {
            PersonOtherIncomeDescriptionNode node = newPersonOtherIncomeDescriptionNode(parent, "personOtherIncomeDescriptionNode");
            personOtherIncomeDescriptionNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public PersonOtherIncomePreviousYearNode createPersonOtherIncomePreviousYearNode() {
            PersonOtherIncomePreviousYearNode node = newPersonOtherIncomePreviousYearNode(parent, "personOtherIncomePreviousYearNode");
            personOtherIncomePreviousYearNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public PersonOtherIncomeTypeNode createPersonOtherIncomeTypeNode() {
            PersonOtherIncomeTypeNode node = newPersonOtherIncomeTypeNode(parent, "personOtherIncomeTypeNode");
            personOtherIncomeTypeNodeInjector.injectMembers(node);
            return node;
        }

    }
}
