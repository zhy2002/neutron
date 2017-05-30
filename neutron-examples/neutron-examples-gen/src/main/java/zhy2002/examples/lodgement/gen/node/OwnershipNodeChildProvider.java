package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


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

    @ApplicantReferenceNodeScope
    public static class ApplicantReferenceNodeRuleProvider implements RuleProvider<ApplicantReferenceNode> {

        @Inject
        public ApplicantReferenceNodeRuleProvider() {

        }

        @Override
        public void initializeState(ApplicantReferenceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OwnershipPercentageNode newOwnershipPercentageNode(
        OwnershipNode parent,
        String name
    ) {
        return new OwnershipPercentageNode(parent, name);
    }

    protected void configureOwnershipPercentageNode(OwnershipPercentageNode node) {
    }

    @OwnershipPercentageNodeScope
    public static class OwnershipPercentageNodeRuleProvider implements RuleProvider<OwnershipPercentageNode> {

        @Inject
        public OwnershipPercentageNodeRuleProvider() {

        }

        @Override
        public void initializeState(OwnershipPercentageNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AverageFlagNode newAverageFlagNode(
        OwnershipNode parent,
        String name
    ) {
        return new AverageFlagNode(parent, name);
    }

    protected void configureAverageFlagNode(AverageFlagNode node) {
    }

    @AverageFlagNodeScope
    public static class AverageFlagNodeRuleProvider implements RuleProvider<AverageFlagNode> {

        @Inject
        public AverageFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(AverageFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
