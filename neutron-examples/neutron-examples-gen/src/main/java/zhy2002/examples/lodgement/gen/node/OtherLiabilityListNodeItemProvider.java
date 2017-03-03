package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface OtherLiabilityListNodeItemFactory {
    NodeAddEvent<OtherLiabilityNode> createItemAddEvent(String name);
    NodeRemoveEvent<OtherLiabilityNode> createItemRemoveEvent(OtherLiabilityNode item);
}

@Singleton
public class OtherLiabilityListNodeItemProvider {
    @Inject
    MembersInjector<OtherLiabilityNode> otherLiabilityNodeInjector;

    @Inject
    protected OtherLiabilityListNodeItemProvider () {}

    protected MembersInjector<OtherLiabilityNode> getOtherLiabilityNodeInjector() {
        return this.otherLiabilityNodeInjector;
    }

    protected OtherLiabilityNode newOtherLiabilityNode (
        OtherLiabilityListNode parent,
        String name
    ) {
        return new OtherLiabilityNode(parent, name);
    }

    protected void configureOtherLiabilityNode(OtherLiabilityNode node) {
    }

    protected NodeAddEvent<OtherLiabilityNode> newItemAddEvent(OtherLiabilityNode item) {
        return new OtherLiabilityNodeAddEvent(item);
    }

    protected NodeRemoveEvent<OtherLiabilityNode> newItemRemoveEvent(OtherLiabilityNode item) {
        return new OtherLiabilityNodeRemoveEvent(item);
    }

    OtherLiabilityListNodeItemFactory createFactory(OtherLiabilityListNode parent) {
        return new OtherLiabilityListNodeItemFactoryImpl(parent);
    }

    private class OtherLiabilityListNodeItemFactoryImpl implements OtherLiabilityListNodeItemFactory {

        private final OtherLiabilityListNode parent;
        
        private OtherLiabilityListNodeItemFactoryImpl(OtherLiabilityListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<OtherLiabilityNode> createItemAddEvent(String name) {
            OtherLiabilityNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<OtherLiabilityNode> createItemRemoveEvent(OtherLiabilityNode item) {
            return newItemRemoveEvent(item);
        }

        private OtherLiabilityNode createItemNode(String name) {
            OtherLiabilityNode node = newOtherLiabilityNode(parent, name);
            otherLiabilityNodeInjector.injectMembers(node);
            configureOtherLiabilityNode(node);
            return node;
        }

    }
}
