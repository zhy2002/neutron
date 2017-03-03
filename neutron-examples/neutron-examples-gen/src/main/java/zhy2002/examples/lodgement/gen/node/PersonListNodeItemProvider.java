package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface PersonListNodeItemFactory {
    NodeAddEvent<PersonNode> createItemAddEvent(String name);
    NodeRemoveEvent<PersonNode> createItemRemoveEvent(PersonNode item);
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

    protected NodeAddEvent<PersonNode> newItemAddEvent(PersonNode item) {
        return new PersonNodeAddEvent(item);
    }

    protected NodeRemoveEvent<PersonNode> newItemRemoveEvent(PersonNode item) {
        return new PersonNodeRemoveEvent(item);
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
        public final NodeAddEvent<PersonNode> createItemAddEvent(String name) {
            PersonNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<PersonNode> createItemRemoveEvent(PersonNode item) {
            return newItemRemoveEvent(item);
        }

        private PersonNode createItemNode(String name) {
            PersonNode node = newPersonNode(parent, name);
            personNodeInjector.injectMembers(node);
            configurePersonNode(node);
            return node;
        }

    }
}
