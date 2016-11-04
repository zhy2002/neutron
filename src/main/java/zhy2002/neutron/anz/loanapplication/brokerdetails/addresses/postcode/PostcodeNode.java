package zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.postcode;

import zhy2002.neutron.anz.common.addresses.postcode.BasePostcodeNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.AddressNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class PostcodeNode extends BasePostcodeNode<AddressNode> {
    protected PostcodeNode(AddressNode parent) {
        super(parent);
    }

    protected PostcodeNode(UiNodeContext context) {
        super(context);
    }
}
