package zhy2002.examples.register.gen;

import zhy2002.neutron.*;

public class PhoneInfoNodeFactory implements ChildNodeFactory<PhoneInfoNode, RegisterNode> {

    @Override
    public PhoneInfoNode create(RegisterNode parent, String name) {
        return new PhoneInfoNode(parent, name);
    }
}
