package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EmploymentStatusNodeFactory implements ChildNodeFactory<EmploymentStatusNode, EmployedNode> {

    @Override
    public EmploymentStatusNode create(EmployedNode parent, String name) {
        return new EmploymentStatusNode(parent, name);
    }
}
