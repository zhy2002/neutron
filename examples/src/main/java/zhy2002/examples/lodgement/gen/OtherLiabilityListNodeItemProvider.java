package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface OtherLiabilityListNodeItemFactory {
    OtherLiabilityNode createOtherLiabilityNode(String name);
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

    OtherLiabilityListNodeItemFactory createFactory(OtherLiabilityListNode parent) {
        return new OtherLiabilityListNodeItemFactoryImpl(parent);
    }

    private class OtherLiabilityListNodeItemFactoryImpl implements OtherLiabilityListNodeItemFactory {

        private final OtherLiabilityListNode parent;
        
        private OtherLiabilityListNodeItemFactoryImpl(OtherLiabilityListNode parent) {
            this.parent = parent;
        }

        @Override
        public OtherLiabilityNode createOtherLiabilityNode(String name) {
            OtherLiabilityNode node = newOtherLiabilityNode(parent, name);
            otherLiabilityNodeInjector.injectMembers(node);
            configureOtherLiabilityNode(node);
            return node;
        }

    }
}
