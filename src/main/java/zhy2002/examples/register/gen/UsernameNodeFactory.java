package zhy2002.examples.register.gen;

import zhy2002.neutron.ChildNodeFactory;

public class UsernameNodeFactory implements ChildNodeFactory<UsernameNode, RegisterNode> {

    @Override
    public UsernameNode create(RegisterNode parent, String name) {
        return new UsernameNode(parent, name);
    }

}