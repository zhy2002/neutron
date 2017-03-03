package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


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

    protected TrustRegistrationDateNode newTrustRegistrationDateNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustRegistrationDateNode(parent, name);
    }

    protected void configureTrustRegistrationDateNode(TrustRegistrationDateNode node) {
    }

    protected TrustTypeNode newTrustTypeNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustTypeNode(parent, name);
    }

    protected void configureTrustTypeNode(TrustTypeNode node) {
    }

    protected TrustCountryNode newTrustCountryNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustCountryNode(parent, name);
    }

    protected void configureTrustCountryNode(TrustCountryNode node) {
    }

    protected TrustAddressNode newTrustAddressNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustAddressNode(parent, name);
    }

    protected void configureTrustAddressNode(TrustAddressNode node) {
    }

    protected TrustIndustryNode newTrustIndustryNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustIndustryNode(parent, name);
    }

    protected void configureTrustIndustryNode(TrustIndustryNode node) {
    }

    protected TrustSettlorNotRequiredReasonNode newTrustSettlorNotRequiredReasonNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustSettlorNotRequiredReasonNode(parent, name);
    }

    protected void configureTrustSettlorNotRequiredReasonNode(TrustSettlorNotRequiredReasonNode node) {
    }

    protected TrustBeneficiaryListNode newTrustBeneficiaryListNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustBeneficiaryListNode(parent, name);
    }

    protected void configureTrustBeneficiaryListNode(TrustBeneficiaryListNode node) {
    }

    protected TrustSettlorListNode newTrustSettlorListNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustSettlorListNode(parent, name);
    }

    protected void configureTrustSettlorListNode(TrustSettlorListNode node) {
    }

    protected TrustBeneficialOwnerListNode newTrustBeneficialOwnerListNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustBeneficialOwnerListNode(parent, name);
    }

    protected void configureTrustBeneficialOwnerListNode(TrustBeneficialOwnerListNode node) {
    }

    protected TrustBeneficiaryClassListNode newTrustBeneficiaryClassListNode(
        BaseTrustNode<?> parent,
        String name
    ) {
        return new TrustBeneficiaryClassListNode(parent, name);
    }

    protected void configureTrustBeneficiaryClassListNode(TrustBeneficiaryClassListNode node) {
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
