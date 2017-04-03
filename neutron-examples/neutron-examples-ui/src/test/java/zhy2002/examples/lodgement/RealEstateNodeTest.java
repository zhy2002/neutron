package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.di.ApplicationNodeFactory;
import zhy2002.examples.lodgement.gen.node.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class RealEstateNodeTest {

    private ApplicationNode applicationNode;
    private RealEstateListNode realEstateListNode;

    @Before
    public void setup() {
        applicationNode = ApplicationNodeFactory.create();
        realEstateListNode = applicationNode.getRealEstateListNode();
    }

    @Test
    public void defaultNodeLabelIsSet() {
        RealEstateNode realEstateNode = realEstateListNode.createItem();

        assertThat(realEstateNode.getNodeLabel(), equalTo("[Real Estate 2]")); //first one is automatically created

        AddressNode<?> addressNode = realEstateNode.getPropertyNode().getPropertyAddressNode();
        addressNode.getAddressLineNode().setValue("1 Smith St.");

        assertThat(realEstateNode.getNodeLabel(), equalTo("1 Smith St."));

        addressNode.getSuburbNode().setValue("Sydney");
        assertThat(realEstateNode.getNodeLabel(), equalTo("1 Smith St. Sydney"));
    }

    @Test
    public void shouldNotHaveNullOwnershipReference() {
        PersonNode personNode = applicationNode.getPersonListNode().createItem();
        assertThat(realEstateListNode.getItemCount(), equalTo(1));
        RealEstateNode realEstateNode = realEstateListNode.getItem(0);
        PropertyNode propertyNode = realEstateNode.getPropertyNode();
        OwnershipListNode<?> ownershipListNode = propertyNode.getPropertyOwnershipListNode();
        assertThat(ownershipListNode.getItemCount(), equalTo(1));
        assertThat(ownershipListNode.getItem(0).getApplicantReferenceNode().getValue(), notNullValue());
    }
}
