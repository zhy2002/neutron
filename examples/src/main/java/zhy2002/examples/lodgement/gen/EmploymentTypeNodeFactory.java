package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EmploymentTypeNodeFactory implements ChildNodeFactory<EmploymentTypeNode, EmploymentNode<?>> {

    @Override
    public EmploymentTypeNode create(EmploymentNode<?> parent, String name) {
        return new EmploymentTypeNode(parent, name);
    }
}
