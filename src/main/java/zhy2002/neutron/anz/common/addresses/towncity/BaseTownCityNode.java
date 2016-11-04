package zhy2002.neutron.anz.common.addresses.towncity;

import zhy2002.neutron.anz.common.addresses.BaseAddressNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by ZHY on 23/10/2016.
 */
public class BaseTownCityNode<P extends BaseAddressNode<?, ?>> extends StringUiNode<P> {


    protected BaseTownCityNode(P parent) {
        super(parent);
    }

    protected BaseTownCityNode(UiNodeContext context) {
        super(context);
    }
}
