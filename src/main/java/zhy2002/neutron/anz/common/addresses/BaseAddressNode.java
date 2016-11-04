package zhy2002.neutron.anz.common.addresses;

import zhy2002.neutron.anz.common.addresses.country.BaseCountryNode;
import zhy2002.neutron.anz.common.addresses.postcode.BasePostcodeNode;
import zhy2002.neutron.anz.common.addresses.state.BaseStateNode;
import zhy2002.neutron.anz.common.addresses.stdaddress.BaseStdAddressNode;
import zhy2002.neutron.anz.common.addresses.towncity.BaseTownCityNode;
import zhy2002.neutron.uinode.CompositeUiNode;
import zhy2002.neutron.uinode.ParentUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public abstract class BaseAddressNode<P extends ParentUiNode<?>, T extends BaseAddressNode<P, T>> extends CompositeUiNode<P> {

    public abstract BaseStdAddressNode<T> getStdAddress();

    public abstract BaseTownCityNode<T> getTownCity();

    public abstract BaseStateNode<T> getState();

    public abstract BasePostcodeNode<T> getPostcode();

    public abstract BaseCountryNode<T> getCountry();

    protected BaseAddressNode(P parent) {
        super(parent);
    }

    protected BaseAddressNode(UiNodeContext context) {
        super(context);
    }
}
