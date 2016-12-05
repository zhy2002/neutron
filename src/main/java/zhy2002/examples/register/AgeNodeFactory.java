package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class AgeNodeFactory extends ChildNodeFactory<AgeNode, RegisterNode> {
    @Override
    public AgeNode create(RegisterNode parent, String name) {
        return new AgeNode(parent, name);
    }
}