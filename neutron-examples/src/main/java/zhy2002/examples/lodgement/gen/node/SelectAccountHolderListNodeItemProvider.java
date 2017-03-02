package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface SelectAccountHolderListNodeItemFactory {
    NodeAddEvent<SelectAccountHolderNode> createItemAddEvent(String name);
    NodeRemoveEvent<SelectAccountHolderNode> createItemRemoveEvent(SelectAccountHolderNode item);
}

@Singleton
public class SelectAccountHolderListNodeItemProvider {
    @Inject
    MembersInjector<SelectAccountHolderNode> selectAccountHolderNodeInjector;

    @Inject
    protected SelectAccountHolderListNodeItemProvider () {}

    protected MembersInjector<SelectAccountHolderNode> getSelectAccountHolderNodeInjector() {
        return this.selectAccountHolderNodeInjector;
    }

    protected SelectAccountHolderNode newSelectAccountHolderNode (
        SelectAccountHolderListNode<?> parent,
        String name
    ) {
        return new SelectAccountHolderNode(parent, name);
    }

    protected void configureSelectAccountHolderNode(SelectAccountHolderNode node) {
    }

    protected NodeAddEvent<SelectAccountHolderNode> newItemAddEvent(SelectAccountHolderNode item) {
        return new SelectAccountHolderNodeAddEvent(item);
    }

    protected NodeRemoveEvent<SelectAccountHolderNode> newItemRemoveEvent(SelectAccountHolderNode item) {
        return new SelectAccountHolderNodeRemoveEvent(item);
    }

    SelectAccountHolderListNodeItemFactory createFactory(SelectAccountHolderListNode<?> parent) {
        return new SelectAccountHolderListNodeItemFactoryImpl(parent);
    }

    private class SelectAccountHolderListNodeItemFactoryImpl implements SelectAccountHolderListNodeItemFactory {

        private final SelectAccountHolderListNode<?> parent;
        
        private SelectAccountHolderListNodeItemFactoryImpl(SelectAccountHolderListNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<SelectAccountHolderNode> createItemAddEvent(String name) {
            SelectAccountHolderNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<SelectAccountHolderNode> createItemRemoveEvent(SelectAccountHolderNode item) {
            return newItemRemoveEvent(item);
        }

        private SelectAccountHolderNode createItemNode(String name) {
            SelectAccountHolderNode node = newSelectAccountHolderNode(parent, name);
            selectAccountHolderNodeInjector.injectMembers(node);
            configureSelectAccountHolderNode(node);
            return node;
        }

    }
}
