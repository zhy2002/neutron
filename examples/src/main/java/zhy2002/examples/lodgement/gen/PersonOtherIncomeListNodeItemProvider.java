package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonOtherIncomeListNodeItemFactory {
    PersonOtherIncomeNode createPersonOtherIncomeNode(String name);
}

@Singleton
public class PersonOtherIncomeListNodeItemProvider {
    @Inject
    MembersInjector<PersonOtherIncomeNode> personOtherIncomeNodeInjector;

    @Inject
    protected PersonOtherIncomeListNodeItemProvider () {}

    protected MembersInjector<PersonOtherIncomeNode> getPersonOtherIncomeNodeInjector() {
        return this.personOtherIncomeNodeInjector;
    }

    protected PersonOtherIncomeNode newPersonOtherIncomeNode (
        PersonOtherIncomeListNode parent,
        String name
    ) {
        return new PersonOtherIncomeNode(parent, name);
    }

    PersonOtherIncomeListNodeItemFactory createFactory(PersonOtherIncomeListNode parent) {
        return new PersonOtherIncomeListNodeItemFactoryImpl(parent);
    }

    private class PersonOtherIncomeListNodeItemFactoryImpl implements PersonOtherIncomeListNodeItemFactory {

        private final PersonOtherIncomeListNode parent;
        
        private PersonOtherIncomeListNodeItemFactoryImpl(PersonOtherIncomeListNode parent) {
            this.parent = parent;
        }

        @Override
        public PersonOtherIncomeNode createPersonOtherIncomeNode(String name) {
            PersonOtherIncomeNode node = newPersonOtherIncomeNode(parent, name);
            personOtherIncomeNodeInjector.injectMembers(node);
            return node;
        }

    }
}
