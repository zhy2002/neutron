package zhy2002.mortgage.application.shared;

import com.google.common.base.Strings;
import zhy2002.mortgage.application.data.Address;
import zhy2002.mortgage.application.gen.node.PropertyAddressNode;
import zhy2002.mortgage.application.gen.node.RealEstateNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.rule.AbstractUpdateItemNodeLabelRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

public class UpdateRealEstateNodeLabelRule extends AbstractUpdateItemNodeLabelRule<RealEstateNode> {

    @Inject
    public UpdateRealEstateNodeLabelRule(@Owner RealEstateNode owner) {
        super(owner);
    }

    private PropertyAddressNode getPropertyAddressNode() {
        return getOwner().getPropertyNode().getPropertyAddressNode();
    }

    @Override
    protected boolean filter(UiNodeEvent event) {
        return event.getOrigin().getParent() == getPropertyAddressNode();
    }

    @Override
    protected void updateLabel(UiNodeEvent event) {
        Address address = NodeUtil.extractAddress(getPropertyAddressNode());
        String label = "";
        if (!Strings.isNullOrEmpty(address.getAddressLine())) {
            label += address.getAddressLine() + " ";
        }
        if (!Strings.isNullOrEmpty(address.getSuburb())) {
            label += address.getSuburb() + " ";
        }
        if (!Strings.isNullOrEmpty(address.getPostcode())) {
            label += address.getPostcode();
        }

        if (label.length() > 0) {
            getOwner().setNodeLabel(label.trim());
        } else {
            getOwner().setNodeLabel("[Real Estate " + (Integer.parseInt(getOwner().getName()) + 1) + "]");
        }
    }
}
