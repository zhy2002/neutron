package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface EmployedNodeChildFactory {
    EmploymentStatusNode createEmploymentStatusNode();
    OccupationNode createOccupationNode();
    EmployerNameNode createEmployerNameNode();
    EmployerAddressNode createEmployerAddressNode();
    EmployerPhoneNode createEmployerPhoneNode();
    EmploymentStartedNode createEmploymentStartedNode();
    EmploymentEndedNode createEmploymentEndedNode();
}

@Singleton
public class EmployedNodeChildProvider {
    @Inject
    MembersInjector<EmploymentStatusNode> employmentStatusNodeInjector;
    @Inject
    MembersInjector<OccupationNode> occupationNodeInjector;
    @Inject
    MembersInjector<EmployerNameNode> employerNameNodeInjector;
    @Inject
    MembersInjector<EmployerAddressNode> employerAddressNodeInjector;
    @Inject
    MembersInjector<EmployerPhoneNode> employerPhoneNodeInjector;
    @Inject
    MembersInjector<EmploymentStartedNode> employmentStartedNodeInjector;
    @Inject
    MembersInjector<EmploymentEndedNode> employmentEndedNodeInjector;

    @Inject
    protected EmployedNodeChildProvider () {}

    protected MembersInjector<EmploymentStatusNode> getEmploymentStatusNodeInjector() {
        return this.employmentStatusNodeInjector;
    }

    protected MembersInjector<OccupationNode> getOccupationNodeInjector() {
        return this.occupationNodeInjector;
    }

    protected MembersInjector<EmployerNameNode> getEmployerNameNodeInjector() {
        return this.employerNameNodeInjector;
    }

    protected MembersInjector<EmployerAddressNode> getEmployerAddressNodeInjector() {
        return this.employerAddressNodeInjector;
    }

    protected MembersInjector<EmployerPhoneNode> getEmployerPhoneNodeInjector() {
        return this.employerPhoneNodeInjector;
    }

    protected MembersInjector<EmploymentStartedNode> getEmploymentStartedNodeInjector() {
        return this.employmentStartedNodeInjector;
    }

    protected MembersInjector<EmploymentEndedNode> getEmploymentEndedNodeInjector() {
        return this.employmentEndedNodeInjector;
    }

    protected EmploymentStatusNode newEmploymentStatusNode(
        EmployedNode parent,
        String name
    ) {
        return new EmploymentStatusNode(parent, name);
    }

    protected OccupationNode newOccupationNode(
        EmployedNode parent,
        String name
    ) {
        return new OccupationNode(parent, name);
    }

    protected EmployerNameNode newEmployerNameNode(
        EmployedNode parent,
        String name
    ) {
        return new EmployerNameNode(parent, name);
    }

    protected EmployerAddressNode newEmployerAddressNode(
        EmployedNode parent,
        String name
    ) {
        return new EmployerAddressNode(parent, name);
    }

    protected EmployerPhoneNode newEmployerPhoneNode(
        EmployedNode parent,
        String name
    ) {
        return new EmployerPhoneNode(parent, name);
    }

    protected EmploymentStartedNode newEmploymentStartedNode(
        EmployedNode parent,
        String name
    ) {
        return new EmploymentStartedNode(parent, name);
    }

    protected EmploymentEndedNode newEmploymentEndedNode(
        EmployedNode parent,
        String name
    ) {
        return new EmploymentEndedNode(parent, name);
    }

    EmployedNodeChildFactory createFactory(EmployedNode parent) {
        return new EmployedNodeChildFactoryImpl(parent);
    }

    private class EmployedNodeChildFactoryImpl implements EmployedNodeChildFactory {

        private final EmployedNode parent;
        
        private EmployedNodeChildFactoryImpl(EmployedNode parent) {
            this.parent = parent;
        }

        @Override
        public EmploymentStatusNode createEmploymentStatusNode() {
            EmploymentStatusNode node = newEmploymentStatusNode(parent, "employmentStatusNode");
            employmentStatusNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public OccupationNode createOccupationNode() {
            OccupationNode node = newOccupationNode(parent, "occupationNode");
            occupationNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public EmployerNameNode createEmployerNameNode() {
            EmployerNameNode node = newEmployerNameNode(parent, "employerNameNode");
            employerNameNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public EmployerAddressNode createEmployerAddressNode() {
            EmployerAddressNode node = newEmployerAddressNode(parent, "employerAddressNode");
            employerAddressNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public EmployerPhoneNode createEmployerPhoneNode() {
            EmployerPhoneNode node = newEmployerPhoneNode(parent, "employerPhoneNode");
            employerPhoneNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public EmploymentStartedNode createEmploymentStartedNode() {
            EmploymentStartedNode node = newEmploymentStartedNode(parent, "employmentStartedNode");
            employmentStartedNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public EmploymentEndedNode createEmploymentEndedNode() {
            EmploymentEndedNode node = newEmploymentEndedNode(parent, "employmentEndedNode");
            employmentEndedNodeInjector.injectMembers(node);
            return node;
        }

    }
}
