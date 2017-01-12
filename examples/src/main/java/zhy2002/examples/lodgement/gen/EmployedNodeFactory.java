package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EmployedNodeFactory implements ChildNodeFactory<EmployedNode, EmploymentNode<?>> {

    @Override
    public EmployedNode create(EmploymentNode<?> parent, String name) {
        return new EmployedNode(parent, name);
    }
}
