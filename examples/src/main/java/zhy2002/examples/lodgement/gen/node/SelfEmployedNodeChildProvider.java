package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


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

    protected ProfitThisYearNode newProfitThisYearNode(
        SelfEmployedNode parent,
        String name
    ) {
        return new ProfitThisYearNode(parent, name);
    }

    protected void configureProfitThisYearNode(ProfitThisYearNode node) {
    }

    protected ProfitPreviousYearNode newProfitPreviousYearNode(
        SelfEmployedNode parent,
        String name
    ) {
        return new ProfitPreviousYearNode(parent, name);
    }

    protected void configureProfitPreviousYearNode(ProfitPreviousYearNode node) {
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
