package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface OtherAssetNodeChildFactory {
    OtherAssetTypeNode createOtherAssetTypeNode();
    OtherAssetDescriptionNode createOtherAssetDescriptionNode();
    OtherAssetMarketValueNode createOtherAssetMarketValueNode();
}

@Singleton
public class OtherAssetNodeChildProvider {
    @Inject
    MembersInjector<OtherAssetTypeNode> otherAssetTypeNodeInjector;
    @Inject
    MembersInjector<OtherAssetDescriptionNode> otherAssetDescriptionNodeInjector;
    @Inject
    MembersInjector<OtherAssetMarketValueNode> otherAssetMarketValueNodeInjector;

    @Inject
    protected OtherAssetNodeChildProvider () {}

    protected MembersInjector<OtherAssetTypeNode> getOtherAssetTypeNodeInjector() {
        return this.otherAssetTypeNodeInjector;
    }

    protected MembersInjector<OtherAssetDescriptionNode> getOtherAssetDescriptionNodeInjector() {
        return this.otherAssetDescriptionNodeInjector;
    }

    protected MembersInjector<OtherAssetMarketValueNode> getOtherAssetMarketValueNodeInjector() {
        return this.otherAssetMarketValueNodeInjector;
    }

    protected OtherAssetTypeNode newOtherAssetTypeNode(
        OtherAssetNode parent,
        String name
    ) {
        return new OtherAssetTypeNode(parent, name);
    }

    protected OtherAssetDescriptionNode newOtherAssetDescriptionNode(
        OtherAssetNode parent,
        String name
    ) {
        return new OtherAssetDescriptionNode(parent, name);
    }

    protected OtherAssetMarketValueNode newOtherAssetMarketValueNode(
        OtherAssetNode parent,
        String name
    ) {
        return new OtherAssetMarketValueNode(parent, name);
    }

    OtherAssetNodeChildFactory createFactory(OtherAssetNode parent) {
        return new OtherAssetNodeChildFactoryImpl(parent);
    }

    private class OtherAssetNodeChildFactoryImpl implements OtherAssetNodeChildFactory {

        private final OtherAssetNode parent;
        
        private OtherAssetNodeChildFactoryImpl(OtherAssetNode parent) {
            this.parent = parent;
        }

        @Override
        public OtherAssetTypeNode createOtherAssetTypeNode() {
            OtherAssetTypeNode node = newOtherAssetTypeNode(parent, "otherAssetTypeNode");
            otherAssetTypeNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public OtherAssetDescriptionNode createOtherAssetDescriptionNode() {
            OtherAssetDescriptionNode node = newOtherAssetDescriptionNode(parent, "otherAssetDescriptionNode");
            otherAssetDescriptionNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public OtherAssetMarketValueNode createOtherAssetMarketValueNode() {
            OtherAssetMarketValueNode node = newOtherAssetMarketValueNode(parent, "otherAssetMarketValueNode");
            otherAssetMarketValueNodeInjector.injectMembers(node);
            return node;
        }

    }
}
