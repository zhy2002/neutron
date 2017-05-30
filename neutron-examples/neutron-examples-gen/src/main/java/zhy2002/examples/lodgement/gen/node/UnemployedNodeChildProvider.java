package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


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
    MembersInjector<UnemployedSinceNode> unemployedSinceNodeInjector;
    @Inject
    MembersInjector<StudentTypeNode> studentTypeNodeInjector;
    @Inject
    MembersInjector<HouseDutiesFlagNode> houseDutiesFlagNodeInjector;

    @Inject
    protected UnemployedNodeChildProvider () {}

    protected MembersInjector<UnemployedOnBenefitFlagNode> getUnemployedOnBenefitFlagNodeInjector() {
        return this.unemployedOnBenefitFlagNodeInjector;
    }

    protected MembersInjector<StudentFlagNode> getStudentFlagNodeInjector() {
        return this.studentFlagNodeInjector;
    }

    protected MembersInjector<UnemployedSinceNode> getUnemployedSinceNodeInjector() {
        return this.unemployedSinceNodeInjector;
    }

    protected MembersInjector<StudentTypeNode> getStudentTypeNodeInjector() {
        return this.studentTypeNodeInjector;
    }

    protected MembersInjector<HouseDutiesFlagNode> getHouseDutiesFlagNodeInjector() {
        return this.houseDutiesFlagNodeInjector;
    }

    protected UnemployedOnBenefitFlagNode newUnemployedOnBenefitFlagNode(
        UnemployedNode parent,
        String name
    ) {
        return new UnemployedOnBenefitFlagNode(parent, name);
    }

    protected void configureUnemployedOnBenefitFlagNode(UnemployedOnBenefitFlagNode node) {
    }

    @UnemployedOnBenefitFlagNodeScope
    public static class UnemployedOnBenefitFlagNodeRuleProvider implements RuleProvider<UnemployedOnBenefitFlagNode> {

        @Inject
        public UnemployedOnBenefitFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(UnemployedOnBenefitFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected StudentFlagNode newStudentFlagNode(
        UnemployedNode parent,
        String name
    ) {
        return new StudentFlagNode(parent, name);
    }

    protected void configureStudentFlagNode(StudentFlagNode node) {
    }

    @StudentFlagNodeScope
    public static class StudentFlagNodeRuleProvider implements RuleProvider<StudentFlagNode> {

        @Inject
        public StudentFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(StudentFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected StudentTypeNode newStudentTypeNode(
        UnemployedNode parent,
        String name
    ) {
        return new StudentTypeNode(parent, name);
    }

    protected void configureStudentTypeNode(StudentTypeNode node) {
    }

    @StudentTypeNodeScope
    public static class StudentTypeNodeRuleProvider implements RuleProvider<StudentTypeNode> {

        @Inject
        public StudentTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(StudentTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected HouseDutiesFlagNode newHouseDutiesFlagNode(
        UnemployedNode parent,
        String name
    ) {
        return new HouseDutiesFlagNode(parent, name);
    }

    protected void configureHouseDutiesFlagNode(HouseDutiesFlagNode node) {
    }

    @HouseDutiesFlagNodeScope
    public static class HouseDutiesFlagNodeRuleProvider implements RuleProvider<HouseDutiesFlagNode> {

        @Inject
        public HouseDutiesFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(HouseDutiesFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected UnemployedSinceNode newUnemployedSinceNode(
        UnemployedNode parent,
        String name
    ) {
        return new UnemployedSinceNode(parent, name);
    }

    protected void configureUnemployedSinceNode(UnemployedSinceNode node) {
    }

    @UnemployedSinceNodeScope
    public static class UnemployedSinceNodeRuleProvider implements RuleProvider<UnemployedSinceNode> {

        @Inject
        public UnemployedSinceNodeRuleProvider() {

        }

        @Override
        public void initializeState(UnemployedSinceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
            configureUnemployedOnBenefitFlagNode(node);
            return node;
        }

        @Override
        public StudentFlagNode createStudentFlagNode() {
            StudentFlagNode node = newStudentFlagNode(parent, "studentFlagNode");
            studentFlagNodeInjector.injectMembers(node);
            configureStudentFlagNode(node);
            return node;
        }

        @Override
        public StudentTypeNode createStudentTypeNode() {
            StudentTypeNode node = newStudentTypeNode(parent, "studentTypeNode");
            studentTypeNodeInjector.injectMembers(node);
            configureStudentTypeNode(node);
            return node;
        }

        @Override
        public HouseDutiesFlagNode createHouseDutiesFlagNode() {
            HouseDutiesFlagNode node = newHouseDutiesFlagNode(parent, "houseDutiesFlagNode");
            houseDutiesFlagNodeInjector.injectMembers(node);
            configureHouseDutiesFlagNode(node);
            return node;
        }

        @Override
        public UnemployedSinceNode createUnemployedSinceNode() {
            UnemployedSinceNode node = newUnemployedSinceNode(parent, "unemployedSinceNode");
            unemployedSinceNodeInjector.injectMembers(node);
            configureUnemployedSinceNode(node);
            return node;
        }

    }
}
