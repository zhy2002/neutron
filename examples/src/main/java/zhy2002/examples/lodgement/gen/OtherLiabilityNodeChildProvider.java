package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface OtherLiabilityNodeChildFactory {
    OtherLiabilityTypeNode createOtherLiabilityTypeNode();
    OtherLiabilityDescriptionNode createOtherLiabilityDescriptionNode();
    OtherLiabilityMarketValueNode createOtherLiabilityMarketValueNode();
}

@Singleton
public class OtherLiabilityNodeChildProvider {
    @Inject
    MembersInjector<OtherLiabilityTypeNode> otherLiabilityTypeNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityDescriptionNode> otherLiabilityDescriptionNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityMarketValueNode> otherLiabilityMarketValueNodeInjector;

    @Inject
    protected OtherLiabilityNodeChildProvider () {}

    protected MembersInjector<OtherLiabilityTypeNode> getOtherLiabilityTypeNodeInjector() {
        return this.otherLiabilityTypeNodeInjector;
    }

    protected MembersInjector<OtherLiabilityDescriptionNode> getOtherLiabilityDescriptionNodeInjector() {
        return this.otherLiabilityDescriptionNodeInjector;
    }

    protected MembersInjector<OtherLiabilityMarketValueNode> getOtherLiabilityMarketValueNodeInjector() {
        return this.otherLiabilityMarketValueNodeInjector;
    }

    protected OtherLiabilityTypeNode newOtherLiabilityTypeNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityTypeNode(parent, name);
    }

    protected void configureOtherLiabilityTypeNode(OtherLiabilityTypeNode node) {
    }

    protected OtherLiabilityDescriptionNode newOtherLiabilityDescriptionNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityDescriptionNode(parent, name);
    }

    protected void configureOtherLiabilityDescriptionNode(OtherLiabilityDescriptionNode node) {
    }

    protected OtherLiabilityMarketValueNode newOtherLiabilityMarketValueNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityMarketValueNode(parent, name);
    }

    protected void configureOtherLiabilityMarketValueNode(OtherLiabilityMarketValueNode node) {
    }

    OtherLiabilityNodeChildFactory createFactory(OtherLiabilityNode parent) {
        return new OtherLiabilityNodeChildFactoryImpl(parent);
    }

    private class OtherLiabilityNodeChildFactoryImpl implements OtherLiabilityNodeChildFactory {

        private final OtherLiabilityNode parent;
        
        private OtherLiabilityNodeChildFactoryImpl(OtherLiabilityNode parent) {
            this.parent = parent;
        }

        @Override
        public OtherLiabilityTypeNode createOtherLiabilityTypeNode() {
            OtherLiabilityTypeNode node = newOtherLiabilityTypeNode(parent, "otherLiabilityTypeNode");
            otherLiabilityTypeNodeInjector.injectMembers(node);
            configureOtherLiabilityTypeNode(node);
            return node;
        }

        @Override
        public OtherLiabilityDescriptionNode createOtherLiabilityDescriptionNode() {
            OtherLiabilityDescriptionNode node = newOtherLiabilityDescriptionNode(parent, "otherLiabilityDescriptionNode");
            otherLiabilityDescriptionNodeInjector.injectMembers(node);
            configureOtherLiabilityDescriptionNode(node);
            return node;
        }

        @Override
        public OtherLiabilityMarketValueNode createOtherLiabilityMarketValueNode() {
            OtherLiabilityMarketValueNode node = newOtherLiabilityMarketValueNode(parent, "otherLiabilityMarketValueNode");
            otherLiabilityMarketValueNodeInjector.injectMembers(node);
            configureOtherLiabilityMarketValueNode(node);
            return node;
        }

    }
}
