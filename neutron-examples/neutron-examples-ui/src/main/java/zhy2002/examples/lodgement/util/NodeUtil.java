package zhy2002.examples.lodgement.util;

import zhy2002.examples.lodgement.data.Address;
import zhy2002.examples.lodgement.gen.node.AddressNode;

public class NodeUtil {

    public static Address extractAddress(AddressNode<?> node) {
        Address address = new Address();
        address.setAddressLine(node.getAddressLineNode().getValue());
        address.setSuburb(node.getSuburbNode().getValue());
        address.setPostcode(node.getPostcodeNode().getValue());
        address.setCountry(node.getCountryNode().getValue());
        return address;
    }
}
