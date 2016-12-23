package zhy2002.examples.register.gen;

import zhy2002.neutron.ChildNodeFactory;

public class PhoneNumberNodeFactory implements ChildNodeFactory<PhoneNumberNode, PhoneInfoNode> {

    @Override
    public PhoneNumberNode create(PhoneInfoNode parent, String name) {
        return new PhoneNumberNode(parent, name);
    }
}
