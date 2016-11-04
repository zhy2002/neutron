package zhy2002.neutron.anz.common.addresses.postcode;

import zhy2002.neutron.anz.common.addresses.BaseAddressNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by ZHY on 23/10/2016.
 */
public abstract class BasePostcodeNode<P extends BaseAddressNode<?, ?>> extends StringUiNode<P> {


    protected BasePostcodeNode(P parent) {
        super(parent);
    }

    protected BasePostcodeNode(UiNodeContext context) {
        super(context);
    }
}
