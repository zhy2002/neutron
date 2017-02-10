package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface UnemployedNodeChildFactory {
    UnemployedOnBenefitFlagNode createUnemployedOnBenefitFlagNode();
    StudentFlagNode createStudentFlagNode();
    StudentTypeNode createStudentTypeNode();
    HouseDutiesFlagNode createHouseDutiesFlagNode();
    UnemployedSinceNode createUnemployedSinceNode();
}

@Singleton
public class UnemployedNodeChildProvider {
    @Inject
    MembersInjector<UnemployedOnBenefitFlagNode> unemployedOnBenefitFlagNodeInjector;
    @Inject
    MembersInjector<StudentFlagNode> studentFlagNodeInjector;
    @Inject
    MembersInjector<StudentTypeNode> studentTypeNodeInjector;
    @Inject
    MembersInjector<HouseDutiesFlagNode> houseDutiesFlagNodeInjector;
    @Inject
    MembersInjector<UnemployedSinceNode> unemployedSinceNodeInjector;

    @Inject
    protected UnemployedNodeChildProvider () {}

    protected MembersInjector<UnemployedOnBenefitFlagNode> getUnemployedOnBenefitFlagNodeInjector() {
        return this.unemployedOnBenefitFlagNodeInjector;
    }

    protected MembersInjector<StudentFlagNode> getStudentFlagNodeInjector() {
        return this.studentFlagNodeInjector;
    }

    protected MembersInjector<StudentTypeNode> getStudentTypeNodeInjector() {
        return this.studentTypeNodeInjector;
    }

    protected MembersInjector<HouseDutiesFlagNode> getHouseDutiesFlagNodeInjector() {
        return this.houseDutiesFlagNodeInjector;
    }

    protected MembersInjector<UnemployedSinceNode> getUnemployedSinceNodeInjector() {
        return this.unemployedSinceNodeInjector;
    }

    protected UnemployedOnBenefitFlagNode newUnemployedOnBenefitFlagNode(
        UnemployedNode parent,
        String name
    ) {
        return new UnemployedOnBenefitFlagNode(parent, name);
    }

    protected StudentFlagNode newStudentFlagNode(
        UnemployedNode parent,
        String name
    ) {
        return new StudentFlagNode(parent, name);
    }

    protected StudentTypeNode newStudentTypeNode(
        UnemployedNode parent,
        String name
    ) {
        return new StudentTypeNode(parent, name);
    }

    protected HouseDutiesFlagNode newHouseDutiesFlagNode(
        UnemployedNode parent,
        String name
    ) {
        return new HouseDutiesFlagNode(parent, name);
    }

    protected UnemployedSinceNode newUnemployedSinceNode(
        UnemployedNode parent,
        String name
    ) {
        return new UnemployedSinceNode(parent, name);
    }

    UnemployedNodeChildFactory createFactory(UnemployedNode parent) {
        return new UnemployedNodeChildFactoryImpl(parent);
    }

    private class UnemployedNodeChildFactoryImpl implements UnemployedNodeChildFactory {

        private final UnemployedNode parent;
        
        private UnemployedNodeChildFactoryImpl(UnemployedNode parent) {
            this.parent = parent;
        }

        @Override
        public UnemployedOnBenefitFlagNode createUnemployedOnBenefitFlagNode() {
            UnemployedOnBenefitFlagNode node = newUnemployedOnBenefitFlagNode(parent, "unemployedOnBenefitFlagNode");
            unemployedOnBenefitFlagNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public StudentFlagNode createStudentFlagNode() {
            StudentFlagNode node = newStudentFlagNode(parent, "studentFlagNode");
            studentFlagNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public StudentTypeNode createStudentTypeNode() {
            StudentTypeNode node = newStudentTypeNode(parent, "studentTypeNode");
            studentTypeNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public HouseDutiesFlagNode createHouseDutiesFlagNode() {
            HouseDutiesFlagNode node = newHouseDutiesFlagNode(parent, "houseDutiesFlagNode");
            houseDutiesFlagNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public UnemployedSinceNode createUnemployedSinceNode() {
            UnemployedSinceNode node = newUnemployedSinceNode(parent, "unemployedSinceNode");
            unemployedSinceNodeInjector.injectMembers(node);
            return node;
        }

    }
}
