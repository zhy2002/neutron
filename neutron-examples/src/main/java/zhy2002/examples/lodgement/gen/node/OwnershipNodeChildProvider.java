package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface OwnershipNodeChildFactory {
    ApplicantReferenceNode createApplicantReferenceNode();
    OwnershipPercentageNode createOwnershipPercentageNode();
    AverageFlagNode createAverageFlagNode();
}

@Singleton
public class OwnershipNodeChildProvider {
    @Inject
    MembersInjector<ApplicantReferenceNode> applicantReferenceNodeInjector;
    @Inject
    MembersInjector<AverageFlagNode> averageFlagNodeInjector;
    @Inject
    MembersInjector<OwnershipPercentageNode> ownershipPercentageNodeInjector;

    @Inject
    protected OwnershipNodeChildProvider () {}

    protected MembersInjector<ApplicantReferenceNode> getApplicantReferenceNodeInjector() {
        return this.applicantReferenceNodeInjector;
    }

    protected MembersInjector<AverageFlagNode> getAverageFlagNodeInjector() {
        return this.averageFlagNodeInjector;
    }

    protected MembersInjector<OwnershipPercentageNode> getOwnershipPercentageNodeInjector() {
        return this.ownershipPercentageNodeInjector;
    }

    protected ApplicantReferenceNode newApplicantReferenceNode(
        OwnershipNode parent,
        String name
    ) {
        return new ApplicantReferenceNode(parent, name);
    }

    protected void configureApplicantReferenceNode(ApplicantReferenceNode node) {
    }

    protected OwnershipPercentageNode newOwnershipPercentageNode(
        OwnershipNode parent,
        String name
    ) {
        return new OwnershipPercentageNode(parent, name);
    }

    protected void configureOwnershipPercentageNode(OwnershipPercentageNode node) {
    }

    protected AverageFlagNode newAverageFlagNode(
        OwnershipNode parent,
        String name
    ) {
        return new AverageFlagNode(parent, name);
    }

    protected void configureAverageFlagNode(AverageFlagNode node) {
    }

    OwnershipNodeChildFactory createFactory(OwnershipNode parent) {
        return new OwnershipNodeChildFactoryImpl(parent);
    }

    private class OwnershipNodeChildFactoryImpl implements OwnershipNodeChildFactory {

        private final OwnershipNode parent;
        
        private OwnershipNodeChildFactoryImpl(OwnershipNode parent) {
            this.parent = parent;
        }

        @Override
        public ApplicantReferenceNode createApplicantReferenceNode() {
            ApplicantReferenceNode node = newApplicantReferenceNode(parent, "applicantReferenceNode");
            applicantReferenceNodeInjector.injectMembers(node);
            configureApplicantReferenceNode(node);
            return node;
        }

        @Override
        public OwnershipPercentageNode createOwnershipPercentageNode() {
            OwnershipPercentageNode node = newOwnershipPercentageNode(parent, "ownershipPercentageNode");
            ownershipPercentageNodeInjector.injectMembers(node);
            configureOwnershipPercentageNode(node);
            return node;
        }

        @Override
        public AverageFlagNode createAverageFlagNode() {
            AverageFlagNode node = newAverageFlagNode(parent, "averageFlagNode");
            averageFlagNodeInjector.injectMembers(node);
            configureAverageFlagNode(node);
            return node;
        }

    }
}
