package zhy2002.neutron.anz.common.addresses.country;

import zhy2002.neutron.anz.common.addresses.BaseAddressNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by ZHY on 23/10/2016.
 */
public abstract class BaseCountryNode<P extends BaseAddressNode<?, ?>> extends StringUiNode<P> {

    protected BaseCountryNode(P parent) {
        super(parent);
    }

    protected BaseCountryNode(UiNodeContext context) {
        super(context);
    }
}
