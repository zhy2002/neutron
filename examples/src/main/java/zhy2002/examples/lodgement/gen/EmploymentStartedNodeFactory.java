package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EmploymentStartedNodeFactory implements ChildNodeFactory<EmploymentStartedNode, EmployedNode> {

    @Override
    public EmploymentStartedNode create(EmployedNode parent, String name) {
        return new EmploymentStartedNode(parent, name);
    }
}
