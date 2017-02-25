package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class UpdateAddressRefListRule extends UiNodeRule<AddressNode<?>> {

    public UpdateAddressRefListRule(AddressNode<?> owner) {
        super(owner);
    }

    protected AddressNode<?> getAddressNode() {
        return getOwner();
    }
}
