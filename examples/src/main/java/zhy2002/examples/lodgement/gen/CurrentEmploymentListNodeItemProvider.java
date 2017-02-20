package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface CurrentEmploymentListNodeItemFactory {
    NodeAddEvent<CurrentEmploymentNode> createItemAddEvent(String name);
    NodeRemoveEvent<CurrentEmploymentNode> createItemRemoveEvent(CurrentEmploymentNode item);
}

@Singleton
public class CurrentEmploymentListNodeItemProvider {
    @Inject
    MembersInjector<CurrentEmploymentNode> currentEmploymentNodeInjector;

    @Inject
    protected CurrentEmploymentListNodeItemProvider () {}

    protected MembersInjector<CurrentEmploymentNode> getCurrentEmploymentNodeInjector() {
        return this.currentEmploymentNodeInjector;
    }

    protected CurrentEmploymentNode newCurrentEmploymentNode (
        CurrentEmploymentListNode parent,
        String name
    ) {
        return new CurrentEmploymentNode(parent, name);
    }

    protected void configureCurrentEmploymentNode(CurrentEmploymentNode node) {
    }

    protected NodeAddEvent<CurrentEmploymentNode> newItemAddEvent(CurrentEmploymentNode item) {
        return new CurrentEmploymentNodeAddEvent(item);
    }

    protected NodeRemoveEvent<CurrentEmploymentNode> newItemRemoveEvent(CurrentEmploymentNode item) {
        return new CurrentEmploymentNodeRemoveEvent(item);
    }

    CurrentEmploymentListNodeItemFactory createFactory(CurrentEmploymentListNode parent) {
        return new CurrentEmploymentListNodeItemFactoryImpl(parent);
    }

    private class CurrentEmploymentListNodeItemFactoryImpl implements CurrentEmploymentListNodeItemFactory {

        private final CurrentEmploymentListNode parent;
        
        private CurrentEmploymentListNodeItemFactoryImpl(CurrentEmploymentListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<CurrentEmploymentNode> createItemAddEvent(String name) {
            CurrentEmploymentNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<CurrentEmploymentNode> createItemRemoveEvent(CurrentEmploymentNode item) {
            return newItemRemoveEvent(item);
        }

        private CurrentEmploymentNode createItemNode(String name) {
            CurrentEmploymentNode node = newCurrentEmploymentNode(parent, name);
            currentEmploymentNodeInjector.injectMembers(node);
            configureCurrentEmploymentNode(node);
            return node;
        }

    }
}
