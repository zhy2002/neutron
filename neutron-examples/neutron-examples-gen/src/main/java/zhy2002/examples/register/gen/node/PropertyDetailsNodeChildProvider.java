package zhy2002.examples.register.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.register.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


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

    @ComponentScope
    public static class PropertyAddressNodeRuleProvider implements RuleProvider<PropertyAddressNode> {

        @Inject
        public PropertyAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PropertyStateNode newPropertyStateNode(
        PropertyDetailsNode parent,
        String name
    ) {
        return new PropertyStateNode(parent, name);
    }

    protected void configurePropertyStateNode(PropertyStateNode node) {
    }

    @ComponentScope
    public static class PropertyStateNodeRuleProvider implements RuleProvider<PropertyStateNode> {

        @Inject
        public PropertyStateNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyStateNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
