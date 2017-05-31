package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface ProductFeeNodeChildFactory {
    FeeTypeNode createFeeTypeNode();
    FeeDescriptionNode createFeeDescriptionNode();
    FeePayFromNode createFeePayFromNode();
    FeeAmountNode createFeeAmountNode();
}

@Singleton
public class ProductFeeNodeChildProvider {
    @Inject
    MembersInjector<FeeAmountNode> feeAmountNodeInjector;
    @Inject
    MembersInjector<FeePayFromNode> feePayFromNodeInjector;
    @Inject
    MembersInjector<FeeTypeNode> feeTypeNodeInjector;
    @Inject
    MembersInjector<FeeDescriptionNode> feeDescriptionNodeInjector;

    @Inject
    protected ProductFeeNodeChildProvider () {}

    protected MembersInjector<FeeAmountNode> getFeeAmountNodeInjector() {
        return this.feeAmountNodeInjector;
    }

    protected MembersInjector<FeePayFromNode> getFeePayFromNodeInjector() {
        return this.feePayFromNodeInjector;
    }

    protected MembersInjector<FeeTypeNode> getFeeTypeNodeInjector() {
        return this.feeTypeNodeInjector;
    }

    protected MembersInjector<FeeDescriptionNode> getFeeDescriptionNodeInjector() {
        return this.feeDescriptionNodeInjector;
    }

    protected FeeTypeNode newFeeTypeNode(
        ProductFeeNode parent,
        String name
    ) {
        return new FeeTypeNode(parent, name);
    }

    protected void configureFeeTypeNode(FeeTypeNode node) {
    }

    @ComponentScope
    public static class FeeTypeNodeRuleProvider implements RuleProvider<FeeTypeNode> {

        @Inject
        public FeeTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(FeeTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected FeeDescriptionNode newFeeDescriptionNode(
        ProductFeeNode parent,
        String name
    ) {
        return new FeeDescriptionNode(parent, name);
    }

    protected void configureFeeDescriptionNode(FeeDescriptionNode node) {
    }

    @ComponentScope
    public static class FeeDescriptionNodeRuleProvider implements RuleProvider<FeeDescriptionNode> {

        @Inject
        public FeeDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(FeeDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected FeePayFromNode newFeePayFromNode(
        ProductFeeNode parent,
        String name
    ) {
        return new FeePayFromNode(parent, name);
    }

    protected void configureFeePayFromNode(FeePayFromNode node) {
    }

    @ComponentScope
    public static class FeePayFromNodeRuleProvider implements RuleProvider<FeePayFromNode> {

        @Inject
        public FeePayFromNodeRuleProvider() {

        }

        @Override
        public void initializeState(FeePayFromNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected FeeAmountNode newFeeAmountNode(
        ProductFeeNode parent,
        String name
    ) {
        return new FeeAmountNode(parent, name);
    }

    protected void configureFeeAmountNode(FeeAmountNode node) {
    }

    @ComponentScope
    public static class FeeAmountNodeRuleProvider implements RuleProvider<FeeAmountNode> {

        @Inject
        public FeeAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(FeeAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    ProductFeeNodeChildFactory createFactory(ProductFeeNode parent) {
        return new ProductFeeNodeChildFactoryImpl(parent);
    }

    private class ProductFeeNodeChildFactoryImpl implements ProductFeeNodeChildFactory {

        private final ProductFeeNode parent;
        
        private ProductFeeNodeChildFactoryImpl(ProductFeeNode parent) {
            this.parent = parent;
        }

        @Override
        public FeeTypeNode createFeeTypeNode() {
            FeeTypeNode node = newFeeTypeNode(parent, "feeTypeNode");
            feeTypeNodeInjector.injectMembers(node);
            configureFeeTypeNode(node);
            return node;
        }

        @Override
        public FeeDescriptionNode createFeeDescriptionNode() {
            FeeDescriptionNode node = newFeeDescriptionNode(parent, "feeDescriptionNode");
            feeDescriptionNodeInjector.injectMembers(node);
            configureFeeDescriptionNode(node);
            return node;
        }

        @Override
        public FeePayFromNode createFeePayFromNode() {
            FeePayFromNode node = newFeePayFromNode(parent, "feePayFromNode");
            feePayFromNodeInjector.injectMembers(node);
            configureFeePayFromNode(node);
            return node;
        }

        @Override
        public FeeAmountNode createFeeAmountNode() {
            FeeAmountNode node = newFeeAmountNode(parent, "feeAmountNode");
            feeAmountNodeInjector.injectMembers(node);
            configureFeeAmountNode(node);
            return node;
        }

    }
}
