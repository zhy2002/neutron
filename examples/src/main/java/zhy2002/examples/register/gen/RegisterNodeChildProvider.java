package zhy2002.examples.register.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface RegisterNodeChildFactory {
    UsernameNode createUsernameNode();
    EmailNode createEmailNode();
    PasswordNode createPasswordNode();
    RepeatPasswordNode createRepeatPasswordNode();
    AgeNode createAgeNode();
    PlanNode createPlanNode();
    ReceiveOffersNode createReceiveOffersNode();
    OwnInvestmentPropertyNode createOwnInvestmentPropertyNode();
    PropertyDetailsNode createResidentialPropertyNode();
    PropertyDetailsNode createInvestmentPropertyNode();
    PhoneInfoNode createHomePhoneNode();
    ErrorListNode createErrorListNode();
}

@Singleton
public class RegisterNodeChildProvider {
    @Inject
    MembersInjector<UsernameNode> usernameNodeInjector;
    @Inject
    MembersInjector<EmailNode> emailNodeInjector;
    @Inject
    MembersInjector<PasswordNode> passwordNodeInjector;
    @Inject
    MembersInjector<RepeatPasswordNode> repeatPasswordNodeInjector;
    @Inject
    MembersInjector<AgeNode> ageNodeInjector;
    @Inject
    MembersInjector<PlanNode> planNodeInjector;
    @Inject
    MembersInjector<ReceiveOffersNode> receiveOffersNodeInjector;
    @Inject
    MembersInjector<OwnInvestmentPropertyNode> ownInvestmentPropertyNodeInjector;
    @Inject
    MembersInjector<PropertyDetailsNode> propertyDetailsNodeInjector;
    @Inject
    MembersInjector<PhoneInfoNode> phoneInfoNodeInjector;
    @Inject
    MembersInjector<ErrorListNode> errorListNodeInjector;

    @Inject
    protected RegisterNodeChildProvider () {}

    protected MembersInjector<UsernameNode> getUsernameNodeInjector() {
        return this.usernameNodeInjector;
    }

    protected MembersInjector<EmailNode> getEmailNodeInjector() {
        return this.emailNodeInjector;
    }

    protected MembersInjector<PasswordNode> getPasswordNodeInjector() {
        return this.passwordNodeInjector;
    }

    protected MembersInjector<RepeatPasswordNode> getRepeatPasswordNodeInjector() {
        return this.repeatPasswordNodeInjector;
    }

    protected MembersInjector<AgeNode> getAgeNodeInjector() {
        return this.ageNodeInjector;
    }

    protected MembersInjector<PlanNode> getPlanNodeInjector() {
        return this.planNodeInjector;
    }

    protected MembersInjector<ReceiveOffersNode> getReceiveOffersNodeInjector() {
        return this.receiveOffersNodeInjector;
    }

    protected MembersInjector<OwnInvestmentPropertyNode> getOwnInvestmentPropertyNodeInjector() {
        return this.ownInvestmentPropertyNodeInjector;
    }

    protected MembersInjector<PropertyDetailsNode> getPropertyDetailsNodeInjector() {
        return this.propertyDetailsNodeInjector;
    }

    protected MembersInjector<PhoneInfoNode> getPhoneInfoNodeInjector() {
        return this.phoneInfoNodeInjector;
    }

    protected MembersInjector<ErrorListNode> getErrorListNodeInjector() {
        return this.errorListNodeInjector;
    }

    protected UsernameNode newUsernameNode(
        RegisterNode parent,
        String name
    ) {
        return new UsernameNode(parent, name);
    }

    protected void configureUsernameNode(UsernameNode node) {
    }

    protected EmailNode newEmailNode(
        RegisterNode parent,
        String name
    ) {
        return new EmailNode(parent, name);
    }

    protected void configureEmailNode(EmailNode node) {
    }

    protected PasswordNode newPasswordNode(
        RegisterNode parent,
        String name
    ) {
        return new PasswordNode(parent, name);
    }

    protected void configurePasswordNode(PasswordNode node) {
    }

    protected RepeatPasswordNode newRepeatPasswordNode(
        RegisterNode parent,
        String name
    ) {
        return new RepeatPasswordNode(parent, name);
    }

    protected void configureRepeatPasswordNode(RepeatPasswordNode node) {
    }

    protected AgeNode newAgeNode(
        RegisterNode parent,
        String name
    ) {
        return new AgeNode(parent, name);
    }

    protected void configureAgeNode(AgeNode node) {
    }

    protected PlanNode newPlanNode(
        RegisterNode parent,
        String name
    ) {
        return new PlanNode(parent, name);
    }

    protected void configurePlanNode(PlanNode node) {
    }

    protected ReceiveOffersNode newReceiveOffersNode(
        RegisterNode parent,
        String name
    ) {
        return new ReceiveOffersNode(parent, name);
    }

    protected void configureReceiveOffersNode(ReceiveOffersNode node) {
    }

    protected OwnInvestmentPropertyNode newOwnInvestmentPropertyNode(
        RegisterNode parent,
        String name
    ) {
        return new OwnInvestmentPropertyNode(parent, name);
    }

    protected void configureOwnInvestmentPropertyNode(OwnInvestmentPropertyNode node) {
    }

    protected PropertyDetailsNode newResidentialPropertyNode(
        RegisterNode parent,
        String name
    ) {
        return new PropertyDetailsNode(parent, name);
    }

    protected void configureResidentialPropertyNode(PropertyDetailsNode node) {
    }

    protected PropertyDetailsNode newInvestmentPropertyNode(
        RegisterNode parent,
        String name
    ) {
        return new PropertyDetailsNode(parent, name);
    }

    protected void configureInvestmentPropertyNode(PropertyDetailsNode node) {
    }

    protected PhoneInfoNode newHomePhoneNode(
        RegisterNode parent,
        String name
    ) {
        return new PhoneInfoNode(parent, name);
    }

    protected void configureHomePhoneNode(PhoneInfoNode node) {
    }

    protected ErrorListNode newErrorListNode(
        RegisterNode parent,
        String name
    ) {
        return new ErrorListNode(parent, name);
    }

    protected void configureErrorListNode(ErrorListNode node) {
    }

    RegisterNodeChildFactory createFactory(RegisterNode parent) {
        return new RegisterNodeChildFactoryImpl(parent);
    }

    private class RegisterNodeChildFactoryImpl implements RegisterNodeChildFactory {

        private final RegisterNode parent;
        
        private RegisterNodeChildFactoryImpl(RegisterNode parent) {
            this.parent = parent;
        }

        @Override
        public UsernameNode createUsernameNode() {
            UsernameNode node = newUsernameNode(parent, "usernameNode");
            usernameNodeInjector.injectMembers(node);
            configureUsernameNode(node);
            return node;
        }

        @Override
        public EmailNode createEmailNode() {
            EmailNode node = newEmailNode(parent, "emailNode");
            emailNodeInjector.injectMembers(node);
            configureEmailNode(node);
            return node;
        }

        @Override
        public PasswordNode createPasswordNode() {
            PasswordNode node = newPasswordNode(parent, "passwordNode");
            passwordNodeInjector.injectMembers(node);
            configurePasswordNode(node);
            return node;
        }

        @Override
        public RepeatPasswordNode createRepeatPasswordNode() {
            RepeatPasswordNode node = newRepeatPasswordNode(parent, "repeatPasswordNode");
            repeatPasswordNodeInjector.injectMembers(node);
            configureRepeatPasswordNode(node);
            return node;
        }

        @Override
        public AgeNode createAgeNode() {
            AgeNode node = newAgeNode(parent, "ageNode");
            ageNodeInjector.injectMembers(node);
            configureAgeNode(node);
            return node;
        }

        @Override
        public PlanNode createPlanNode() {
            PlanNode node = newPlanNode(parent, "planNode");
            planNodeInjector.injectMembers(node);
            configurePlanNode(node);
            return node;
        }

        @Override
        public ReceiveOffersNode createReceiveOffersNode() {
            ReceiveOffersNode node = newReceiveOffersNode(parent, "receiveOffersNode");
            receiveOffersNodeInjector.injectMembers(node);
            configureReceiveOffersNode(node);
            return node;
        }

        @Override
        public OwnInvestmentPropertyNode createOwnInvestmentPropertyNode() {
            OwnInvestmentPropertyNode node = newOwnInvestmentPropertyNode(parent, "ownInvestmentPropertyNode");
            ownInvestmentPropertyNodeInjector.injectMembers(node);
            configureOwnInvestmentPropertyNode(node);
            return node;
        }

        @Override
        public PropertyDetailsNode createResidentialPropertyNode() {
            PropertyDetailsNode node = newResidentialPropertyNode(parent, "residentialPropertyNode");
            propertyDetailsNodeInjector.injectMembers(node);
            configureResidentialPropertyNode(node);
            return node;
        }

        @Override
        public PropertyDetailsNode createInvestmentPropertyNode() {
            PropertyDetailsNode node = newInvestmentPropertyNode(parent, "investmentPropertyNode");
            propertyDetailsNodeInjector.injectMembers(node);
            configureInvestmentPropertyNode(node);
            return node;
        }

        @Override
        public PhoneInfoNode createHomePhoneNode() {
            PhoneInfoNode node = newHomePhoneNode(parent, "homePhoneNode");
            phoneInfoNodeInjector.injectMembers(node);
            configureHomePhoneNode(node);
            return node;
        }

        @Override
        public ErrorListNode createErrorListNode() {
            ErrorListNode node = newErrorListNode(parent, "errorListNode");
            errorListNodeInjector.injectMembers(node);
            configureErrorListNode(node);
            return node;
        }

    }
}
