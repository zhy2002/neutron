package zhy2002.examples.register.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.register.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


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
    MembersInjector<PlanNode> planNodeInjector;
    @Inject
    MembersInjector<ReceiveOffersNode> receiveOffersNodeInjector;
    @Inject
    MembersInjector<UsernameNode> usernameNodeInjector;
    @Inject
    MembersInjector<RepeatPasswordNode> repeatPasswordNodeInjector;
    @Inject
    MembersInjector<PropertyDetailsNode> propertyDetailsNodeInjector;
    @Inject
    MembersInjector<PhoneInfoNode> phoneInfoNodeInjector;
    @Inject
    MembersInjector<PasswordNode> passwordNodeInjector;
    @Inject
    MembersInjector<OwnInvestmentPropertyNode> ownInvestmentPropertyNodeInjector;
    @Inject
    MembersInjector<ErrorListNode> errorListNodeInjector;
    @Inject
    MembersInjector<EmailNode> emailNodeInjector;
    @Inject
    MembersInjector<AgeNode> ageNodeInjector;

    @Inject
    protected RegisterNodeChildProvider () {}

    protected MembersInjector<PlanNode> getPlanNodeInjector() {
        return this.planNodeInjector;
    }

    protected MembersInjector<ReceiveOffersNode> getReceiveOffersNodeInjector() {
        return this.receiveOffersNodeInjector;
    }

    protected MembersInjector<UsernameNode> getUsernameNodeInjector() {
        return this.usernameNodeInjector;
    }

    protected MembersInjector<RepeatPasswordNode> getRepeatPasswordNodeInjector() {
        return this.repeatPasswordNodeInjector;
    }

    protected MembersInjector<PropertyDetailsNode> getPropertyDetailsNodeInjector() {
        return this.propertyDetailsNodeInjector;
    }

    protected MembersInjector<PhoneInfoNode> getPhoneInfoNodeInjector() {
        return this.phoneInfoNodeInjector;
    }

    protected MembersInjector<PasswordNode> getPasswordNodeInjector() {
        return this.passwordNodeInjector;
    }

    protected MembersInjector<OwnInvestmentPropertyNode> getOwnInvestmentPropertyNodeInjector() {
        return this.ownInvestmentPropertyNodeInjector;
    }

    protected MembersInjector<ErrorListNode> getErrorListNodeInjector() {
        return this.errorListNodeInjector;
    }

    protected MembersInjector<EmailNode> getEmailNodeInjector() {
        return this.emailNodeInjector;
    }

    protected MembersInjector<AgeNode> getAgeNodeInjector() {
        return this.ageNodeInjector;
    }

    protected UsernameNode newUsernameNode(
        RegisterNode parent,
        String name
    ) {
        return new UsernameNode(parent, name);
    }

    protected void configureUsernameNode(UsernameNode node) {
    }

    @ComponentScope
    public static class UsernameNodeRuleProvider implements RuleProvider<UsernameNode> {

        @Inject
        public UsernameNodeRuleProvider() {

        }

        @Override
        public void initializeState(UsernameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected EmailNode newEmailNode(
        RegisterNode parent,
        String name
    ) {
        return new EmailNode(parent, name);
    }

    protected void configureEmailNode(EmailNode node) {
    }

    @ComponentScope
    public static class EmailNodeRuleProvider implements RuleProvider<EmailNode> {

        @Inject
        public EmailNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmailNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PasswordNode newPasswordNode(
        RegisterNode parent,
        String name
    ) {
        return new PasswordNode(parent, name);
    }

    protected void configurePasswordNode(PasswordNode node) {
    }

    @ComponentScope
    public static class PasswordNodeRuleProvider implements RuleProvider<PasswordNode> {

        @Inject
        public PasswordNodeRuleProvider() {

        }

        @Override
        public void initializeState(PasswordNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected RepeatPasswordNode newRepeatPasswordNode(
        RegisterNode parent,
        String name
    ) {
        return new RepeatPasswordNode(parent, name);
    }

    protected void configureRepeatPasswordNode(RepeatPasswordNode node) {
    }

    @ComponentScope
    public static class RepeatPasswordNodeRuleProvider implements RuleProvider<RepeatPasswordNode> {

        @Inject
        public RepeatPasswordNodeRuleProvider() {

        }

        @Override
        public void initializeState(RepeatPasswordNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AgeNode newAgeNode(
        RegisterNode parent,
        String name
    ) {
        return new AgeNode(parent, name);
    }

    protected void configureAgeNode(AgeNode node) {
    }

    @ComponentScope
    public static class AgeNodeRuleProvider implements RuleProvider<AgeNode> {

        @Inject
        public AgeNodeRuleProvider() {

        }

        @Override
        public void initializeState(AgeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PlanNode newPlanNode(
        RegisterNode parent,
        String name
    ) {
        return new PlanNode(parent, name);
    }

    protected void configurePlanNode(PlanNode node) {
    }

    @ComponentScope
    public static class PlanNodeRuleProvider implements RuleProvider<PlanNode> {

        @Inject
        public PlanNodeRuleProvider() {

        }

        @Override
        public void initializeState(PlanNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ReceiveOffersNode newReceiveOffersNode(
        RegisterNode parent,
        String name
    ) {
        return new ReceiveOffersNode(parent, name);
    }

    protected void configureReceiveOffersNode(ReceiveOffersNode node) {
    }

    @ComponentScope
    public static class ReceiveOffersNodeRuleProvider implements RuleProvider<ReceiveOffersNode> {

        @Inject
        public ReceiveOffersNodeRuleProvider() {

        }

        @Override
        public void initializeState(ReceiveOffersNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OwnInvestmentPropertyNode newOwnInvestmentPropertyNode(
        RegisterNode parent,
        String name
    ) {
        return new OwnInvestmentPropertyNode(parent, name);
    }

    protected void configureOwnInvestmentPropertyNode(OwnInvestmentPropertyNode node) {
    }

    @ComponentScope
    public static class OwnInvestmentPropertyNodeRuleProvider implements RuleProvider<OwnInvestmentPropertyNode> {

        @Inject
        public OwnInvestmentPropertyNodeRuleProvider() {

        }

        @Override
        public void initializeState(OwnInvestmentPropertyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PropertyDetailsNode newResidentialPropertyNode(
        RegisterNode parent,
        String name
    ) {
        return new PropertyDetailsNode(parent, name);
    }

    protected void configureResidentialPropertyNode(PropertyDetailsNode node) {
    }

    @ComponentScope
    public static class ResidentialPropertyNodeRuleProvider implements RuleProvider<PropertyDetailsNode> {

        @Inject
        public ResidentialPropertyNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyDetailsNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PropertyDetailsNode newInvestmentPropertyNode(
        RegisterNode parent,
        String name
    ) {
        return new PropertyDetailsNode(parent, name);
    }

    protected void configureInvestmentPropertyNode(PropertyDetailsNode node) {
    }

    @ComponentScope
    public static class InvestmentPropertyNodeRuleProvider implements RuleProvider<PropertyDetailsNode> {

        @Inject
        public InvestmentPropertyNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyDetailsNode node) {
            node.setLoadWithParent(false);
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PhoneInfoNode newHomePhoneNode(
        RegisterNode parent,
        String name
    ) {
        return new PhoneInfoNode(parent, name);
    }

    protected void configureHomePhoneNode(PhoneInfoNode node) {
    }

    @ComponentScope
    public static class HomePhoneNodeRuleProvider implements RuleProvider<PhoneInfoNode> {

        @Inject
        public HomePhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(PhoneInfoNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ErrorListNode newErrorListNode(
        RegisterNode parent,
        String name
    ) {
        return new ErrorListNode(parent, name);
    }

    protected void configureErrorListNode(ErrorListNode node) {
    }

    @ComponentScope
    public static class ErrorListNodeRuleProvider implements RuleProvider<ErrorListNode> {

        @Inject
        public ErrorListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ErrorListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
