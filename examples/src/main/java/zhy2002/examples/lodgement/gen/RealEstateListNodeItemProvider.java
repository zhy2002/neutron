package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface RealEstateListNodeItemFactory {
    RealEstateNode createRealEstateNode(String name);
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

    RealEstateListNodeItemFactory createFactory(RealEstateListNode parent) {
        return new RealEstateListNodeItemFactoryImpl(parent);
    }

    private class RealEstateListNodeItemFactoryImpl implements RealEstateListNodeItemFactory {

        private final RealEstateListNode parent;
        
        private RealEstateListNodeItemFactoryImpl(RealEstateListNode parent) {
            this.parent = parent;
        }

        @Override
        public RealEstateNode createRealEstateNode(String name) {
            RealEstateNode node = newRealEstateNode(parent, name);
            realEstateNodeInjector.injectMembers(node);
            return node;
        }

    }
}
