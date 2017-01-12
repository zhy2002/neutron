package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class UnemployedNodeFactory implements ChildNodeFactory<UnemployedNode, EmploymentNode<?>> {

    @Override
    public UnemployedNode create(EmploymentNode<?> parent, String name) {
        return new UnemployedNode(parent, name);
    }
}
