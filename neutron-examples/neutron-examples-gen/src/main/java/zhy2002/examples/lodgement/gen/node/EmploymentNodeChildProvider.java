package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


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

    @EmploymentTypeNodeScope
    public static class EmploymentTypeNodeRuleProvider implements RuleProvider<EmploymentTypeNode> {

        @Inject
        public EmploymentTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmploymentTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PayeEmployedNode newPayeEmployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new PayeEmployedNode(parent, name);
    }

    protected void configurePayeEmployedNode(PayeEmployedNode node) {
    }

    @PayeEmployedNodeScope
    public static class PayeEmployedNodeRuleProvider implements RuleProvider<PayeEmployedNode> {

        @Inject
        public PayeEmployedNodeRuleProvider() {

        }

        @Override
        public void initializeState(PayeEmployedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SelfEmployedNode newSelfEmployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new SelfEmployedNode(parent, name);
    }

    protected void configureSelfEmployedNode(SelfEmployedNode node) {
    }

    @SelfEmployedNodeScope
    public static class SelfEmployedNodeRuleProvider implements RuleProvider<SelfEmployedNode> {

        @Inject
        public SelfEmployedNodeRuleProvider() {

        }

        @Override
        public void initializeState(SelfEmployedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected UnemployedNode newUnemployedNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new UnemployedNode(parent, name);
    }

    protected void configureUnemployedNode(UnemployedNode node) {
    }

    @UnemployedNodeScope
    public static class UnemployedNodeRuleProvider implements RuleProvider<UnemployedNode> {

        @Inject
        public UnemployedNodeRuleProvider() {

        }

        @Override
        public void initializeState(UnemployedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected RetiredEmploymentNode newRetiredEmploymentNode(
        EmploymentNode<?> parent,
        String name
    ) {
        return new RetiredEmploymentNode(parent, name);
    }

    protected void configureRetiredEmploymentNode(RetiredEmploymentNode node) {
    }

    @RetiredEmploymentNodeScope
    public static class RetiredEmploymentNodeRuleProvider implements RuleProvider<RetiredEmploymentNode> {

        @Inject
        public RetiredEmploymentNodeRuleProvider() {

        }

        @Override
        public void initializeState(RetiredEmploymentNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
