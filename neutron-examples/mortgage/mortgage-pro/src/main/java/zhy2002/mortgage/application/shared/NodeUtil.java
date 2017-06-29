package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.data.Address;
import zhy2002.mortgage.application.gen.node.AddressNode;
import zhy2002.mortgage.application.gen.node.CompanyListNode;
import zhy2002.mortgage.application.gen.node.PersonListNode;
import zhy2002.mortgage.application.gen.node.RealEstateListNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.UiNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NodeUtil {

    public static Address extractAddress(AddressNode<?> node) {
        Address address = new Address();
        address.setAddressLine(node.getAddressLineNode().getValue());
        address.setSuburb(node.getSuburbNode().getValue());
        address.setPostcode(node.getPostcodeNode().getValue());
        address.setCountry(node.getCountryNode().getValue());
        return address;
    }

    public static boolean hasTab(UiNode<?> node) {
        return node instanceof PersonListNode || node instanceof CompanyListNode || node instanceof RealEstateListNode;
    }

    public static void disableAllSiblings(UiNode<?> node, boolean value, UiNode<?>... except) {
        ParentUiNode<?> productDescriptionNode = node.getParent();
        Set<UiNode<?>> exceptNodes = new HashSet<>();
        exceptNodes.add(node);
        exceptNodes.addAll(Arrays.asList(except));
        for (UiNode<?> sibling : productDescriptionNode.getChildren()) {
            if (exceptNodes.contains(sibling))
                continue;

            if (value) {
                sibling.resetValue();
            }
            sibling.setDisabled(value);
        }
    }

}
