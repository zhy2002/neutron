package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface BaseTrustNodeChildFactory {
    TrustNameNode createTrustNameNode();
    TrustRegistrationDateNode createTrustRegistrationDateNode();
    TrustTypeNode createTrustTypeNode();
    TrustCountryNode createTrustCountryNode();
    TrustAddressNode createTrustAddressNode();
    TrustIndustryNode createTrustIndustryNode();
    TrustSettlorNotRequiredReasonNode createTrustSettlorNotRequiredReasonNode();
    TrustBeneficiaryListNode createTrustBeneficiaryListNode();
    TrustSettlorListNode createTrustSettlorListNode();
    TrustBeneficialOwnerListNode createTrustBeneficialOwnerListNode();
    TrustBeneficiaryClassListNode createTrustBeneficiaryClassListNode();
}

@Singleton
public class BaseTrustNodeChildProvider {
    @Inject
    MembersInjector<TrustRegistrationDateNode> trustRegistrationDateNodeInjector;
    @Inject
    MembersInjector<TrustTypeNode> trustTypeNodeInjector;
    @Inject
    MembersInjector<TrustSettlorNotRequiredReasonNode> trustSettlorNotRequiredReasonNodeInjector;
    @Inject
    MembersInjector<TrustIndustryNode> trustIndustryNodeInjector;
    @Inject
    MembersInjector<TrustAddressNode> trustAddressNodeInjector;
    @Inject
    MembersInjector<TrustBeneficiaryListNode> trustBeneficiaryListNodeInjector;
    @Inject
    MembersInjector<TrustNameNode> trustNameNodeInjector;
    @Inject
    MembersInjector<TrustBeneficiaryClassListNode> trustBeneficiaryClassListNodeInjector;
    @Inject
    MembersInjector<TrustSettlorListNode> trustSettlorListNodeInjector;
    @Inject
    MembersInjector<TrustCountryNode> trustCountryNodeInjector;
    @Inject
    MembersInjector<TrustBeneficialOwnerListNode> trustBeneficialOwnerListNodeInjector;

    @Inject
    protected BaseTrustNodeChildProvider () {}

    protected MembersInjector<TrustRegistrationDateNode> getTrustRegistrationDateNodeInjector() {
        return this.trustRegistrationDateNodeInjector;
    }

    protected MembersInjector<TrustTypeNode> getTrustTypeNodeInjector() {
        return this.trustTypeNodeInjector;
    }

    protected MembersInjector<TrustSettlorNotRequiredReasonNode> getTrustSettlorNotRequiredReasonNodeInjector() {
        return this.trustSettlorNotRequiredReasonNodeInjector;
    }

    protected MembersInjector<TrustIndustryNode> getTrustIndustryNodeInjector() {
        return this.trustIndustryNodeInjector;
    }

    protected MembersInjector<TrustAddressNode> getTrustAddressNodeInjector() {
        return this.trustAddressNodeInjector;
    }

    protected MembersInjector<TrustBeneficiaryListNode> getTrustBeneficiaryListNodeInjector() {
        return this.trustBeneficiaryListNodeInjector;
    }

    protected MembersInjector<TrustNameNode> getTrustNameNodeInjector() {
        return this.trustNameNodeInjector;
    }

    protected MembersInjector<TrustBeneficiaryClassListNode> getTrustBeneficiaryClassListNodeInjector() {
        return this.trustBeneficiaryClassListNodeInjector;
    }

    protected MembersInjector<TrustSettlorListNode> getTrustSettlorListNodeInjector() {
        return this.trustSettlorListNodeInjector;
    }

    protected MembersInjector<TrustCountryNode> getTrustCountryNodeInjector() {
        return this.trustCountryNodeInjector;
    }

    protected MembersInjector<TrustBeneficialOwnerListNode> getTrustBeneficialOwnerListNodeInjector() {
        return this.trustBeneficialOwnerListNodeInjector;
    }

    protected TrustNameNode newTrustNameNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustNameNode(parent, name);
    }

    protected void configureTrustNameNode(TrustNameNode node) {
    }

    @ComponentScope
    public static class TrustNameNodeRuleProvider implements RuleProvider<TrustNameNode> {

        @Inject
        public TrustNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustRegistrationDateNode newTrustRegistrationDateNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustRegistrationDateNode(parent, name);
    }

    protected void configureTrustRegistrationDateNode(TrustRegistrationDateNode node) {
    }

    @ComponentScope
    public static class TrustRegistrationDateNodeRuleProvider implements RuleProvider<TrustRegistrationDateNode> {

        @Inject
        public TrustRegistrationDateNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustRegistrationDateNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustTypeNode newTrustTypeNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustTypeNode(parent, name);
    }

    protected void configureTrustTypeNode(TrustTypeNode node) {
    }

    @ComponentScope
    public static class TrustTypeNodeRuleProvider implements RuleProvider<TrustTypeNode> {

        @Inject
        public TrustTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustCountryNode newTrustCountryNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustCountryNode(parent, name);
    }

    protected void configureTrustCountryNode(TrustCountryNode node) {
    }

    @ComponentScope
    public static class TrustCountryNodeRuleProvider implements RuleProvider<TrustCountryNode> {

        @Inject
        public TrustCountryNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustCountryNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustAddressNode newTrustAddressNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustAddressNode(parent, name);
    }

    protected void configureTrustAddressNode(TrustAddressNode node) {
    }

    @ComponentScope
    public static class TrustAddressNodeRuleProvider implements RuleProvider<TrustAddressNode> {

        @Inject
        public TrustAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustIndustryNode newTrustIndustryNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustIndustryNode(parent, name);
    }

    protected void configureTrustIndustryNode(TrustIndustryNode node) {
    }

    @ComponentScope
    public static class TrustIndustryNodeRuleProvider implements RuleProvider<TrustIndustryNode> {

        @Inject
        public TrustIndustryNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustIndustryNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustSettlorNotRequiredReasonNode newTrustSettlorNotRequiredReasonNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustSettlorNotRequiredReasonNode(parent, name);
    }

    protected void configureTrustSettlorNotRequiredReasonNode(TrustSettlorNotRequiredReasonNode node) {
    }

    @ComponentScope
    public static class TrustSettlorNotRequiredReasonNodeRuleProvider implements RuleProvider<TrustSettlorNotRequiredReasonNode> {

        @Inject
        public TrustSettlorNotRequiredReasonNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustSettlorNotRequiredReasonNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustBeneficiaryListNode newTrustBeneficiaryListNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustBeneficiaryListNode(parent, name);
    }

    protected void configureTrustBeneficiaryListNode(TrustBeneficiaryListNode node) {
    }

    @ComponentScope
    public static class TrustBeneficiaryListNodeRuleProvider implements RuleProvider<TrustBeneficiaryListNode> {

        @Inject
        public TrustBeneficiaryListNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustBeneficiaryListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustSettlorListNode newTrustSettlorListNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustSettlorListNode(parent, name);
    }

    protected void configureTrustSettlorListNode(TrustSettlorListNode node) {
    }

    @ComponentScope
    public static class TrustSettlorListNodeRuleProvider implements RuleProvider<TrustSettlorListNode> {

        @Inject
        public TrustSettlorListNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustSettlorListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustBeneficialOwnerListNode newTrustBeneficialOwnerListNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustBeneficialOwnerListNode(parent, name);
    }

    protected void configureTrustBeneficialOwnerListNode(TrustBeneficialOwnerListNode node) {
    }

    @ComponentScope
    public static class TrustBeneficialOwnerListNodeRuleProvider implements RuleProvider<TrustBeneficialOwnerListNode> {

        @Inject
        public TrustBeneficialOwnerListNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustBeneficialOwnerListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected TrustBeneficiaryClassListNode newTrustBeneficiaryClassListNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustBeneficiaryClassListNode(parent, name);
    }

    protected void configureTrustBeneficiaryClassListNode(TrustBeneficiaryClassListNode node) {
    }

    @ComponentScope
    public static class TrustBeneficiaryClassListNodeRuleProvider implements RuleProvider<TrustBeneficiaryClassListNode> {

        @Inject
        public TrustBeneficiaryClassListNodeRuleProvider() {

        }

        @Override
        public void initializeState(TrustBeneficiaryClassListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    BaseTrustNodeChildFactory createFactory(BaseTrustNode<?> parent) {
        return new BaseTrustNodeChildFactoryImpl(parent);
    }

    private class BaseTrustNodeChildFactoryImpl implements BaseTrustNodeChildFactory {

        private final BaseTrustNode<?> parent;
        
        private BaseTrustNodeChildFactoryImpl(BaseTrustNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public TrustNameNode createTrustNameNode() {
            TrustNameNode node = newTrustNameNode(parent, "trustNameNode");
            trustNameNodeInjector.injectMembers(node);
            configureTrustNameNode(node);
            return node;
        }

        @Override
        public TrustRegistrationDateNode createTrustRegistrationDateNode() {
            TrustRegistrationDateNode node = newTrustRegistrationDateNode(parent, "trustRegistrationDateNode");
            trustRegistrationDateNodeInjector.injectMembers(node);
            configureTrustRegistrationDateNode(node);
            return node;
        }

        @Override
        public TrustTypeNode createTrustTypeNode() {
            TrustTypeNode node = newTrustTypeNode(parent, "trustTypeNode");
            trustTypeNodeInjector.injectMembers(node);
            configureTrustTypeNode(node);
            return node;
        }

        @Override
        public TrustCountryNode createTrustCountryNode() {
            TrustCountryNode node = newTrustCountryNode(parent, "trustCountryNode");
            trustCountryNodeInjector.injectMembers(node);
            configureTrustCountryNode(node);
            return node;
        }

        @Override
        public TrustAddressNode createTrustAddressNode() {
            TrustAddressNode node = newTrustAddressNode(parent, "trustAddressNode");
            trustAddressNodeInjector.injectMembers(node);
            configureTrustAddressNode(node);
            return node;
        }

        @Override
        public TrustIndustryNode createTrustIndustryNode() {
            TrustIndustryNode node = newTrustIndustryNode(parent, "trustIndustryNode");
            trustIndustryNodeInjector.injectMembers(node);
            configureTrustIndustryNode(node);
            return node;
        }

        @Override
        public TrustSettlorNotRequiredReasonNode createTrustSettlorNotRequiredReasonNode() {
            TrustSettlorNotRequiredReasonNode node = newTrustSettlorNotRequiredReasonNode(parent, "trustSettlorNotRequiredReasonNode");
            trustSettlorNotRequiredReasonNodeInjector.injectMembers(node);
            configureTrustSettlorNotRequiredReasonNode(node);
            return node;
        }

        @Override
        public TrustBeneficiaryListNode createTrustBeneficiaryListNode() {
            TrustBeneficiaryListNode node = newTrustBeneficiaryListNode(parent, "trustBeneficiaryListNode");
            trustBeneficiaryListNodeInjector.injectMembers(node);
            configureTrustBeneficiaryListNode(node);
            return node;
        }

        @Override
        public TrustSettlorListNode createTrustSettlorListNode() {
            TrustSettlorListNode node = newTrustSettlorListNode(parent, "trustSettlorListNode");
            trustSettlorListNodeInjector.injectMembers(node);
            configureTrustSettlorListNode(node);
            return node;
        }

        @Override
        public TrustBeneficialOwnerListNode createTrustBeneficialOwnerListNode() {
            TrustBeneficialOwnerListNode node = newTrustBeneficialOwnerListNode(parent, "trustBeneficialOwnerListNode");
            trustBeneficialOwnerListNodeInjector.injectMembers(node);
            configureTrustBeneficialOwnerListNode(node);
            return node;
        }

        @Override
        public TrustBeneficiaryClassListNode createTrustBeneficiaryClassListNode() {
            TrustBeneficiaryClassListNode node = newTrustBeneficiaryClassListNode(parent, "trustBeneficiaryClassListNode");
            trustBeneficiaryClassListNodeInjector.injectMembers(node);
            configureTrustBeneficiaryClassListNode(node);
            return node;
        }

    }
}
