package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.data.Address;
import zhy2002.examples.lodgement.gen.node.AddressNode;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNode;

import javax.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
