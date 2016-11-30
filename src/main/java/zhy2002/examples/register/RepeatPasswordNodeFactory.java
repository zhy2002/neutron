package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class RepeatPasswordNodeFactory extends ChildNodeFactory<RepeatPasswordNode, RegisterNode> {
    @Override
    public RepeatPasswordNode create(RegisterNode parent, String name) {
        return new RepeatPasswordNode(parent, name);
    }
}
