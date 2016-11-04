package zhy2002.neutron.anz.common.addresses;

import zhy2002.neutron.uinode.ListUiNode;
import zhy2002.neutron.uinode.ParentUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class BaseAddressesNode<P extends ParentUiNode<?>, T extends BaseAddressNode<? extends BaseAddressesNode<P, T>, T>> extends ListUiNode<P, T> {

    protected BaseAddressesNode(P parent) {
        super(parent);
    }

    protected BaseAddressesNode(UiNodeContext context) {
        super(context);
    }


}
