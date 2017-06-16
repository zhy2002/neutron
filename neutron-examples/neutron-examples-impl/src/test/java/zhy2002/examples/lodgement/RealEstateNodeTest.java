package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.CountingChangeListener;
import zhy2002.examples.TestUtil;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.interop.JavaMethods;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RealEstateNodeTest {

    private ApplicationNode applicationNode;
    private RealEstateListNode realEstateListNode;

    @Before
    public void setup() {
        applicationNode = JavaMethods.createApplicationNode(TestUtil.BANK_B, null);
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
        assertThat(realEstateListNode.getItemCount(), equalTo(1));

        PersonNode personNode = applicationNode.getPersonListNode().createItem();
        RealEstateNode realEstateNode = realEstateListNode.getItem(0);
        PropertyNode propertyNode = realEstateNode.getPropertyNode();
        OwnershipListNode<?> ownershipListNode = propertyNode.getPropertyOwnershipListNode();
        assertThat(ownershipListNode.getItemCount(), equalTo(1));
        assertThat(ownershipListNode.getItem(0).getApplicantReferenceNode().getValue(), notNullValue());
        assertThat(ownershipListNode.getItem(0).getApplicantReferenceNode().getReferencedNode(), sameInstance(personNode));
    }

    @Test
    public void shouldUpdateEstimatedValueWhenMarketValueChanges() {
        RealEstateNode realEstateNode = realEstateListNode.getItem(0);
        EstimatedMarketValueNode marketValueNode = realEstateNode.getPropertyNode().getEstimatedMarketValueNode();
        ContractPriceNode contractPriceNode = realEstateNode.getPropertyNode().getContractPriceNode();
        assertThat(marketValueNode.getValue(), nullValue());
        assertThat(contractPriceNode.getValue(), nullValue());

        CountingChangeListener countingChangeListener = new CountingChangeListener();
        marketValueNode.addChangeListener(countingChangeListener);
        contractPriceNode.setText("1100");
        assertThat(countingChangeListener.getCount(), equalTo(1));
        assertThat(marketValueNode.getValue(), equalTo(new BigDecimal("1100")));

        contractPriceNode.setText("1101");
        assertThat(countingChangeListener.getCount(), equalTo(2));
        assertThat(marketValueNode.getValue(), equalTo(new BigDecimal("1101")));
        //ensure text is in sync with value
        assertThat(marketValueNode.getText(), equalTo("1101"));

        marketValueNode.setText("200");
        assertThat(countingChangeListener.getCount(), equalTo(3));
        assertThat(marketValueNode.getValue(), equalTo(new BigDecimal("200")));

        contractPriceNode.setText("1102");
        assertThat(countingChangeListener.getCount(), equalTo(3));
        assertThat(marketValueNode.getValue(), equalTo(new BigDecimal("200")));

    }


}
