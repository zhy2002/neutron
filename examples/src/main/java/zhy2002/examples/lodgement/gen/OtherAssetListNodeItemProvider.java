package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface OtherAssetListNodeItemFactory {
    OtherAssetNode createOtherAssetNode(String name);
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

    OtherAssetListNodeItemFactory createFactory(OtherAssetListNode parent) {
        return new OtherAssetListNodeItemFactoryImpl(parent);
    }

    private class OtherAssetListNodeItemFactoryImpl implements OtherAssetListNodeItemFactory {

        private final OtherAssetListNode parent;
        
        private OtherAssetListNodeItemFactoryImpl(OtherAssetListNode parent) {
            this.parent = parent;
        }

        @Override
        public OtherAssetNode createOtherAssetNode(String name) {
            OtherAssetNode node = newOtherAssetNode(parent, name);
            otherAssetNodeInjector.injectMembers(node);
            configureOtherAssetNode(node);
            return node;
        }

    }
}
