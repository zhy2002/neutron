package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface ProductCustomerContributionNodeChildFactory {
    ContributionTypeNode createContributionTypeNode();
    ContributionDescriptionNode createContributionDescriptionNode();
    ContributionAmountNode createContributionAmountNode();
}

@Singleton
public class ProductCustomerContributionNodeChildProvider {
    @Inject
    MembersInjector<ContributionDescriptionNode> contributionDescriptionNodeInjector;
    @Inject
    MembersInjector<ContributionAmountNode> contributionAmountNodeInjector;
    @Inject
    MembersInjector<ContributionTypeNode> contributionTypeNodeInjector;

    @Inject
    protected ProductCustomerContributionNodeChildProvider () {}

    protected MembersInjector<ContributionDescriptionNode> getContributionDescriptionNodeInjector() {
        return this.contributionDescriptionNodeInjector;
    }

    protected MembersInjector<ContributionAmountNode> getContributionAmountNodeInjector() {
        return this.contributionAmountNodeInjector;
    }

    protected MembersInjector<ContributionTypeNode> getContributionTypeNodeInjector() {
        return this.contributionTypeNodeInjector;
    }

    protected ContributionTypeNode newContributionTypeNode(
        ProductCustomerContributionNode parent,
        String name
    ) {
        return new ContributionTypeNode(parent, name);
    }

    protected void configureContributionTypeNode(ContributionTypeNode node) {
    }

    @ComponentScope
    public static class ContributionTypeNodeRuleProvider implements RuleProvider<ContributionTypeNode> {

        @Inject
        public ContributionTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ContributionTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ContributionDescriptionNode newContributionDescriptionNode(
        ProductCustomerContributionNode parent,
        String name
    ) {
        return new ContributionDescriptionNode(parent, name);
    }

    protected void configureContributionDescriptionNode(ContributionDescriptionNode node) {
    }

    @ComponentScope
    public static class ContributionDescriptionNodeRuleProvider implements RuleProvider<ContributionDescriptionNode> {

        @Inject
        public ContributionDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(ContributionDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ContributionAmountNode newContributionAmountNode(
        ProductCustomerContributionNode parent,
        String name
    ) {
        return new ContributionAmountNode(parent, name);
    }

    protected void configureContributionAmountNode(ContributionAmountNode node) {
    }

    @ComponentScope
    public static class ContributionAmountNodeRuleProvider implements RuleProvider<ContributionAmountNode> {

        @Inject
        public ContributionAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(ContributionAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    ProductCustomerContributionNodeChildFactory createFactory(ProductCustomerContributionNode parent) {
        return new ProductCustomerContributionNodeChildFactoryImpl(parent);
    }

    private class ProductCustomerContributionNodeChildFactoryImpl implements ProductCustomerContributionNodeChildFactory {

        private final ProductCustomerContributionNode parent;
        
        private ProductCustomerContributionNodeChildFactoryImpl(ProductCustomerContributionNode parent) {
            this.parent = parent;
        }

        @Override
        public ContributionTypeNode createContributionTypeNode() {
            ContributionTypeNode node = newContributionTypeNode(parent, "contributionTypeNode");
            contributionTypeNodeInjector.injectMembers(node);
            configureContributionTypeNode(node);
            return node;
        }

        @Override
        public ContributionDescriptionNode createContributionDescriptionNode() {
            ContributionDescriptionNode node = newContributionDescriptionNode(parent, "contributionDescriptionNode");
            contributionDescriptionNodeInjector.injectMembers(node);
            configureContributionDescriptionNode(node);
            return node;
        }

        @Override
        public ContributionAmountNode createContributionAmountNode() {
            ContributionAmountNode node = newContributionAmountNode(parent, "contributionAmountNode");
            contributionAmountNodeInjector.injectMembers(node);
            configureContributionAmountNode(node);
            return node;
        }

    }
}
