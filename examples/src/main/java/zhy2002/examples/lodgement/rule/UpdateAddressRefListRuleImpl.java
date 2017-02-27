package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.UpdateAddressRefListRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class UpdateAddressRefListRuleImpl extends UpdateAddressRefListRule {

    @Inject
    public UpdateAddressRefListRuleImpl(@Owner AddressNode<?> owner) {
        super(owner);
    }

    //todo this is a hack, rules need proper notification of owner's life cycle
    @Override
    public void addToOwner() {
        super.addToOwner();

        getAddressRefListNode().createItem().setValue(getOwner().getPath());
    }

    @Override
    public void removeFromOwner() {
        super.removeFromOwner();

        AddressRefListNode addressListNode = getAddressRefListNode();
        for (int i = 0; i < addressListNode.getItemCount(); i++) {
            if (addressListNode.getItem(i).getReferencedNode() == getOwner()) {
                addressListNode.removeByIndex(i);
                break;
            }
        }
    }

    private AddressRefListNode getAddressRefListNode() {
        ApplicationNode root = (ApplicationNode)getContext().getRootNode();
        return root.getAddressRefListNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.emptyList();
    }
}
