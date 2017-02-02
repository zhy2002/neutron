package zhy2002.examples.lodgement.impl;

import jsinterop.annotations.JsMethod;
import zhy2002.examples.lodgement.data.Address;
import zhy2002.examples.lodgement.gen.AddressListNode;
import zhy2002.examples.lodgement.gen.AddressNode;
import zhy2002.examples.lodgement.gen.ApplicationNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddressListNodeImpl extends AddressListNode {

    public AddressListNodeImpl(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public AddressNode<?>[] getUniqueAddressNodes() {

        List<AddressNode<?>> result = new ArrayList<>();
        Set<Address> hashSet = new HashSet<>();
        for (int i = 0; i < getItemCount(); i++) {
            AddressNode<?> child = getItem(i).getRef();
            if (!child.hasValue())
                continue;

            Address address = extractAddress(child);
            if (hashSet.contains(address))
                continue;

            hashSet.add(address);
            result.add(child);
        }

        AddressNode<?>[] array = new AddressNode<?>[result.size()];
        result.toArray(array);
        return array;
    }

    private Address extractAddress(AddressNode<?> node) {
        Address address = new Address();
        address.setAddressLine(node.getAddressLineNode().getValue());
        address.setSuburb(node.getSuburbNode().getValue());
        address.setPostcode(node.getPostcodeNode().getValue());
        address.setCountry(node.getCountryNode().getValue());
        return address;
    }
}
