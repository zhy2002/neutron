package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface PayeEmployedNodeChildFactory {
    GrossYearlySalaryNode createGrossYearlySalaryNode();
}

@Singleton
public class PayeEmployedNodeChildProvider {
    @Inject
    MembersInjector<GrossYearlySalaryNode> grossYearlySalaryNodeInjector;

    @Inject
    protected PayeEmployedNodeChildProvider () {}

    protected MembersInjector<GrossYearlySalaryNode> getGrossYearlySalaryNodeInjector() {
        return this.grossYearlySalaryNodeInjector;
    }

    protected GrossYearlySalaryNode newGrossYearlySalaryNode(
        PayeEmployedNode parent,
        String name
    ) {
        return new GrossYearlySalaryNode(parent, name);
    }

    protected void configureGrossYearlySalaryNode(GrossYearlySalaryNode node) {
    }

    @ComponentScope
    public static class GrossYearlySalaryNodeRuleProvider implements RuleProvider<GrossYearlySalaryNode> {

        @Inject
        public GrossYearlySalaryNodeRuleProvider() {

        }

        @Override
        public void initializeState(GrossYearlySalaryNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    PayeEmployedNodeChildFactory createFactory(PayeEmployedNode parent) {
        return new PayeEmployedNodeChildFactoryImpl(parent);
    }

    private class PayeEmployedNodeChildFactoryImpl implements PayeEmployedNodeChildFactory {

        private final PayeEmployedNode parent;
        
        private PayeEmployedNodeChildFactoryImpl(PayeEmployedNode parent) {
            this.parent = parent;
        }

        @Override
        public GrossYearlySalaryNode createGrossYearlySalaryNode() {
            GrossYearlySalaryNode node = newGrossYearlySalaryNode(parent, "grossYearlySalaryNode");
            grossYearlySalaryNodeInjector.injectMembers(node);
            configureGrossYearlySalaryNode(node);
            return node;
        }

    }
}
