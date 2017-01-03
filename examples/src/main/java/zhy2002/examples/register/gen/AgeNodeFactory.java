package zhy2002.examples.register.gen;

import zhy2002.neutron.*;

public class AgeNodeFactory implements ChildNodeFactory<AgeNode, RegisterNode> {

    @Override
    public AgeNode create(RegisterNode parent, String name) {
        return new AgeNode(parent, name);
    }
}
