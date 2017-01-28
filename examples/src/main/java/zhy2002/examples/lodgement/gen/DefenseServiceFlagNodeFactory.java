package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class DefenseServiceFlagNodeFactory implements ChildNodeFactory<DefenseServiceFlagNode, PropertyNode> {

    @Override
    public DefenseServiceFlagNode create(PropertyNode parent, String name) {
        return new DefenseServiceFlagNode(parent, name);
    }
}
