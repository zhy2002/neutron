package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


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
