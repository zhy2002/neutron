package zhy2002.examples.register.gen;

import zhy2002.neutron.*;

public class CountryCodeNodeFactory implements ChildNodeFactory<CountryCodeNode, PhoneInfoNode> {

    @Override
    public CountryCodeNode create(PhoneInfoNode parent, String name) {
        return new CountryCodeNode(parent, name);
    }
}
