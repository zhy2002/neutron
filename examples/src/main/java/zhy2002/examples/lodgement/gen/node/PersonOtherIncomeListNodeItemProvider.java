package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface PersonOtherIncomeListNodeItemFactory {
    NodeAddEvent<PersonOtherIncomeNode> createItemAddEvent(String name);
    NodeRemoveEvent<PersonOtherIncomeNode> createItemRemoveEvent(PersonOtherIncomeNode item);
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

    protected void configurePersonOtherIncomeNode(PersonOtherIncomeNode node) {
    }

    protected NodeAddEvent<PersonOtherIncomeNode> newItemAddEvent(PersonOtherIncomeNode item) {
        return new PersonOtherIncomeNodeAddEvent(item);
    }

    protected NodeRemoveEvent<PersonOtherIncomeNode> newItemRemoveEvent(PersonOtherIncomeNode item) {
        return new PersonOtherIncomeNodeRemoveEvent(item);
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
        public final NodeAddEvent<PersonOtherIncomeNode> createItemAddEvent(String name) {
            PersonOtherIncomeNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<PersonOtherIncomeNode> createItemRemoveEvent(PersonOtherIncomeNode item) {
            return newItemRemoveEvent(item);
        }

        private PersonOtherIncomeNode createItemNode(String name) {
            PersonOtherIncomeNode node = newPersonOtherIncomeNode(parent, name);
            personOtherIncomeNodeInjector.injectMembers(node);
            configurePersonOtherIncomeNode(node);
            return node;
        }

    }
}
