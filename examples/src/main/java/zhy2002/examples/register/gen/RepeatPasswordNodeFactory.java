package zhy2002.examples.register.gen;

import zhy2002.neutron.ChildNodeFactory;

public class RepeatPasswordNodeFactory implements ChildNodeFactory<RepeatPasswordNode, RegisterNode> {

    @Override
    public RepeatPasswordNode create(RegisterNode parent, String name) {
        return new RepeatPasswordNode(parent, name);
    }

}
