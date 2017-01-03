package zhy2002.examples.register.gen;

import zhy2002.neutron.*;

public class PasswordNodeFactory implements ChildNodeFactory<PasswordNode, RegisterNode> {

    @Override
    public PasswordNode create(RegisterNode parent, String name) {
        return new PasswordNode(parent, name);
    }
}
