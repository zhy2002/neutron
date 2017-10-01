package zhy2002.mortgage.application.node;

import jsinterop.annotations.JsMethod;
import zhy2002.mortgage.application.data.Address;
import zhy2002.mortgage.application.gen.node.*;
import zhy2002.mortgage.application.shared.NodeUtil;
import zhy2002.neutron.core.di.Owner;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddressRefListNodeImpl extends AddressRefListNode {

    @Inject
    public AddressRefListNodeImpl(@Owner ApplicationNode parent) {
        super(parent);
    }

    @JsMethod
    public AddressNode<?>[] getUniqueAddressNodes() {

        List<AddressNode<?>> result = new ArrayList<>();
        Set<Address> hashSet = new HashSet<>();
        for (int i = 0; i < getItemCount(); i++) {
            AddressNode<?> child = (AddressNode<?>)getItem(i).getReferencedNode();
            if (!child.hasValue())
                continue;

            Address address = NodeUtil.extractAddress(child);
            if (hashSet.contains(address))
                continue;

            hashSet.add(address);
            result.add(child);
        }

        AddressNode<?>[] array = new AddressNode<?>[result.size()];
        result.toArray(array);
        return array;
    }


}
