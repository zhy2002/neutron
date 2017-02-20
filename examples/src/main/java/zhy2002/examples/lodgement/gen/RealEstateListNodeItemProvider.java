package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface RealEstateListNodeItemFactory {
    NodeAddEvent<RealEstateNode> createItemAddEvent(String name);
    NodeRemoveEvent<RealEstateNode> createItemRemoveEvent(RealEstateNode item);
}

@Singleton
public class RealEstateListNodeItemProvider {
    @Inject
    MembersInjector<RealEstateNode> realEstateNodeInjector;

    @Inject
    protected RealEstateListNodeItemProvider () {}

    protected MembersInjector<RealEstateNode> getRealEstateNodeInjector() {
        return this.realEstateNodeInjector;
    }

    protected RealEstateNode newRealEstateNode (
        RealEstateListNode parent,
        String name
    ) {
        return new RealEstateNode(parent, name);
    }

    protected void configureRealEstateNode(RealEstateNode node) {
    }

    protected NodeAddEvent<RealEstateNode> newItemAddEvent(RealEstateNode item) {
        return new RealEstateNodeAddEvent(item);
    }

    protected NodeRemoveEvent<RealEstateNode> newItemRemoveEvent(RealEstateNode item) {
        return new RealEstateNodeRemoveEvent(item);
    }

    RealEstateListNodeItemFactory createFactory(RealEstateListNode parent) {
        return new RealEstateListNodeItemFactoryImpl(parent);
    }

    private class RealEstateListNodeItemFactoryImpl implements RealEstateListNodeItemFactory {

        private final RealEstateListNode parent;
        
        private RealEstateListNodeItemFactoryImpl(RealEstateListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<RealEstateNode> createItemAddEvent(String name) {
            RealEstateNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<RealEstateNode> createItemRemoveEvent(RealEstateNode item) {
            return newItemRemoveEvent(item);
        }

        private RealEstateNode createItemNode(String name) {
            RealEstateNode node = newRealEstateNode(parent, name);
            realEstateNodeInjector.injectMembers(node);
            configureRealEstateNode(node);
            return node;
        }

    }
}
