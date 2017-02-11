package zhy2002.examples.register.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PropertyDetailsNodeChildFactory {
    PropertyAddressNode createPropertyAddressNode();
    PropertyStateNode createPropertyStateNode();
}

@Singleton
public class PropertyDetailsNodeChildProvider {
    @Inject
    MembersInjector<PropertyAddressNode> propertyAddressNodeInjector;
    @Inject
    MembersInjector<PropertyStateNode> propertyStateNodeInjector;

    @Inject
    protected PropertyDetailsNodeChildProvider () {}

    protected MembersInjector<PropertyAddressNode> getPropertyAddressNodeInjector() {
        return this.propertyAddressNodeInjector;
    }

    protected MembersInjector<PropertyStateNode> getPropertyStateNodeInjector() {
        return this.propertyStateNodeInjector;
    }

    protected PropertyAddressNode newPropertyAddressNode(
        PropertyDetailsNode parent,
        String name
    ) {
        return new PropertyAddressNode(parent, name);
    }

    protected void configurePropertyAddressNode(PropertyAddressNode node) {
    }

    protected PropertyStateNode newPropertyStateNode(
        PropertyDetailsNode parent,
        String name
    ) {
        return new PropertyStateNode(parent, name);
    }

    protected void configurePropertyStateNode(PropertyStateNode node) {
    }

    PropertyDetailsNodeChildFactory createFactory(PropertyDetailsNode parent) {
        return new PropertyDetailsNodeChildFactoryImpl(parent);
    }

    private class PropertyDetailsNodeChildFactoryImpl implements PropertyDetailsNodeChildFactory {

        private final PropertyDetailsNode parent;
        
        private PropertyDetailsNodeChildFactoryImpl(PropertyDetailsNode parent) {
            this.parent = parent;
        }

        @Override
        public PropertyAddressNode createPropertyAddressNode() {
            PropertyAddressNode node = newPropertyAddressNode(parent, "propertyAddressNode");
            propertyAddressNodeInjector.injectMembers(node);
            configurePropertyAddressNode(node);
            return node;
        }

        @Override
        public PropertyStateNode createPropertyStateNode() {
            PropertyStateNode node = newPropertyStateNode(parent, "propertyStateNode");
            propertyStateNodeInjector.injectMembers(node);
            configurePropertyStateNode(node);
            return node;
        }

    }
}
