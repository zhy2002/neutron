package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface SelfEmployedNodeChildFactory {
    BusinessTypeNode createBusinessTypeNode();
    ProfitThisYearNode createProfitThisYearNode();
    ProfitPreviousYearNode createProfitPreviousYearNode();
}

@Singleton
public class SelfEmployedNodeChildProvider {
    @Inject
    MembersInjector<ProfitPreviousYearNode> profitPreviousYearNodeInjector;
    @Inject
    MembersInjector<BusinessTypeNode> businessTypeNodeInjector;
    @Inject
    MembersInjector<ProfitThisYearNode> profitThisYearNodeInjector;

    @Inject
    protected SelfEmployedNodeChildProvider () {}

    protected MembersInjector<ProfitPreviousYearNode> getProfitPreviousYearNodeInjector() {
        return this.profitPreviousYearNodeInjector;
    }

    protected MembersInjector<BusinessTypeNode> getBusinessTypeNodeInjector() {
        return this.businessTypeNodeInjector;
    }

    protected MembersInjector<ProfitThisYearNode> getProfitThisYearNodeInjector() {
        return this.profitThisYearNodeInjector;
    }

    protected BusinessTypeNode newBusinessTypeNode(
        SelfEmployedNode parent,
        String name
    ) {
        return new BusinessTypeNode(parent, name);
    }

    protected void configureBusinessTypeNode(BusinessTypeNode node) {
    }

    @ComponentScope
    public static class BusinessTypeNodeRuleProvider implements RuleProvider<BusinessTypeNode> {

        @Inject
        public BusinessTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(BusinessTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProfitThisYearNode newProfitThisYearNode(
        SelfEmployedNode parent,
        String name
    ) {
        return new ProfitThisYearNode(parent, name);
    }

    protected void configureProfitThisYearNode(ProfitThisYearNode node) {
    }

    @ComponentScope
    public static class ProfitThisYearNodeRuleProvider implements RuleProvider<ProfitThisYearNode> {

        @Inject
        public ProfitThisYearNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProfitThisYearNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProfitPreviousYearNode newProfitPreviousYearNode(
        SelfEmployedNode parent,
        String name
    ) {
        return new ProfitPreviousYearNode(parent, name);
    }

    protected void configureProfitPreviousYearNode(ProfitPreviousYearNode node) {
    }

    @ComponentScope
    public static class ProfitPreviousYearNodeRuleProvider implements RuleProvider<ProfitPreviousYearNode> {

        @Inject
        public ProfitPreviousYearNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProfitPreviousYearNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    SelfEmployedNodeChildFactory createFactory(SelfEmployedNode parent) {
        return new SelfEmployedNodeChildFactoryImpl(parent);
    }

    private class SelfEmployedNodeChildFactoryImpl implements SelfEmployedNodeChildFactory {

        private final SelfEmployedNode parent;
        
        private SelfEmployedNodeChildFactoryImpl(SelfEmployedNode parent) {
            this.parent = parent;
        }

        @Override
        public BusinessTypeNode createBusinessTypeNode() {
            BusinessTypeNode node = newBusinessTypeNode(parent, "businessTypeNode");
            businessTypeNodeInjector.injectMembers(node);
            configureBusinessTypeNode(node);
            return node;
        }

        @Override
        public ProfitThisYearNode createProfitThisYearNode() {
            ProfitThisYearNode node = newProfitThisYearNode(parent, "profitThisYearNode");
            profitThisYearNodeInjector.injectMembers(node);
            configureProfitThisYearNode(node);
            return node;
        }

        @Override
        public ProfitPreviousYearNode createProfitPreviousYearNode() {
            ProfitPreviousYearNode node = newProfitPreviousYearNode(parent, "profitPreviousYearNode");
            profitPreviousYearNodeInjector.injectMembers(node);
            configureProfitPreviousYearNode(node);
            return node;
        }

    }
}
