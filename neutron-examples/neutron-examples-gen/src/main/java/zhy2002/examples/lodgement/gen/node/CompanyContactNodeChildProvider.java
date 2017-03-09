package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface CompanyContactNodeChildFactory {
    CompanyContactFirstNameNode createCompanyContactFirstNameNode();
    CompanyContactLastNameNode createCompanyContactLastNameNode();
    CompanyTelephoneNode createWorkPhoneNode();
    CompanyTelephoneNode createFaxNumberNode();
    CompanyMobileNumberNode createCompanyMobileNumberNode();
    CompanyEmailNode createCompanyEmailNode();
    CompanyAddressNode createRegisteredAddressNode();
    CompanyAddressNode createPostalAddressNode();
    CompanyAddressNode createTradingAddressNode();
    CompanyAddressNode createPrincipalPlaceAddressNode();
}

@Singleton
public class CompanyContactNodeChildProvider {
    @Inject
    MembersInjector<CompanyTelephoneNode> companyTelephoneNodeInjector;
    @Inject
    MembersInjector<CompanyAddressNode> companyAddressNodeInjector;
    @Inject
    MembersInjector<CompanyMobileNumberNode> companyMobileNumberNodeInjector;
    @Inject
    MembersInjector<CompanyEmailNode> companyEmailNodeInjector;
    @Inject
    MembersInjector<CompanyContactFirstNameNode> companyContactFirstNameNodeInjector;
    @Inject
    MembersInjector<CompanyContactLastNameNode> companyContactLastNameNodeInjector;

    @Inject
    protected CompanyContactNodeChildProvider () {}

    protected MembersInjector<CompanyTelephoneNode> getCompanyTelephoneNodeInjector() {
        return this.companyTelephoneNodeInjector;
    }

    protected MembersInjector<CompanyAddressNode> getCompanyAddressNodeInjector() {
        return this.companyAddressNodeInjector;
    }

    protected MembersInjector<CompanyMobileNumberNode> getCompanyMobileNumberNodeInjector() {
        return this.companyMobileNumberNodeInjector;
    }

    protected MembersInjector<CompanyEmailNode> getCompanyEmailNodeInjector() {
        return this.companyEmailNodeInjector;
    }

    protected MembersInjector<CompanyContactFirstNameNode> getCompanyContactFirstNameNodeInjector() {
        return this.companyContactFirstNameNodeInjector;
    }

    protected MembersInjector<CompanyContactLastNameNode> getCompanyContactLastNameNodeInjector() {
        return this.companyContactLastNameNodeInjector;
    }

    protected CompanyContactFirstNameNode newCompanyContactFirstNameNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyContactFirstNameNode(parent, name);
    }

    protected void configureCompanyContactFirstNameNode(CompanyContactFirstNameNode node) {
    }

    @CompanyContactFirstNameNodeScope
    public static class CompanyContactFirstNameNodeRuleProvider implements RuleProvider<CompanyContactFirstNameNode> {

        @Inject
        public CompanyContactFirstNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyContactFirstNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyContactLastNameNode newCompanyContactLastNameNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyContactLastNameNode(parent, name);
    }

    protected void configureCompanyContactLastNameNode(CompanyContactLastNameNode node) {
    }

    @CompanyContactLastNameNodeScope
    public static class CompanyContactLastNameNodeRuleProvider implements RuleProvider<CompanyContactLastNameNode> {

        @Inject
        public CompanyContactLastNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyContactLastNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyTelephoneNode newWorkPhoneNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyTelephoneNode(parent, name);
    }

    protected void configureWorkPhoneNode(CompanyTelephoneNode node) {
    }

    @CompanyTelephoneNodeScope
    public static class WorkPhoneNodeRuleProvider implements RuleProvider<CompanyTelephoneNode> {

        @Inject
        public WorkPhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyTelephoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyTelephoneNode newFaxNumberNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyTelephoneNode(parent, name);
    }

    protected void configureFaxNumberNode(CompanyTelephoneNode node) {
    }

    @CompanyTelephoneNodeScope
    public static class FaxNumberNodeRuleProvider implements RuleProvider<CompanyTelephoneNode> {

        @Inject
        public FaxNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyTelephoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyMobileNumberNode newCompanyMobileNumberNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyMobileNumberNode(parent, name);
    }

    protected void configureCompanyMobileNumberNode(CompanyMobileNumberNode node) {
    }

    @CompanyMobileNumberNodeScope
    public static class CompanyMobileNumberNodeRuleProvider implements RuleProvider<CompanyMobileNumberNode> {

        @Inject
        public CompanyMobileNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyMobileNumberNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyEmailNode newCompanyEmailNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyEmailNode(parent, name);
    }

    protected void configureCompanyEmailNode(CompanyEmailNode node) {
    }

    @CompanyEmailNodeScope
    public static class CompanyEmailNodeRuleProvider implements RuleProvider<CompanyEmailNode> {

        @Inject
        public CompanyEmailNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyEmailNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyAddressNode newRegisteredAddressNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyAddressNode(parent, name);
    }

    protected void configureRegisteredAddressNode(CompanyAddressNode node) {
    }

    @CompanyAddressNodeScope
    public static class RegisteredAddressNodeRuleProvider implements RuleProvider<CompanyAddressNode> {

        @Inject
        public RegisteredAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyAddressNode newPostalAddressNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyAddressNode(parent, name);
    }

    protected void configurePostalAddressNode(CompanyAddressNode node) {
    }

    @CompanyAddressNodeScope
    public static class PostalAddressNodeRuleProvider implements RuleProvider<CompanyAddressNode> {

        @Inject
        public PostalAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyAddressNode newTradingAddressNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyAddressNode(parent, name);
    }

    protected void configureTradingAddressNode(CompanyAddressNode node) {
    }

    @CompanyAddressNodeScope
    public static class TradingAddressNodeRuleProvider implements RuleProvider<CompanyAddressNode> {

        @Inject
        public TradingAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyAddressNode newPrincipalPlaceAddressNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyAddressNode(parent, name);
    }

    protected void configurePrincipalPlaceAddressNode(CompanyAddressNode node) {
    }

    @CompanyAddressNodeScope
    public static class PrincipalPlaceAddressNodeRuleProvider implements RuleProvider<CompanyAddressNode> {

        @Inject
        public PrincipalPlaceAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    CompanyContactNodeChildFactory createFactory(CompanyContactNode parent) {
        return new CompanyContactNodeChildFactoryImpl(parent);
    }

    private class CompanyContactNodeChildFactoryImpl implements CompanyContactNodeChildFactory {

        private final CompanyContactNode parent;
        
        private CompanyContactNodeChildFactoryImpl(CompanyContactNode parent) {
            this.parent = parent;
        }

        @Override
        public CompanyContactFirstNameNode createCompanyContactFirstNameNode() {
            CompanyContactFirstNameNode node = newCompanyContactFirstNameNode(parent, "companyContactFirstNameNode");
            companyContactFirstNameNodeInjector.injectMembers(node);
            configureCompanyContactFirstNameNode(node);
            return node;
        }

        @Override
        public CompanyContactLastNameNode createCompanyContactLastNameNode() {
            CompanyContactLastNameNode node = newCompanyContactLastNameNode(parent, "companyContactLastNameNode");
            companyContactLastNameNodeInjector.injectMembers(node);
            configureCompanyContactLastNameNode(node);
            return node;
        }

        @Override
        public CompanyTelephoneNode createWorkPhoneNode() {
            CompanyTelephoneNode node = newWorkPhoneNode(parent, "workPhoneNode");
            companyTelephoneNodeInjector.injectMembers(node);
            configureWorkPhoneNode(node);
            return node;
        }

        @Override
        public CompanyTelephoneNode createFaxNumberNode() {
            CompanyTelephoneNode node = newFaxNumberNode(parent, "faxNumberNode");
            companyTelephoneNodeInjector.injectMembers(node);
            configureFaxNumberNode(node);
            return node;
        }

        @Override
        public CompanyMobileNumberNode createCompanyMobileNumberNode() {
            CompanyMobileNumberNode node = newCompanyMobileNumberNode(parent, "companyMobileNumberNode");
            companyMobileNumberNodeInjector.injectMembers(node);
            configureCompanyMobileNumberNode(node);
            return node;
        }

        @Override
        public CompanyEmailNode createCompanyEmailNode() {
            CompanyEmailNode node = newCompanyEmailNode(parent, "companyEmailNode");
            companyEmailNodeInjector.injectMembers(node);
            configureCompanyEmailNode(node);
            return node;
        }

        @Override
        public CompanyAddressNode createRegisteredAddressNode() {
            CompanyAddressNode node = newRegisteredAddressNode(parent, "registeredAddressNode");
            companyAddressNodeInjector.injectMembers(node);
            configureRegisteredAddressNode(node);
            return node;
        }

        @Override
        public CompanyAddressNode createPostalAddressNode() {
            CompanyAddressNode node = newPostalAddressNode(parent, "postalAddressNode");
            companyAddressNodeInjector.injectMembers(node);
            configurePostalAddressNode(node);
            return node;
        }

        @Override
        public CompanyAddressNode createTradingAddressNode() {
            CompanyAddressNode node = newTradingAddressNode(parent, "tradingAddressNode");
            companyAddressNodeInjector.injectMembers(node);
            configureTradingAddressNode(node);
            return node;
        }

        @Override
        public CompanyAddressNode createPrincipalPlaceAddressNode() {
            CompanyAddressNode node = newPrincipalPlaceAddressNode(parent, "principalPlaceAddressNode");
            companyAddressNodeInjector.injectMembers(node);
            configurePrincipalPlaceAddressNode(node);
            return node;
        }

    }
}
