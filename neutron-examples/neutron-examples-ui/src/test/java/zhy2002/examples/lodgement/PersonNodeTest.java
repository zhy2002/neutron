package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.di.ApplicationNodeFactory;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.node.AddressRefListNodeImpl;
import zhy2002.neutron.NodeStatusEnum;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PersonNodeTest {

    private ApplicationNode applicationNode;
    private PersonNode personNode;
    private PersonContactNode personContactNode;

    @Before
    public void setup() {
        applicationNode = ApplicationNodeFactory.create();
        PersonListNode personListNode = applicationNode.getPersonListNode();
        personNode = personListNode.createItem();
        personContactNode = personNode.getPersonContactNode();
    }

    @Test
    public void addressRefListIsUpdatedWhenAnAddressNodeIsAdded() {
        AddressRefListNode AddressRefListNode = applicationNode.getAddressRefListNode();
        assertThat(AddressRefListNode.getItemCount(), equalTo(5));

        personNode.getParent().removeByIndex(0);
        assertThat(AddressRefListNode.getItemCount(), equalTo(1)); //first one is automatically added

        personNode.getParent().createItem();
        personNode.getParent().createItem();
        assertThat(AddressRefListNode.getItemCount(), equalTo(9));
    }

    @Test
    public void addressRefListShouldReportNonEmptyNonDuplicateAddresses() {
        AddressRefListNodeImpl AddressRefListNode = (AddressRefListNodeImpl) applicationNode.getAddressRefListNode();
        assertThat(AddressRefListNode.getUniqueAddressNodes().length, equalTo(0));

        personContactNode.getCurrentAddressNode().getAddressLineNode().setValue("1 John St.");
        assertThat(AddressRefListNode.getUniqueAddressNodes().length, equalTo(1));

        personContactNode.getPostalAddressNode().getPostcodeNode().setValue("2500");
        assertThat(AddressRefListNode.getUniqueAddressNodes().length, equalTo(2));
    }

    @Test
    public void creditHistoryListIsEnabledByLegalActionEqYes() {
        PersonPrivacyNode privacyNode = personNode.getPersonPrivacyNode();
        CreditHistoryListNode creditHistoryListNode = privacyNode.getCreditHistoryListNode();
        assertThat(creditHistoryListNode.isDisabled(), equalTo(false));
        creditHistoryListNode.createItem();

        LegalActionNode legalActionNode = privacyNode.getLegalActionNode();
        legalActionNode.setValue("No");
        assertThat(creditHistoryListNode.isDisabled(), equalTo(true));
        assertThat(creditHistoryListNode.getItemCount(), equalTo(0));

        legalActionNode.setValue("Yes");
        assertThat(creditHistoryListNode.isDisabled(), equalTo(false));
    }

    @Test
    public void employmentEndedNodeIsNotLoadedForCurrentEmployment() {
        CurrentEmploymentNode currentEmploymentNode = personNode.getCurrentEmploymentListNode().createItem();
        assertThat(currentEmploymentNode.getPayeEmployedNode().getEmploymentEndedNode().getNodeStatus(), equalTo(NodeStatusEnum.Unloaded));

        PreviousEmploymentNode previousEmploymentNode = personNode.getPreviousEmploymentListNode().createItem();
        assertThat(previousEmploymentNode.getSelfEmployedNode().getEmploymentEndedNode().getNodeStatus(), equalTo(NodeStatusEnum.Loaded));
    }

    @Test
    public void canDistributePercentage() {

        SavingsAccountNode savingsAccountNode = applicationNode.getFinancialPositionNode().getAssetsNode().getSavingsAccountListNode().createItem();
        SavingsOwnershipListNode ownershipListNode = savingsAccountNode.getOwnershipListNode();

        assertThat(ownershipListNode.getItemCount(), equalTo(1));

        OwnershipNode ownershipNode = ownershipListNode.getItem(0);
        ownershipNode.getAverageFlagNode().setValue(Boolean.TRUE);

        assertThat(ownershipNode.getOwnershipPercentageNode().getValue(), equalTo(new BigDecimal("100")));
        assertThat(ownershipListNode.getTotalOwnership(), equalTo(new BigDecimal("100")));

        ownershipNode.getAverageFlagNode().setValue(Boolean.FALSE);
        assertThat(ownershipNode.getOwnershipPercentageNode().getValue(), equalTo(new BigDecimal("100")));
        assertThat(ownershipListNode.getTotalOwnership(), equalTo(new BigDecimal("100")));

        applicationNode.getPersonListNode().createItem();
        assertThat(ownershipListNode.getItemCount(), equalTo(2));

        OwnershipNode ownershipNode2 = ownershipListNode.getItem(1);
        applicationNode.getContext().beginSession();
        ownershipNode.getAverageFlagNode().setValue(Boolean.TRUE);
        ownershipNode2.getAverageFlagNode().setValue(Boolean.TRUE);
        applicationNode.getContext().commitSession();
        assertThat(ownershipNode.getOwnershipPercentageNode().getValue(), equalTo(new BigDecimal("50")));
        assertThat(ownershipNode2.getOwnershipPercentageNode().getValue(), equalTo(new BigDecimal("50")));
        assertThat(ownershipListNode.getTotalOwnership(), equalTo(new BigDecimal("100")));

    }
}
