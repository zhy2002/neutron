package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EmploymentEndedNodeFactory implements ChildNodeFactory<EmploymentEndedNode, EmployedNode> {

    @Override
    public EmploymentEndedNode create(EmployedNode parent, String name) {
        return new EmploymentEndedNode(parent, name);
    }
}
