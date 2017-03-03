package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.di.ApplicationNodeFactory;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.node.AddressRefListNodeImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PersonContactNodeTest {

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
        assertThat(AddressRefListNode.getItemCount(), equalTo(4));

        personNode.getParent().removeByIndex(0);
        assertThat(AddressRefListNode.getItemCount(), equalTo(0));

        personNode.getParent().createItem();
        personNode.getParent().createItem();
        assertThat(AddressRefListNode.getItemCount(), equalTo(8));
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
}
