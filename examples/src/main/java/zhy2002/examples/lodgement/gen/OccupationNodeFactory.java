package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OccupationNodeFactory implements ChildNodeFactory<OccupationNode, EmployedNode> {

    @Override
    public OccupationNode create(EmployedNode parent, String name) {
        return new OccupationNode(parent, name);
    }
}
