package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonListNodeItemFactory {
    PersonNode createPersonNode(String name);
}

@Singleton
public class PersonListNodeItemProvider {
    @Inject
    MembersInjector<PersonNode> personNodeInjector;

    @Inject
    protected PersonListNodeItemProvider () {}

    protected MembersInjector<PersonNode> getPersonNodeInjector() {
        return this.personNodeInjector;
    }

    protected PersonNode newPersonNode (
        PersonListNode parent,
        String name
    ) {
        return new PersonNode(parent, name);
    }

    protected void configurePersonNode(PersonNode node) {
    }

    PersonListNodeItemFactory createFactory(PersonListNode parent) {
        return new PersonListNodeItemFactoryImpl(parent);
    }

    private class PersonListNodeItemFactoryImpl implements PersonListNodeItemFactory {

        private final PersonListNode parent;
        
        private PersonListNodeItemFactoryImpl(PersonListNode parent) {
            this.parent = parent;
        }

        @Override
        public PersonNode createPersonNode(String name) {
            PersonNode node = newPersonNode(parent, name);
            personNodeInjector.injectMembers(node);
            configurePersonNode(node);
            return node;
        }

    }
}
