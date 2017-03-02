package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface RelatedPartyListNodeItemFactory {
    NodeAddEvent<RelatedPartyNode> createItemAddEvent(String name);
    NodeRemoveEvent<RelatedPartyNode> createItemRemoveEvent(RelatedPartyNode item);
}

@Singleton
public class RelatedPartyListNodeItemProvider {
    @Inject
    MembersInjector<RelatedPartyNode> relatedPartyNodeInjector;

    @Inject
    protected RelatedPartyListNodeItemProvider () {}

    protected MembersInjector<RelatedPartyNode> getRelatedPartyNodeInjector() {
        return this.relatedPartyNodeInjector;
    }

    protected RelatedPartyNode newRelatedPartyNode (
        RelatedPartyListNode parent,
        String name
    ) {
        return new RelatedPartyNode(parent, name);
    }

    protected void configureRelatedPartyNode(RelatedPartyNode node) {
    }

    protected NodeAddEvent<RelatedPartyNode> newItemAddEvent(RelatedPartyNode item) {
        return new RelatedPartyNodeAddEvent(item);
    }

    protected NodeRemoveEvent<RelatedPartyNode> newItemRemoveEvent(RelatedPartyNode item) {
        return new RelatedPartyNodeRemoveEvent(item);
    }

    RelatedPartyListNodeItemFactory createFactory(RelatedPartyListNode parent) {
        return new RelatedPartyListNodeItemFactoryImpl(parent);
    }

    private class RelatedPartyListNodeItemFactoryImpl implements RelatedPartyListNodeItemFactory {

        private final RelatedPartyListNode parent;
        
        private RelatedPartyListNodeItemFactoryImpl(RelatedPartyListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<RelatedPartyNode> createItemAddEvent(String name) {
            RelatedPartyNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<RelatedPartyNode> createItemRemoveEvent(RelatedPartyNode item) {
            return newItemRemoveEvent(item);
        }

        private RelatedPartyNode createItemNode(String name) {
            RelatedPartyNode node = newRelatedPartyNode(parent, name);
            relatedPartyNodeInjector.injectMembers(node);
            configureRelatedPartyNode(node);
            return node;
        }

    }
}
