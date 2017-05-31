package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface CreditCardNodeChildFactory {
    CreditCardTypeNode createCreditCardTypeNode();
    CreditCardAmountOwingNode createCreditCardAmountOwingNode();
    CreditCardLimitAmountNode createCreditCardLimitAmountNode();
    CreditCardMonthlyRepaymentNode createCreditCardMonthlyRepaymentNode();
    CreditCardClearingFlagNode createCreditCardClearingFlagNode();
    CreditCardBreakCostNode createCreditCardBreakCostNode();
    CreditCardLenderNameNode createCreditCardLenderNameNode();
    CreditCardOwnershipListNode createOwnershipListNode();
}

@Singleton
public class CreditCardNodeChildProvider {
    @Inject
    MembersInjector<CreditCardLenderNameNode> creditCardLenderNameNodeInjector;
    @Inject
    MembersInjector<CreditCardMonthlyRepaymentNode> creditCardMonthlyRepaymentNodeInjector;
    @Inject
    MembersInjector<CreditCardAmountOwingNode> creditCardAmountOwingNodeInjector;
    @Inject
    MembersInjector<CreditCardOwnershipListNode> creditCardOwnershipListNodeInjector;
    @Inject
    MembersInjector<CreditCardLimitAmountNode> creditCardLimitAmountNodeInjector;
    @Inject
    MembersInjector<CreditCardTypeNode> creditCardTypeNodeInjector;
    @Inject
    MembersInjector<CreditCardClearingFlagNode> creditCardClearingFlagNodeInjector;
    @Inject
    MembersInjector<CreditCardBreakCostNode> creditCardBreakCostNodeInjector;

    @Inject
    protected CreditCardNodeChildProvider () {}

    protected MembersInjector<CreditCardLenderNameNode> getCreditCardLenderNameNodeInjector() {
        return this.creditCardLenderNameNodeInjector;
    }

    protected MembersInjector<CreditCardMonthlyRepaymentNode> getCreditCardMonthlyRepaymentNodeInjector() {
        return this.creditCardMonthlyRepaymentNodeInjector;
    }

    protected MembersInjector<CreditCardAmountOwingNode> getCreditCardAmountOwingNodeInjector() {
        return this.creditCardAmountOwingNodeInjector;
    }

    protected MembersInjector<CreditCardOwnershipListNode> getCreditCardOwnershipListNodeInjector() {
        return this.creditCardOwnershipListNodeInjector;
    }

    protected MembersInjector<CreditCardLimitAmountNode> getCreditCardLimitAmountNodeInjector() {
        return this.creditCardLimitAmountNodeInjector;
    }

    protected MembersInjector<CreditCardTypeNode> getCreditCardTypeNodeInjector() {
        return this.creditCardTypeNodeInjector;
    }

    protected MembersInjector<CreditCardClearingFlagNode> getCreditCardClearingFlagNodeInjector() {
        return this.creditCardClearingFlagNodeInjector;
    }

    protected MembersInjector<CreditCardBreakCostNode> getCreditCardBreakCostNodeInjector() {
        return this.creditCardBreakCostNodeInjector;
    }

    protected CreditCardTypeNode newCreditCardTypeNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardTypeNode(parent, name);
    }

    protected void configureCreditCardTypeNode(CreditCardTypeNode node) {
    }

    @ComponentScope
    public static class CreditCardTypeNodeRuleProvider implements RuleProvider<CreditCardTypeNode> {

        @Inject
        public CreditCardTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CreditCardAmountOwingNode newCreditCardAmountOwingNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardAmountOwingNode(parent, name);
    }

    protected void configureCreditCardAmountOwingNode(CreditCardAmountOwingNode node) {
    }

    @ComponentScope
    public static class CreditCardAmountOwingNodeRuleProvider implements RuleProvider<CreditCardAmountOwingNode> {

        @Inject
        public CreditCardAmountOwingNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardAmountOwingNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CreditCardLimitAmountNode newCreditCardLimitAmountNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardLimitAmountNode(parent, name);
    }

    protected void configureCreditCardLimitAmountNode(CreditCardLimitAmountNode node) {
    }

    @ComponentScope
    public static class CreditCardLimitAmountNodeRuleProvider implements RuleProvider<CreditCardLimitAmountNode> {

        @Inject
        public CreditCardLimitAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardLimitAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CreditCardMonthlyRepaymentNode newCreditCardMonthlyRepaymentNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardMonthlyRepaymentNode(parent, name);
    }

    protected void configureCreditCardMonthlyRepaymentNode(CreditCardMonthlyRepaymentNode node) {
    }

    @ComponentScope
    public static class CreditCardMonthlyRepaymentNodeRuleProvider implements RuleProvider<CreditCardMonthlyRepaymentNode> {

        @Inject
        public CreditCardMonthlyRepaymentNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardMonthlyRepaymentNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CreditCardClearingFlagNode newCreditCardClearingFlagNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardClearingFlagNode(parent, name);
    }

    protected void configureCreditCardClearingFlagNode(CreditCardClearingFlagNode node) {
    }

    @ComponentScope
    public static class CreditCardClearingFlagNodeRuleProvider implements RuleProvider<CreditCardClearingFlagNode> {

        @Inject
        public CreditCardClearingFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardClearingFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CreditCardBreakCostNode newCreditCardBreakCostNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardBreakCostNode(parent, name);
    }

    protected void configureCreditCardBreakCostNode(CreditCardBreakCostNode node) {
    }

    @ComponentScope
    public static class CreditCardBreakCostNodeRuleProvider implements RuleProvider<CreditCardBreakCostNode> {

        @Inject
        public CreditCardBreakCostNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardBreakCostNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CreditCardLenderNameNode newCreditCardLenderNameNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardLenderNameNode(parent, name);
    }

    protected void configureCreditCardLenderNameNode(CreditCardLenderNameNode node) {
    }

    @ComponentScope
    public static class CreditCardLenderNameNodeRuleProvider implements RuleProvider<CreditCardLenderNameNode> {

        @Inject
        public CreditCardLenderNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardLenderNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CreditCardOwnershipListNode newOwnershipListNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardOwnershipListNode(parent, name);
    }

    protected void configureOwnershipListNode(CreditCardOwnershipListNode node) {
    }

    @ComponentScope
    public static class OwnershipListNodeRuleProvider implements RuleProvider<CreditCardOwnershipListNode> {

        @Inject
        public OwnershipListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardOwnershipListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    CreditCardNodeChildFactory createFactory(CreditCardNode parent) {
        return new CreditCardNodeChildFactoryImpl(parent);
    }

    private class CreditCardNodeChildFactoryImpl implements CreditCardNodeChildFactory {

        private final CreditCardNode parent;
        
        private CreditCardNodeChildFactoryImpl(CreditCardNode parent) {
            this.parent = parent;
        }

        @Override
        public CreditCardTypeNode createCreditCardTypeNode() {
            CreditCardTypeNode node = newCreditCardTypeNode(parent, "creditCardTypeNode");
            creditCardTypeNodeInjector.injectMembers(node);
            configureCreditCardTypeNode(node);
            return node;
        }

        @Override
        public CreditCardAmountOwingNode createCreditCardAmountOwingNode() {
            CreditCardAmountOwingNode node = newCreditCardAmountOwingNode(parent, "creditCardAmountOwingNode");
            creditCardAmountOwingNodeInjector.injectMembers(node);
            configureCreditCardAmountOwingNode(node);
            return node;
        }

        @Override
        public CreditCardLimitAmountNode createCreditCardLimitAmountNode() {
            CreditCardLimitAmountNode node = newCreditCardLimitAmountNode(parent, "creditCardLimitAmountNode");
            creditCardLimitAmountNodeInjector.injectMembers(node);
            configureCreditCardLimitAmountNode(node);
            return node;
        }

        @Override
        public CreditCardMonthlyRepaymentNode createCreditCardMonthlyRepaymentNode() {
            CreditCardMonthlyRepaymentNode node = newCreditCardMonthlyRepaymentNode(parent, "creditCardMonthlyRepaymentNode");
            creditCardMonthlyRepaymentNodeInjector.injectMembers(node);
            configureCreditCardMonthlyRepaymentNode(node);
            return node;
        }

        @Override
        public CreditCardClearingFlagNode createCreditCardClearingFlagNode() {
            CreditCardClearingFlagNode node = newCreditCardClearingFlagNode(parent, "creditCardClearingFlagNode");
            creditCardClearingFlagNodeInjector.injectMembers(node);
            configureCreditCardClearingFlagNode(node);
            return node;
        }

        @Override
        public CreditCardBreakCostNode createCreditCardBreakCostNode() {
            CreditCardBreakCostNode node = newCreditCardBreakCostNode(parent, "creditCardBreakCostNode");
            creditCardBreakCostNodeInjector.injectMembers(node);
            configureCreditCardBreakCostNode(node);
            return node;
        }

        @Override
        public CreditCardLenderNameNode createCreditCardLenderNameNode() {
            CreditCardLenderNameNode node = newCreditCardLenderNameNode(parent, "creditCardLenderNameNode");
            creditCardLenderNameNodeInjector.injectMembers(node);
            configureCreditCardLenderNameNode(node);
            return node;
        }

        @Override
        public CreditCardOwnershipListNode createOwnershipListNode() {
            CreditCardOwnershipListNode node = newOwnershipListNode(parent, "ownershipListNode");
            creditCardOwnershipListNodeInjector.injectMembers(node);
            configureOwnershipListNode(node);
            return node;
        }

    }
}
