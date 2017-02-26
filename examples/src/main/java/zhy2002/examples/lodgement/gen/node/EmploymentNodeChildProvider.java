package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface EmploymentNodeChildFactory {
    EmploymentTypeNode createEmploymentTypeNode();
    PayeEmployedNode createPayeEmployedNode();
    SelfEmployedNode createSelfEmployedNode();
    UnemployedNode createUnemployedNode();
    RetiredEmploymentNode createRetiredEmploymentNode();
}

@Singleton
public class EmploymentNodeChildProvider {
    @Inject
    MembersInjector<UnemployedNode> unemployedNodeInjector;
    @Inject
    MembersInjector<RetiredEmploymentNode> retiredEmploymentNodeInjector;
    @Inject
    MembersInjector<PayeEmployedNode> payeEmployedNodeInjector;
    @Inject
    MembersInjector<EmployedNode> employedNodeInjector;
    @Inject
    MembersInjector<SelfEmployedNode> selfEmployedNodeInjector;
    @Inject
    MembersInjector<EmploymentTypeNode> employmentTypeNodeInjector;

    @Inject
    protected EmploymentNodeChildProvider () {}

    protected MembersInjector<UnemployedNode> getUnemployedNodeInjector() {
        return this.unemployedNodeInjector;
    }

    protected MembersInjector<RetiredEmploymentNode> getRetiredEmploymentNodeInjector() {
        return this.retiredEmploymentNodeInjector;
    }

    protected MembersInjector<PayeEmployedNode> getPayeEmployedNodeInjector() {
        return this.payeEmployedNodeInjector;
    }

    protected MembersInjector<EmployedNode> getEmployedNodeInjector() {
        return this.employedNodeInjector;
    }

    protected MembersInjector<SelfEmployedNode> getSelfEmployedNodeInjector() {
        return this.selfEmployedNodeInjector;
    }

    protected MembersInjector<EmploymentTypeNode> getEmploymentTypeNodeInjector() {
        return this.employmentTypeNodeInjector;
    }

    protected EmploymentTypeNode newEmploymentTypeNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new EmploymentTypeNode(parent, name);
    }

    protected void configureEmploymentTypeNode(EmploymentTypeNode node) {
    }

    protected PayeEmployedNode newPayeEmployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new PayeEmployedNode(parent, name);
    }

    protected void configurePayeEmployedNode(PayeEmployedNode node) {
    }

    protected SelfEmployedNode newSelfEmployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new SelfEmployedNode(parent, name);
    }

    protected void configureSelfEmployedNode(SelfEmployedNode node) {
    }

    protected UnemployedNode newUnemployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new UnemployedNode(parent, name);
    }

    protected void configureUnemployedNode(UnemployedNode node) {
    }

    protected RetiredEmploymentNode newRetiredEmploymentNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new RetiredEmploymentNode(parent, name);
    }

    protected void configureRetiredEmploymentNode(RetiredEmploymentNode node) {
    }

    EmploymentNodeChildFactory createFactory(EmploymentNode<?> parent) {
        return new EmploymentNodeChildFactoryImpl(parent);
    }

    private class EmploymentNodeChildFactoryImpl implements EmploymentNodeChildFactory {

        private final EmploymentNode<?> parent;
        
        private EmploymentNodeChildFactoryImpl(EmploymentNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public EmploymentTypeNode createEmploymentTypeNode() {
            EmploymentTypeNode node = newEmploymentTypeNode(parent, "employmentTypeNode");
            employmentTypeNodeInjector.injectMembers(node);
            configureEmploymentTypeNode(node);
            return node;
        }

        @Override
        public PayeEmployedNode createPayeEmployedNode() {
            PayeEmployedNode node = newPayeEmployedNode(parent, "payeEmployedNode");
            payeEmployedNodeInjector.injectMembers(node);
            configurePayeEmployedNode(node);
            return node;
        }

        @Override
        public SelfEmployedNode createSelfEmployedNode() {
            SelfEmployedNode node = newSelfEmployedNode(parent, "selfEmployedNode");
            selfEmployedNodeInjector.injectMembers(node);
            configureSelfEmployedNode(node);
            return node;
        }

        @Override
        public UnemployedNode createUnemployedNode() {
            UnemployedNode node = newUnemployedNode(parent, "unemployedNode");
            unemployedNodeInjector.injectMembers(node);
            configureUnemployedNode(node);
            return node;
        }

        @Override
        public RetiredEmploymentNode createRetiredEmploymentNode() {
            RetiredEmploymentNode node = newRetiredEmploymentNode(parent, "retiredEmploymentNode");
            retiredEmploymentNodeInjector.injectMembers(node);
            configureRetiredEmploymentNode(node);
            return node;
        }

    }
}
