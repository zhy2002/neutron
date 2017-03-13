package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface SubmissionNodeChildFactory {
    BrokerFirstNameNode createBrokerFirstNameNode();
    BrokerLastNameNode createBrokerLastNameNode();
    BrokerCompanyNode createBrokerCompanyNode();
    BrokerTelephoneNode createContactNumberNode();
    BrokerTelephoneNode createFaxNumberNode();
    BrokerTelephoneNode createMobileNumberNode();
    BrokerEmailNode createBrokerEmailNode();
    BrokerAddressNode createBrokerAddressNode();
    LenderIssuedBrokerNumberNode createLenderIssuedBrokerNumberNode();
}

@Singleton
public class SubmissionNodeChildProvider {
    @Inject
    MembersInjector<BrokerEmailNode> brokerEmailNodeInjector;
    @Inject
    MembersInjector<BrokerTelephoneNode> brokerTelephoneNodeInjector;
    @Inject
    MembersInjector<LenderIssuedBrokerNumberNode> lenderIssuedBrokerNumberNodeInjector;
    @Inject
    MembersInjector<BrokerFirstNameNode> brokerFirstNameNodeInjector;
    @Inject
    MembersInjector<BrokerCompanyNode> brokerCompanyNodeInjector;
    @Inject
    MembersInjector<BrokerLastNameNode> brokerLastNameNodeInjector;
    @Inject
    MembersInjector<BrokerAddressNode> brokerAddressNodeInjector;

    @Inject
    protected SubmissionNodeChildProvider () {}

    protected MembersInjector<BrokerEmailNode> getBrokerEmailNodeInjector() {
        return this.brokerEmailNodeInjector;
    }

    protected MembersInjector<BrokerTelephoneNode> getBrokerTelephoneNodeInjector() {
        return this.brokerTelephoneNodeInjector;
    }

    protected MembersInjector<LenderIssuedBrokerNumberNode> getLenderIssuedBrokerNumberNodeInjector() {
        return this.lenderIssuedBrokerNumberNodeInjector;
    }

    protected MembersInjector<BrokerFirstNameNode> getBrokerFirstNameNodeInjector() {
        return this.brokerFirstNameNodeInjector;
    }

    protected MembersInjector<BrokerCompanyNode> getBrokerCompanyNodeInjector() {
        return this.brokerCompanyNodeInjector;
    }

    protected MembersInjector<BrokerLastNameNode> getBrokerLastNameNodeInjector() {
        return this.brokerLastNameNodeInjector;
    }

    protected MembersInjector<BrokerAddressNode> getBrokerAddressNodeInjector() {
        return this.brokerAddressNodeInjector;
    }

    protected BrokerFirstNameNode newBrokerFirstNameNode(
        SubmissionNode parent,
        String name
    ) {
        return new BrokerFirstNameNode(parent, name);
    }

    protected void configureBrokerFirstNameNode(BrokerFirstNameNode node) {
    }

    @BrokerFirstNameNodeScope
    public static class BrokerFirstNameNodeRuleProvider implements RuleProvider<BrokerFirstNameNode> {

        @Inject
        public BrokerFirstNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(BrokerFirstNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected BrokerLastNameNode newBrokerLastNameNode(
        SubmissionNode parent,
        String name
    ) {
        return new BrokerLastNameNode(parent, name);
    }

    protected void configureBrokerLastNameNode(BrokerLastNameNode node) {
    }

    @BrokerLastNameNodeScope
    public static class BrokerLastNameNodeRuleProvider implements RuleProvider<BrokerLastNameNode> {

        @Inject
        public BrokerLastNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(BrokerLastNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected BrokerCompanyNode newBrokerCompanyNode(
        SubmissionNode parent,
        String name
    ) {
        return new BrokerCompanyNode(parent, name);
    }

    protected void configureBrokerCompanyNode(BrokerCompanyNode node) {
    }

    @BrokerCompanyNodeScope
    public static class BrokerCompanyNodeRuleProvider implements RuleProvider<BrokerCompanyNode> {

        @Inject
        public BrokerCompanyNodeRuleProvider() {

        }

        @Override
        public void initializeState(BrokerCompanyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected BrokerTelephoneNode newContactNumberNode(
        SubmissionNode parent,
        String name
    ) {
        return new BrokerTelephoneNode(parent, name);
    }

    protected void configureContactNumberNode(BrokerTelephoneNode node) {
    }

    @BrokerTelephoneNodeScope
    public static class ContactNumberNodeRuleProvider implements RuleProvider<BrokerTelephoneNode> {

        @Inject
        public ContactNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(BrokerTelephoneNode node) {
            node.setRequired(true);
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected BrokerTelephoneNode newFaxNumberNode(
        SubmissionNode parent,
        String name
    ) {
        return new BrokerTelephoneNode(parent, name);
    }

    protected void configureFaxNumberNode(BrokerTelephoneNode node) {
    }

    @BrokerTelephoneNodeScope
    public static class FaxNumberNodeRuleProvider implements RuleProvider<BrokerTelephoneNode> {

        @Inject
        public FaxNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(BrokerTelephoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected BrokerTelephoneNode newMobileNumberNode(
        SubmissionNode parent,
        String name
    ) {
        return new BrokerTelephoneNode(parent, name);
    }

    protected void configureMobileNumberNode(BrokerTelephoneNode node) {
    }

    @BrokerTelephoneNodeScope
    public static class MobileNumberNodeRuleProvider implements RuleProvider<BrokerTelephoneNode> {

        @Inject
        public MobileNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(BrokerTelephoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected BrokerEmailNode newBrokerEmailNode(
        SubmissionNode parent,
        String name
    ) {
        return new BrokerEmailNode(parent, name);
    }

    protected void configureBrokerEmailNode(BrokerEmailNode node) {
    }

    @BrokerEmailNodeScope
    public static class BrokerEmailNodeRuleProvider implements RuleProvider<BrokerEmailNode> {

        @Inject
        public BrokerEmailNodeRuleProvider() {

        }

        @Override
        public void initializeState(BrokerEmailNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected BrokerAddressNode newBrokerAddressNode(
        SubmissionNode parent,
        String name
    ) {
        return new BrokerAddressNode(parent, name);
    }

    protected void configureBrokerAddressNode(BrokerAddressNode node) {
    }

    @BrokerAddressNodeScope
    public static class BrokerAddressNodeRuleProvider implements RuleProvider<BrokerAddressNode> {

        @Inject
        public BrokerAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(BrokerAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LenderIssuedBrokerNumberNode newLenderIssuedBrokerNumberNode(
        SubmissionNode parent,
        String name
    ) {
        return new LenderIssuedBrokerNumberNode(parent, name);
    }

    protected void configureLenderIssuedBrokerNumberNode(LenderIssuedBrokerNumberNode node) {
    }

    @LenderIssuedBrokerNumberNodeScope
    public static class LenderIssuedBrokerNumberNodeRuleProvider implements RuleProvider<LenderIssuedBrokerNumberNode> {

        @Inject
        public LenderIssuedBrokerNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(LenderIssuedBrokerNumberNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    SubmissionNodeChildFactory createFactory(SubmissionNode parent) {
        return new SubmissionNodeChildFactoryImpl(parent);
    }

    private class SubmissionNodeChildFactoryImpl implements SubmissionNodeChildFactory {

        private final SubmissionNode parent;
        
        private SubmissionNodeChildFactoryImpl(SubmissionNode parent) {
            this.parent = parent;
        }

        @Override
        public BrokerFirstNameNode createBrokerFirstNameNode() {
            BrokerFirstNameNode node = newBrokerFirstNameNode(parent, "brokerFirstNameNode");
            brokerFirstNameNodeInjector.injectMembers(node);
            configureBrokerFirstNameNode(node);
            return node;
        }

        @Override
        public BrokerLastNameNode createBrokerLastNameNode() {
            BrokerLastNameNode node = newBrokerLastNameNode(parent, "brokerLastNameNode");
            brokerLastNameNodeInjector.injectMembers(node);
            configureBrokerLastNameNode(node);
            return node;
        }

        @Override
        public BrokerCompanyNode createBrokerCompanyNode() {
            BrokerCompanyNode node = newBrokerCompanyNode(parent, "brokerCompanyNode");
            brokerCompanyNodeInjector.injectMembers(node);
            configureBrokerCompanyNode(node);
            return node;
        }

        @Override
        public BrokerTelephoneNode createContactNumberNode() {
            BrokerTelephoneNode node = newContactNumberNode(parent, "contactNumberNode");
            brokerTelephoneNodeInjector.injectMembers(node);
            configureContactNumberNode(node);
            return node;
        }

        @Override
        public BrokerTelephoneNode createFaxNumberNode() {
            BrokerTelephoneNode node = newFaxNumberNode(parent, "faxNumberNode");
            brokerTelephoneNodeInjector.injectMembers(node);
            configureFaxNumberNode(node);
            return node;
        }

        @Override
        public BrokerTelephoneNode createMobileNumberNode() {
            BrokerTelephoneNode node = newMobileNumberNode(parent, "mobileNumberNode");
            brokerTelephoneNodeInjector.injectMembers(node);
            configureMobileNumberNode(node);
            return node;
        }

        @Override
        public BrokerEmailNode createBrokerEmailNode() {
            BrokerEmailNode node = newBrokerEmailNode(parent, "brokerEmailNode");
            brokerEmailNodeInjector.injectMembers(node);
            configureBrokerEmailNode(node);
            return node;
        }

        @Override
        public BrokerAddressNode createBrokerAddressNode() {
            BrokerAddressNode node = newBrokerAddressNode(parent, "brokerAddressNode");
            brokerAddressNodeInjector.injectMembers(node);
            configureBrokerAddressNode(node);
            return node;
        }

        @Override
        public LenderIssuedBrokerNumberNode createLenderIssuedBrokerNumberNode() {
            LenderIssuedBrokerNumberNode node = newLenderIssuedBrokerNumberNode(parent, "lenderIssuedBrokerNumberNode");
            lenderIssuedBrokerNumberNodeInjector.injectMembers(node);
            configureLenderIssuedBrokerNumberNode(node);
            return node;
        }

    }
}
