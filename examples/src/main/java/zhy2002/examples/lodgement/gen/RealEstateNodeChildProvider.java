package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface RealEstateNodeChildFactory {
    UsageNode createUsageNode();
    PropertyNode createPropertyNode();
    AccessNode createAccessNode();
}

@Singleton
public class RealEstateNodeChildProvider {
    @Inject
    MembersInjector<PropertyNode> propertyNodeInjector;
    @Inject
    MembersInjector<UsageNode> usageNodeInjector;
    @Inject
    MembersInjector<AccessNode> accessNodeInjector;

    @Inject
    protected RealEstateNodeChildProvider () {}

    protected MembersInjector<PropertyNode> getPropertyNodeInjector() {
        return this.propertyNodeInjector;
    }

    protected MembersInjector<UsageNode> getUsageNodeInjector() {
        return this.usageNodeInjector;
    }

    protected MembersInjector<AccessNode> getAccessNodeInjector() {
        return this.accessNodeInjector;
    }

    protected UsageNode newUsageNode(
        RealEstateNode parent,
        String name
    ) {
        return new UsageNode(parent, name);
    }

    protected void configureUsageNode(UsageNode node) {
    }

    protected PropertyNode newPropertyNode(
        RealEstateNode parent,
        String name
    ) {
        return new PropertyNode(parent, name);
    }

    protected void configurePropertyNode(PropertyNode node) {
    }

    protected AccessNode newAccessNode(
        RealEstateNode parent,
        String name
    ) {
        return new AccessNode(parent, name);
    }

    protected void configureAccessNode(AccessNode node) {
    }

    RealEstateNodeChildFactory createFactory(RealEstateNode parent) {
        return new RealEstateNodeChildFactoryImpl(parent);
    }

    private class RealEstateNodeChildFactoryImpl implements RealEstateNodeChildFactory {

        private final RealEstateNode parent;
        
        private RealEstateNodeChildFactoryImpl(RealEstateNode parent) {
            this.parent = parent;
        }

        @Override
        public UsageNode createUsageNode() {
            UsageNode node = newUsageNode(parent, "usageNode");
            usageNodeInjector.injectMembers(node);
            configureUsageNode(node);
            return node;
        }

        @Override
        public PropertyNode createPropertyNode() {
            PropertyNode node = newPropertyNode(parent, "propertyNode");
            propertyNodeInjector.injectMembers(node);
            configurePropertyNode(node);
            return node;
        }

        @Override
        public AccessNode createAccessNode() {
            AccessNode node = newAccessNode(parent, "accessNode");
            accessNodeInjector.injectMembers(node);
            configureAccessNode(node);
            return node;
        }

    }
}
