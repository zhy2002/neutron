package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface OtherAssetListNodeItemFactory {
    NodeAddEvent<OtherAssetNode> createItemAddEvent(String name);
    NodeRemoveEvent<OtherAssetNode> createItemRemoveEvent(OtherAssetNode item);
}

@Singleton
public class OtherAssetListNodeItemProvider {
    @Inject
    MembersInjector<OtherAssetNode> otherAssetNodeInjector;

    @Inject
    protected OtherAssetListNodeItemProvider () {}

    protected MembersInjector<OtherAssetNode> getOtherAssetNodeInjector() {
        return this.otherAssetNodeInjector;
    }

    protected OtherAssetNode newOtherAssetNode (
        OtherAssetListNode parent,
        String name
    ) {
        return new OtherAssetNode(parent, name);
    }

    protected void configureOtherAssetNode(OtherAssetNode node) {
    }

    protected NodeAddEvent<OtherAssetNode> newItemAddEvent(OtherAssetNode item) {
        return new OtherAssetNodeAddEvent(item);
    }

    protected NodeRemoveEvent<OtherAssetNode> newItemRemoveEvent(OtherAssetNode item) {
        return new OtherAssetNodeRemoveEvent(item);
    }

    OtherAssetListNodeItemFactory createFactory(OtherAssetListNode parent) {
        return new OtherAssetListNodeItemFactoryImpl(parent);
    }

    private class OtherAssetListNodeItemFactoryImpl implements OtherAssetListNodeItemFactory {

        private final OtherAssetListNode parent;
        
        private OtherAssetListNodeItemFactoryImpl(OtherAssetListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<OtherAssetNode> createItemAddEvent(String name) {
            OtherAssetNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<OtherAssetNode> createItemRemoveEvent(OtherAssetNode item) {
            return newItemRemoveEvent(item);
        }

        private OtherAssetNode createItemNode(String name) {
            OtherAssetNode node = newOtherAssetNode(parent, name);
            otherAssetNodeInjector.injectMembers(node);
            configureOtherAssetNode(node);
            return node;
        }

    }
}
