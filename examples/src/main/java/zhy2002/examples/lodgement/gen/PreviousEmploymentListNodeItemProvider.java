package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface PreviousEmploymentListNodeItemFactory {
    NodeAddEvent<PreviousEmploymentNode> createItemAddEvent(String name);
    NodeRemoveEvent<PreviousEmploymentNode> createItemRemoveEvent(PreviousEmploymentNode item);
}

@Singleton
public class PreviousEmploymentListNodeItemProvider {
    @Inject
    MembersInjector<PreviousEmploymentNode> previousEmploymentNodeInjector;

    @Inject
    protected PreviousEmploymentListNodeItemProvider () {}

    protected MembersInjector<PreviousEmploymentNode> getPreviousEmploymentNodeInjector() {
        return this.previousEmploymentNodeInjector;
    }

    protected PreviousEmploymentNode newPreviousEmploymentNode (
        PreviousEmploymentListNode parent,
        String name
    ) {
        return new PreviousEmploymentNode(parent, name);
    }

    protected void configurePreviousEmploymentNode(PreviousEmploymentNode node) {
    }

    protected NodeAddEvent<PreviousEmploymentNode> newItemAddEvent(PreviousEmploymentNode item) {
        return new PreviousEmploymentNodeAddEvent(item);
    }

    protected NodeRemoveEvent<PreviousEmploymentNode> newItemRemoveEvent(PreviousEmploymentNode item) {
        return new PreviousEmploymentNodeRemoveEvent(item);
    }

    PreviousEmploymentListNodeItemFactory createFactory(PreviousEmploymentListNode parent) {
        return new PreviousEmploymentListNodeItemFactoryImpl(parent);
    }

    private class PreviousEmploymentListNodeItemFactoryImpl implements PreviousEmploymentListNodeItemFactory {

        private final PreviousEmploymentListNode parent;
        
        private PreviousEmploymentListNodeItemFactoryImpl(PreviousEmploymentListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<PreviousEmploymentNode> createItemAddEvent(String name) {
            PreviousEmploymentNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<PreviousEmploymentNode> createItemRemoveEvent(PreviousEmploymentNode item) {
            return newItemRemoveEvent(item);
        }

        private PreviousEmploymentNode createItemNode(String name) {
            PreviousEmploymentNode node = newPreviousEmploymentNode(parent, name);
            previousEmploymentNodeInjector.injectMembers(node);
            configurePreviousEmploymentNode(node);
            return node;
        }

    }
}
