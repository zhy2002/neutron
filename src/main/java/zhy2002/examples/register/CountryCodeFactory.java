package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class CountryCodeFactory implements ChildNodeFactory<CountryCodeNode, PhoneInfoNode> {

    @Override
    public CountryCodeNode create(PhoneInfoNode parent, String name) {
        return new CountryCodeNode(parent, name);
    }
}
