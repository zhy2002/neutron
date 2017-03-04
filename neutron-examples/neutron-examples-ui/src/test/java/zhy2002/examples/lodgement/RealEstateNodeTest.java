package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.di.ApplicationNodeFactory;
import zhy2002.examples.lodgement.gen.node.AddressNode;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.RealEstateListNode;
import zhy2002.examples.lodgement.gen.node.RealEstateNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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

        assertThat(realEstateNode.getNodeLabel(), equalTo("[Real Estate 1]"));

        AddressNode<?> addressNode = realEstateNode.getPropertyNode().getPropertyAddressNode();
        addressNode.getAddressLineNode().setValue("1 Smith St.");

        assertThat(realEstateNode.getNodeLabel(), equalTo("1 Smith St."));

        addressNode.getSuburbNode().setValue("Sydney");
        assertThat(realEstateNode.getNodeLabel(), equalTo("1 Smith St. Sydney"));
    }
}
