package zhy2002.neutron.anz.loanapplication.brokerdetails.addresses;

import zhy2002.neutron.anz.common.addresses.BaseAddressNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.country.CountryNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.postcode.PostcodeNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.state.StateNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.stdaddress.StdAddressNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.towncity.TownCityNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class AddressNode extends BaseAddressNode<AddressesNode, AddressNode> {

    private StdAddressNode stdAddress;
    private TownCityNode townCity;
    private StateNode stateNode;
    private PostcodeNode postcode;
    private CountryNode countryNode;

    protected AddressNode(AddressesNode parent) {
        super(parent);
    }

    protected AddressNode(UiNodeContext context) {
        super(context);
    }

    @Override
    public StdAddressNode getStdAddress() {
        return stdAddress;
    }

    @Override
    public TownCityNode getTownCity() {
        return townCity;
    }

    @Override
    public StateNode getState() {
        return stateNode;
    }

    @Override
    public PostcodeNode getPostcode() {
        return postcode;
    }

    @Override
    public CountryNode getCountry() {
        return countryNode;
    }
}
