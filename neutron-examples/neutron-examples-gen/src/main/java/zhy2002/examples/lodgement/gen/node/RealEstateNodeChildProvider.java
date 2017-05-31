package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


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

    @ComponentScope
    public static class UsageNodeRuleProvider implements RuleProvider<UsageNode> {

        @Inject
        public UsageNodeRuleProvider() {

        }

        @Override
        public void initializeState(UsageNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PropertyNode newPropertyNode(
        RealEstateNode parent,
        String name
    ) {
        return new PropertyNode(parent, name);
    }

    protected void configurePropertyNode(PropertyNode node) {
    }

    @ComponentScope
    public static class PropertyNodeRuleProvider implements RuleProvider<PropertyNode> {

        @Inject
        public PropertyNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AccessNode newAccessNode(
        RealEstateNode parent,
        String name
    ) {
        return new AccessNode(parent, name);
    }

    protected void configureAccessNode(AccessNode node) {
    }

    @ComponentScope
    public static class AccessNodeRuleProvider implements RuleProvider<AccessNode> {

        @Inject
        public AccessNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
