package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface SelectRelatedPersonListNodeItemFactory {
    NodeAddEvent<SelectRelatedPersonNode> createItemAddEvent(String name);
    NodeRemoveEvent<SelectRelatedPersonNode> createItemRemoveEvent(SelectRelatedPersonNode item);
}

@Singleton
public class SelectRelatedPersonListNodeItemProvider {
    @Inject
    MembersInjector<SelectRelatedPersonNode> selectRelatedPersonNodeInjector;

    @Inject
    protected SelectRelatedPersonListNodeItemProvider () {}

    protected MembersInjector<SelectRelatedPersonNode> getSelectRelatedPersonNodeInjector() {
        return this.selectRelatedPersonNodeInjector;
    }

    protected SelectRelatedPersonNode newSelectRelatedPersonNode (
        SelectRelatedPersonListNode<?> parent,
        String name
    ) {
        return new SelectRelatedPersonNode(parent, name);
    }

    protected void configureSelectRelatedPersonNode(SelectRelatedPersonNode node) {
    }

    protected NodeAddEvent<SelectRelatedPersonNode> newItemAddEvent(SelectRelatedPersonNode item) {
        return new SelectRelatedPersonNodeAddEvent(item);
    }

    protected NodeRemoveEvent<SelectRelatedPersonNode> newItemRemoveEvent(SelectRelatedPersonNode item) {
        return new SelectRelatedPersonNodeRemoveEvent(item);
    }

    SelectRelatedPersonListNodeItemFactory createFactory(SelectRelatedPersonListNode<?> parent) {
        return new SelectRelatedPersonListNodeItemFactoryImpl(parent);
    }

    private class SelectRelatedPersonListNodeItemFactoryImpl implements SelectRelatedPersonListNodeItemFactory {

        private final SelectRelatedPersonListNode<?> parent;
        
        private SelectRelatedPersonListNodeItemFactoryImpl(SelectRelatedPersonListNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<SelectRelatedPersonNode> createItemAddEvent(String name) {
            SelectRelatedPersonNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<SelectRelatedPersonNode> createItemRemoveEvent(SelectRelatedPersonNode item) {
            return newItemRemoveEvent(item);
        }

        private SelectRelatedPersonNode createItemNode(String name) {
            SelectRelatedPersonNode node = newSelectRelatedPersonNode(parent, name);
            selectRelatedPersonNodeInjector.injectMembers(node);
            configureSelectRelatedPersonNode(node);
            return node;
        }

    }
}
