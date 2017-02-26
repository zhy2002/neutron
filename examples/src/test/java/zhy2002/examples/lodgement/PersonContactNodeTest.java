package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.di.ApplicationNodeFactory;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.node.AddressListNodeImpl;

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
        AddressListNode addressListNode = applicationNode.getAddressListNode();
        assertThat(addressListNode.getItemCount(), equalTo(4));

        personNode.getParent().removeByIndex(0);
        assertThat(addressListNode.getItemCount(), equalTo(0));

        personNode.getParent().createItem();
        personNode.getParent().createItem();
        assertThat(addressListNode.getItemCount(), equalTo(8));
    }

    @Test
    public void addressRefListShouldReportNonEmptyNonDuplicateAddresses() {
        AddressListNodeImpl addressListNode = (AddressListNodeImpl) applicationNode.getAddressListNode();
        assertThat(addressListNode.getUniqueAddressNodes().length, equalTo(0));

        personContactNode.getCurrentAddressNode().getAddressLineNode().setValue("1 John St.");
        assertThat(addressListNode.getUniqueAddressNodes().length, equalTo(1));

        personContactNode.getPostalAddressNode().getPostcodeNode().setValue("2500");
        assertThat(addressListNode.getUniqueAddressNodes().length, equalTo(2));
    }
}
