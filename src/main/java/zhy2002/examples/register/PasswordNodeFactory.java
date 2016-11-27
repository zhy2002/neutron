package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class PasswordNodeFactory extends ChildNodeFactory<PasswordNode, RegisterNode> {
    @Override
    public PasswordNode create(RegisterNode parent, String name) {
        return new PasswordNode(parent, name);
    }
}
