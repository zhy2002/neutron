package zhy2002.examples.lodgement.gen;

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
    MembersInjector<EmploymentTypeNode> employmentTypeNodeInjector;
    @Inject
    MembersInjector<PayeEmployedNode> payeEmployedNodeInjector;
    @Inject
    MembersInjector<SelfEmployedNode> selfEmployedNodeInjector;
    @Inject
    MembersInjector<EmployedNode> employedNodeInjector;
    @Inject
    MembersInjector<UnemployedNode> unemployedNodeInjector;
    @Inject
    MembersInjector<RetiredEmploymentNode> retiredEmploymentNodeInjector;

    @Inject
    protected EmploymentNodeChildProvider () {}

    protected MembersInjector<EmploymentTypeNode> getEmploymentTypeNodeInjector() {
        return this.employmentTypeNodeInjector;
    }

    protected MembersInjector<PayeEmployedNode> getPayeEmployedNodeInjector() {
        return this.payeEmployedNodeInjector;
    }

    protected MembersInjector<SelfEmployedNode> getSelfEmployedNodeInjector() {
        return this.selfEmployedNodeInjector;
    }

    protected MembersInjector<EmployedNode> getEmployedNodeInjector() {
        return this.employedNodeInjector;
    }

    protected MembersInjector<UnemployedNode> getUnemployedNodeInjector() {
        return this.unemployedNodeInjector;
    }

    protected MembersInjector<RetiredEmploymentNode> getRetiredEmploymentNodeInjector() {
        return this.retiredEmploymentNodeInjector;
    }

    protected EmploymentTypeNode newEmploymentTypeNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new EmploymentTypeNode(parent, name);
    }

    protected PayeEmployedNode newPayeEmployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new PayeEmployedNode(parent, name);
    }

    protected SelfEmployedNode newSelfEmployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new SelfEmployedNode(parent, name);
    }

    protected UnemployedNode newUnemployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new UnemployedNode(parent, name);
    }

    protected RetiredEmploymentNode newRetiredEmploymentNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new RetiredEmploymentNode(parent, name);
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
            return node;
        }

        @Override
        public PayeEmployedNode createPayeEmployedNode() {
            PayeEmployedNode node = newPayeEmployedNode(parent, "payeEmployedNode");
            payeEmployedNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public SelfEmployedNode createSelfEmployedNode() {
            SelfEmployedNode node = newSelfEmployedNode(parent, "selfEmployedNode");
            selfEmployedNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public UnemployedNode createUnemployedNode() {
            UnemployedNode node = newUnemployedNode(parent, "unemployedNode");
            unemployedNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public RetiredEmploymentNode createRetiredEmploymentNode() {
            RetiredEmploymentNode node = newRetiredEmploymentNode(parent, "retiredEmploymentNode");
            retiredEmploymentNodeInjector.injectMembers(node);
            return node;
        }

    }
}
